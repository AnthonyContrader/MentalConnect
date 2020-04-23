package it.contrader.controller;

import java.util.List;

import it.contrader.dto.FolderDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.FolderService;


public class FolderController implements Controller {
	
	/**
	 * definisce il pacchetto di vista user.
	 */
	private static String sub_package = "folder.";
	
	private FolderService folderService;
	
	public FolderController() {
		this.folderService = new FolderService();
	}
	
	
	
	
	@Override
	public void doControl(Request request) {
		
		
		String mode = (String) request.get("mode");
		
		String choice = (String) request.get("choice");

		
		int idFolder;
		int idUser;
		String nameFolder;
		

		switch (mode) {
		
		
		case "READ":
			idFolder = Integer.parseInt(request.get("idFolder").toString());
			FolderDTO folderDTO = folderService.read(idFolder);
			request.put("folder", folderDTO);
			MainDispatcher.getInstance().callView(sub_package + "FolderRead", request);
			
			break;
		
		
		case "INSERT":
			idUser = Integer.parseInt(request.get("idUser").toString());
			nameFolder = request.get("nameFolder").toString();
			
			
			FolderDTO foldertoinsert = new FolderDTO( nameFolder, idUser );
			
			folderService.insert(foldertoinsert);
			request = new Request();
			request.put("mode", "mode");
			
			MainDispatcher.getInstance().callView(sub_package + "FolderInsert", request);
			break;
		
		
		case "DELETE":
			idFolder = Integer.parseInt(request.get("idFolder").toString());
			
			folderService.delete(idFolder);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "FolderDelete", request);
			break;
		
		
		case "UPDATE":
			idFolder = Integer.parseInt(request.get("idFolder").toString());
			nameFolder = request.get("nameFolder").toString();
			
			FolderDTO foldertoupdate = new FolderDTO(nameFolder, idFolder);
			foldertoupdate.setIdFolder(idFolder);
			folderService.update(foldertoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "FolderUpdate", request);
			break;
			
		 
		case "FOLDERLIST":
	
			List<FolderDTO> foldersDTO = folderService.getAll();
			
			request.put("folders", foldersDTO);
			MainDispatcher.getInstance().callView("Folder", request);
			break;
	
		case "GETCHOICE":
					
					
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "FolderRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "FolderInsert", null);
				break;
				
			case "M":
				MainDispatcher.getInstance().callView(sub_package + "FolderUpdate", null);
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "FolderDelete", null);
				break;
				
				
			case "E":
				MainDispatcher.getInstance().callView("Login", null);
				break;

			case "B":
				MainDispatcher.getInstance().callView("HomeAdmin", null);
				break;
				
			default:
				MainDispatcher.getInstance().callView("Login", null);
			}
			
		default:
			MainDispatcher.getInstance().callView("Login", null);
		
		}
	}
	

}
