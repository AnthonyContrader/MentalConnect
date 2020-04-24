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
	 * Mostra la lista delle mappe
	 */
	@Override
	public void showResults(Request request) {
		if (request != null) {
			System.out.println("\n------------------- Gestione mappe ----------------\n");
			System.out.println("ID\tMapname\t\tID_Folder");
			System.out.println("----------------------------------------------------\n");
			
			@SuppressWarnings("unchecked")
			List<MapDTO> maps = (List<MapDTO>) request.get("maps");
			for (MapDTO m: maps)
				System.out.println(m);
			System.out.println();
		}
	}

	/**
	 * Chiede all'utente un input (lettera da tastiera) per la choice (vedi MapController). 
	 * Mette la modalità GETCHOICE nella mode.
	 */
	@Override
	public void showOptions() {
		System.out.println("          Scegli l'operazione da effettuare:");
		System.out.println("[L]eggi [I]nserisci [M]odifica [C]ancella [B]ack [E]sci");

		choice = getInput();

		
	}
	
	/**
	 * Impacchetta la request e la manda al MapController.
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "GETCHOICE");
		MainDispatcher.getInstance().callAction("Map", "doControl", this.request);
	}

	
}
