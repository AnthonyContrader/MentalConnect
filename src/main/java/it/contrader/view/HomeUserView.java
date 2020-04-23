package it.contrader.view;


import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeUserView extends AbstractView{

	String choice;
	private Request request;

	@Override
	public void showResults(Request request) {
		if(request!=null) {
	    	System.out.println("\n Benvenuto in MENTAL CONNECT "+request.get("username").toString() + "\n");
	    	}
	}

	@Override
	public void showOptions() {
		System.out.println("-------------MENU------------\n");
		choice = this.getInput();

	}

	@Override
	public void submit() {

		switch (choice) {
		case "i":
        	this.request.put("mode", "");
        	MainDispatcher.getInstance().callAction("User", "doControl", request);
        	break;
 
		case "e":
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
			break;

		default:
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
		}
	}

}
