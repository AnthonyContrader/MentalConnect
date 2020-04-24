package it.contrader.view;

import java.util.List;

import it.contrader.controller.Request;
import it.contrader.dto.GuideDTO;
import it.contrader.main.MainDispatcher;

public class GuideView extends AbstractView {

	private Request request;
	private String choice;

	public GuideView() {
		
	}

	/**
	 * Mostra la lista guide
	 */
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Gestione Guide ----------------\n");
			System.out.println("IdGuide\t \t Question\t \t Answer");
			System.out.println("----------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<GuideDTO> guide = (List<GuideDTO>) request.get("guide");
			for (GuideDTO u: guide)
				System.out.println(u);
			System.out.println();
		}
	}

	/**
	 * Chiede all'utente un input (lettera da tastiera) per la choice (vedi GuideController). 
	 * Mette la modalità GETCHOICE nella mode.
	 */
	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		this.choice = getInput();

		
	}
	
	/**
	 * Impacchetta la request e la manda allo GuideController.
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Guide", "doControl", this.request);
	}

}

