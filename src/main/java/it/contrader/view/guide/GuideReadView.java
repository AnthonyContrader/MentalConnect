package it.contrader.view.guide;

import it.contrader.controller.Request;
import it.contrader.dto.GuideDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

/**
 * 
  *Si osservi che alla View arrivano solo oggetti di tipo DTO!
 */
public class GuideReadView extends AbstractView {

	private int idGuide;
	private Request request;
	private final String mode = "READ";

	public GuideReadView() {
	}

	/**
	 * Se la request è null (ovvero quando arriva dal controller con mode GETCHOICE e choice L 
	 * il metodo è vuoto.
	 * 
	 * Altrimenti se arriva con una (ovvero quando arriva
	 * dal controller con mode READ) mostra la Guida. In questo caso torna alla GuideView senza eseguire
	 * gli altri due metodi
	 */
	@Override
	public void showResults(Request request) {
		if (request != null) {
			GuideDTO guide = (GuideDTO) request.get("guide");
			System.out.println(guide);
			MainDispatcher.getInstance().callView("Guide", null);
		}
	}

	
	/**
	 * chiede all'utente di inserire l'id della Guida da leggere
	 */
	@Override
	public void showOptions() {
		System.out.println("Inserisci l'ID della Guida:");
		idGuide = Integer.parseInt(getInput());
	}

	/**
	 * impacchetta una request con l'id della Guida da leggere e la manda al controller tramite il Dispatcher
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("idGuide", idGuide);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Guide", "doControl", request);
	}

}
