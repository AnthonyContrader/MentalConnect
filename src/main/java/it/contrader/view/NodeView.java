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
			System.out.println("-------------MENU NODO------------\n");
			
			@SuppressWarnings("unchecked")
			List<NodeDTO> nodes = (List<NodeDTO>) request.get("nodes");
			for (NodeDTO u: nodes)
				System.out.println(u);
			System.out.println();
		
    	}
	}

	@Override
	public void showOptions() {
		System.out.println("L[eggi] [I]nserisci nodo [C]ancella nodo [M]odifica nodo [E]sci [B]ack");
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
