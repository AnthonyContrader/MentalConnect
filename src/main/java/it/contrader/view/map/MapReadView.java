package it.contrader.view.map;

import it.contrader.controller.Request;
import it.contrader.dto.MapDTO;
import it.contrader.view.AbstractView;
import it.contrader.main.MainDispatcher;

public class MapReadView extends AbstractView {
	
	private int id;
	private Request request;
	private final String mode = "READ";
	
	public MapReadView() {
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
			MapDTO map = (MapDTO) request.get("map");
			System.out.println(map);
			MainDispatcher.getInstance().callView("Map", null);
		}
	}
	
	/**
	 * chiede all'utente di inserire l'id dell'utente da leggere
	 */
	@Override
	public void showOptions() {
		System.out.println("Inserisci l'ID della mappa:");
		id = Integer.parseInt(getInput());
	}

	/**
	 * impacchetta una request con l'id della mappa da leggere e la manda al controller tramite il Dispatcher
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Map", "doControl", request);
	}

}

	
	

