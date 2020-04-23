package it.contrader.view.link;

import it.contrader.controller.Request;
import it.contrader.dto.LinkDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class LinkReadView extends AbstractView {

	private int idNode1;
	private int idNode2;
	private Request request;
	private final String mode = "READ";

	public LinkReadView() {
	}

	/**
	 * Se la request è null (ovvero quando arriva dal controller con mode GETCHOICE e choice L 
	 * il metodo è vuoto.
	 * 
	 * Altrimenti se arriva con uno user nella request (ovvero quando arriva
	 * dal controller con mode READ) mostra lo user. In questo caso torna alla UserView senza eseguire
	 * gli altri due metodi
	 */
	@Override
	public void showResults(Request request) {
		if (request != null) {
			LinkDTO link = (LinkDTO) request.get("link");
			System.out.println(link);
			MainDispatcher.getInstance().callView("Link", null);
		}
	}

	
	/**
	 * chiede all'utente di inserire l'id dell'utente da leggere
	 */
	@Override
	public void showOptions() {
		System.out.println("Inserisci l'ID del nodo di partenza:");
		idNode1 = Integer.parseInt(getInput());
		System.out.println("Inserisci l'ID del nodo di arrivo:");
		idNode2 = Integer.parseInt(getInput());
	}

	/**
	 * impacchetta una request con l'id dell'utente da leggere e la manda al controller tramite il Dispatcher
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
