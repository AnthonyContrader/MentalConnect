package it.contrader.view;
import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.NodeDTO;
import it.contrader.main.MainDispatcher;

public class NodeView extends AbstractView{

	String choice;
	private Request request;

	@Override
	public void showResults(Request request) {
		if(request!=null) {	
			System.out.println("\n------------------- Gestione cartelle ----------------\n");
			System.out.println("ID cartella\tID user\tNome cartella");
			System.out.println("----------------------------------------------------\n");
			
			
			@SuppressWarnings("unchecked")
			List<NodeDTO> nodes = (List<NodeDTO>) request.get("nodes");
			for (NodeDTO u: nodes)
				System.out.println(u);
			System.out.println();
		
    	}
	}

	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");
		choice = this.getInput();
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Node", "doControl", this.request);
	}
	
	
}
