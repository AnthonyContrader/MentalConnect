package it.contrader.view.folder;

import it.contrader.controller.Request;
import it.contrader.dto.FolderDTO;

import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class FolderReadView extends AbstractView {
	private int idFolder;
	
	private Request request;
	
	private final String mode = "READ";
	
	
public  FolderReadView() { 
	
}

public void showResults(Request request) {
	if (request != null) {
		FolderDTO idFolder = (FolderDTO) request.get("idFolder");
		System.out.println(idFolder);
		MainDispatcher.getInstance().callView("Folder", null);
	}
}




@Override
public void showOptions() {
	System.out.println("Inserisci l'ID della cartella:");
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
