package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.LinkDTO;
import it.contrader.main.MainDispatcher;

public class LinkView extends AbstractView {
	
	private String choice;
	private Request request;
	
	@Override
	public void showResults(Request request) {
		if(request!=null) {
	    	System.out.println("\n---------------- Gestione Collegamento -------------\n");
	    	System.out.println("Nodo 1\t\tNodo 2");
			System.out.println("----------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<LinkDTO> links = (List<LinkDTO>) request.get("links");
			for (LinkDTO l: links)
				System.out.println(l);
			System.out.println();
	    }
	}

	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare su i collegamenti:");
		System.out.println("[L]eggi [I]nserisci [C]ancella [B]ack [E]sci");

        choice = this.getInput();
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Link", "doControl", this.request);
	}

}
