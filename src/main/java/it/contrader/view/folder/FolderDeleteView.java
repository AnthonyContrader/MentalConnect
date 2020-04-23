package it.contrader.view.folder;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;



public class FolderDeleteView extends AbstractView{
	
	private Request request;
	private int idFolder;
	private final String mode = "DELETE";
	
	
	public FolderDeleteView() {
	}

	
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Folder", null);
		}
	}

	
	@Override
	public void showOptions() {
			System.out.println("Inserisci id della cartella:");
			idFolder = Integer.parseInt(getInput());

	}

	
	@Override
	public void submit() {
		request = new Request();
		request.put("idFolder", idFolder);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Folder", "doControl", request);
	}



}
