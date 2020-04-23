package it.contrader.controller;

import java.util.List;

import it.contrader.dto.MapDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.MapService;


public class MapController implements Controller {
	
	/**
	 * definisce il pacchetto di vista map.
	 */
	private static String sub_package = "map.";
	
	private MapService mapService;
	/**
	 * Costruisce un oggetto di tipo MapService per poterne usare i metodi
	 */
	public MapController() {
		this.mapService = new MapService();
	}
	
	/**
	 * Metodo dell'interfaccia Controller. Estrae dalla request la mode
	 * (che riceve dalle view specifiche e può essere la richesta di una 
	 * scelta da parte dell'utente "GETCHOICE") e la scelta dell'utente.
	 * 
	 * Se la modalità corrisponde ad una CRUD il controller chiama i service,
	 * altrimenti rimanda alla View della CRUD per richiedere i parametri
	 */
	@Override
	public void doControl(Request request) {
		
		//Estrae dalla request mode e choice
		String mode = (String) request.get("mode");
		
		String choice = (String) request.get("choice");

		//Definisce i campi della classe (serviranno sempre, tanto vale definirli una sola volta)
		int id;
		String mapName;
		int idCartella;

		switch (mode) {
		
		// Arriva qui dalla UserReadView. Invoca il Service con il parametro id e invia alla UserReadView uno user da mostrare 
		case "READ":
			id = Integer.parseInt(request.get("id").toString());
			MapDTO mapDTO = mapService.read(id);
			request.put("map", mapDTO);
			MainDispatcher.getInstance().callView(sub_package + "MapRead", request);
			break;
		
		// Arriva qui dalla UserInsertView. Estrae i parametri da inserire e chiama il service per inserire uno user con questi parametri
		case "INSERT":
			mapName = request.get("mapName").toString();
			idCartella = Integer.parseInt(request.get("idCartella").toString());
			
			//costruisce l'oggetto user da inserire
			MapDTO maptoinsert = new MapDTO(idCartella, mapName);
			//invoca il service
			mapService.insert(maptoinsert);
			request = new Request();
			request.put("mode", "mode");
			//Rimanda alla view con la risposta
			MainDispatcher.getInstance().callView(sub_package + "MapInsert", request);
			break;
		
		// Arriva qui dalla UserDeleteView. Estrae l'id dell'utente da cancellare e lo passa al Service
		case "DELETE":
			id = Integer.parseInt(request.get("id").toString());
			//Qui chiama il service
			mapService.delete(id);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "MapDelete", request);
			break;
		
		// Arriva qui dalla UserUpdateView
		case "UPDATE":
			id = Integer.parseInt(request.get("id").toString());
			mapName = request.get("mapName").toString();
			idCartella = Integer.parseInt(request.get("idCartella").toString());
			
			MapDTO maptoupdate = new MapDTO(id, idCartella, mapName);
			maptoupdate.setMapName("mapName");
			mapService.update(maptoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "MapUpdate", request);
			break;
			
		//Arriva qui dalla UserView Invoca il Service e invia alla UserView il risultato da mostrare 
		case "MAPLIST":
			List<MapDTO> mapsDTO = mapService.getAll();
			//Impacchetta la request con la lista degli user
			request.put("maps", mapsDTO);
			MainDispatcher.getInstance().callView("Map", request);
			break;
			
		//Esegue uno switch sulla base del comando inserito dall'utente e reindirizza tramite il Dispatcher alla View specifica per ogni operazione
		//con REQUEST NULL (vedi una View specifica)
		case "GETCHOICE":
					
					//toUpperCase() mette in maiuscolo la scelta
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "MapRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "MapInsert", null);
				break;
				
			case "M":
				MainDispatcher.getInstance().callView(sub_package + "MapUpdate", null);
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "MapDelete", null);
				break;
				
			case "E":
				MainDispatcher.getInstance().callView("Login", null);
				break;

			case "B":
				MainDispatcher.getInstance().callView("HomeAdmin", null);
				break;
				
			default:
				MainDispatcher.getInstance().callView("Login", null);
			}
			
		default:
			MainDispatcher.getInstance().callView("Login", null);
		}
	}
}




