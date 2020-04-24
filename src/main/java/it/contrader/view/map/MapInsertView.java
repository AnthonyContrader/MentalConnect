package it.contrader.view.map;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class MapInsertView extends AbstractView{
	private Request request;
	private int idFolder;
	private String mapName;
	private final String mode = "INSERT";

	public MapInsertView() {
	}
	
	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode INSERT del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Map", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi della mappa da inserire
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci il nome della mappa:");
			mapName = getInput();
			System.out.println("Inserisci l'ID della cartella:");
			idFolder = Integer.parseInt(getInput());
	}

	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("idFolder", idFolder);
		request.put("mapName", mapName);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Map", "doControl", request);
	}


}

