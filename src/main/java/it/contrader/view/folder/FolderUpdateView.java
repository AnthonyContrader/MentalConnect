package it.contrader.view.folder;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class FolderUpdateView extends AbstractView {
	
	private Request request;
	
	private int idFolder;
	private int idUser;
	private String nameFolder;
	private final String mode="UPDATE";
	
	
	public FolderUpdateView() {
	}

	
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Folder", null);
		}
	}

	
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserisci id della cartella:");
			idFolder = Integer.parseInt(getInput());
			System.out.println("Inserisci id dell'utente:");
			idUser = Integer.parseInt(getInput());
			System.out.println("Inserisci nome della cartella:");
			nameFolder = getInput();
			
		} catch (Exception e) {

		}
	}


	
	@Override
	public void submit() {
		request = new Request();
		request.put("idFolder", idFolder);
		request.put("idUser", idUser);
		request.put("nameFolder", nameFolder);
		
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Folder", "doControl", request);
	}

}
