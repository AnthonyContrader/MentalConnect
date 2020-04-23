package it.contrader.view.link;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class LinkInsertView extends AbstractView{
	private Request request;

	private int idNode1;
	private int idNode2;
	private final String mode = "INSERT";

	public LinkInsertView() {
	}
	
	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode INSERT del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Link", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi dell'utente da inserire
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci l'ID del nodo di partenza:");
			idNode1 = Integer.parseInt(getInput());
			System.out.println("Inserisci l'ID del nodo di arrivo:");
			idNode2 = Integer.parseInt(getInput());
	}

	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("idNode1", idNode1);
		request.put("idNode2", idNode2);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Link", "doControl", request);
	}


}
