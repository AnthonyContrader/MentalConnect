package it.contrader.view.map;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class MapUpdateView extends AbstractView {
	private Request request;

	private int id;
	private String mapName;
	private final String mode = "UPDATE";
    private int idFolder;
    
	public MapUpdateView() {
	}

	/**
	 * Se la request non � nulla (ovvero se si arriva dalla mode UPDATE del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Map", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi dell'utente da modificare
	 */
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserisci id mappa:");
			id = Integer.parseInt(getInput());
			System.out.println("Inserisci il nome della mappa:");
			mapName = getInput();
			System.out.println("Inserisci id della cartella:");
			idFolder = Integer.parseInt(getInput());
			
		} catch (Exception e) {

		}
	}


	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("id", id);
		request.put("mapName", mapName);
		request.put("idFolder", idFolder);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Map", "doControl", request);
	}

}
