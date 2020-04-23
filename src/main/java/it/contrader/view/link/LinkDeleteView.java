package it.contrader.view.link;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class LinkDeleteView extends AbstractView {
	private Request request;

	private int idNode1;
	private int idNode2;
	private final String mode = "DELETE";

	public LinkDeleteView() {
	}

	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode DELETE del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Link", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli id dei nodi collegati dal link da cancellare
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci id del nodo 1:");
			idNode1 = Integer.parseInt(getInput());
			System.out.println("Inserisci id del nodo 2:");
			idNode2 = Integer.parseInt(getInput());

	}

	/**
	 * impacchetta la request con l'id dell'utente da cancellare
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
