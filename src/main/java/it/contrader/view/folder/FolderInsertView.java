package it.contrader.view.folder;
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;



public class FolderInsertView extends AbstractView {
	
	private Request request;
	private String nameFolder;
	private int idUser;
	private final String mode = "INSERT";

	
	public FolderInsertView() {
	}
	
	
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Folder", null);
		}
	}

	
	@Override
	public void showOptions() {
			System.out.println("Inserisci ID user:");
			idUser = Integer.parseInt(getInput());
			//idUser = Integer.parseInt(request.get("idUser").toString());
			System.out.println("Inserisci nome cartella:");
			nameFolder = getInput();
			
	}
	@Override
	public void submit() {
		request = new Request();
		request.put("idUser", idUser);
		request.put("nameFolder", nameFolder);
		
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Folder", "doControl", request);
	}


}
