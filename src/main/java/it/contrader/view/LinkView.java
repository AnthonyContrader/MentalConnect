package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class LinkView extends AbstractView {
	
	private String choice;
	private Request request;
	
	@Override
	public void showResults(Request request) {
		if(request!=null) {
	    	System.out.println("\n Gestisci i link\n");
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
