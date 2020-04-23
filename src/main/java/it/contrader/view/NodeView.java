package it.contrader.view;
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class NodeView extends AbstractView{

	String choice;
	private Request request;

	@Override
	public void showResults(Request request) {
		if(request!=null) {	
			System.out.println(" Seleziona cosa vuoi gestire:");
    	}
	}

	@Override
	public void showOptions() {
		System.out.println("-------------MENU NODO------------\n");
		System.out.println("L[eggi] [I]nserisci nodo [C]ancella nodo [M]odifica nodo [C]ancella [E]sci [B]ack");
		choice = this.getInput();
	}

	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("User", "doControl", this.request);
	}
	
	
}
