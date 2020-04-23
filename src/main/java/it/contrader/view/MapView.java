package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.MapDTO;
import it.contrader.main.MainDispatcher;

public class MapView extends AbstractView {
	
	private Request request;
	private String choice;

	public MapView() {
		
	}

	/**
	 * Mostra la lista utenti
	 */
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Gestione mappe ----------------\n");
			System.out.println("ID\tMapName\tidCartella");
			System.out.println("----------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<MapDTO> maps = (List<MapDTO>) request.get("maps");
			for (MapDTO m: maps)
				System.out.println(m);
			System.out.println();
		}
	}

	/**
	 * Chiede all'utente un input (lettera da tastiera) per la choice (vedi UserController). 
	 * Mette la modalità GETCHOICE nella mode.
	 */
	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choice = getInput();

		
	}
	
	/**
	 * Impacchetta la request e la manda allo UserController.
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Map", "doControl", this.request);
	}


}
