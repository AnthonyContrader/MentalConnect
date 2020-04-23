package it.contrader.view.node;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;


public class NodeUpdateView extends AbstractView{
	private Request request;

	private int id;
	private String text;
	private int idMap;
	private final String mode = "UPDATE";

	public NodeUpdateView() {
	}

	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode UPDATE del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Node", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi dell'utente da modificare
	 */
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserisci id del nodo:");
			id = Integer.parseInt(getInput());
			System.out.println("Inserisci testo:");
			text = getInput();
			System.out.println("Inserisci id mappa:");
			idMap = Integer.parseInt(getInput());
			
		} catch (Exception e) {

		}
	}


	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("idNode", id);
		request.put("text", text);
		request.put("idMap", idMap);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Node", "doControl", request);
	}

}
