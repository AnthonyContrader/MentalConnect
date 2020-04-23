package it.contrader.view.node;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class NodeInsertView extends AbstractView{
	private Request request;

	private String text;
	private int idMap;
	private final String mode = "INSERT";

	public NodeInsertView() {
	}
	
	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode INSERT del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Node", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi dell'utente da inserire
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci testo del nodo:");
			text = getInput();
			System.out.println("Inserisci id della mappa:");
			idMap = Integer.parseInt(getInput());
	}

	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("text", text);
		request.put("idMap", idMap);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Node", "doControl", request);
	}
}
