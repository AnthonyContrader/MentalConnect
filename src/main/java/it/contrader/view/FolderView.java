package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.FolderDTO;

import it.contrader.main.MainDispatcher;

public class FolderView extends AbstractView {
	
	private Request request;
	private String choice;
	
	
public FolderView() {
		
	}

	
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Gestione cartelle ----------------\n");
			System.out.println("ID cartella\tID user\tNome cartella");
			System.out.println("----------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<FolderDTO> folder = (List<FolderDTO>) request.get("folders");
			for (FolderDTO u: folder)
				System.out.println(u);
			System.out.println();
		}
	}

	
	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choice = getInput();

		
	}
	
	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Folder", "doControl", this.request);
	}


}
