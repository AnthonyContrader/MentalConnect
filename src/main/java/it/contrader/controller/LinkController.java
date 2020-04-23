package it.contrader.controller;

import java.util.List;

import it.contrader.dto.LinkDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.LinkService;

public class LinkController implements Controller {


	/**
	 * definisce il pacchetto di vista link.
	 */
	private static String sub_package = "link.";
	
	private LinkService linkService;
	/**
	 * Costruisce un oggetto di tipo UserService per poterne usare i metodi
	 */
	public LinkController() {
		this.linkService = new LinkService();
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
		int idNode1;
		int idNode2;

		switch (mode) {
		
		// Arriva qui dalla LinkReadView. Invoca il Service con il parametro id e invia alla LinkReadView uno user da mostrare 
		case "READ":
			idNode1 = Integer.parseInt(request.get("idNode1").toString());
			idNode2 = Integer.parseInt(request.get("idNode2").toString());
			LinkDTO linkDTO = linkService.read(idNode1, idNode2);
			request.put("link", linkDTO);
			MainDispatcher.getInstance().callView(sub_package + "LinkRead", request);
			break;
		
		// Arriva qui dalla LinkInsertView. Estrae i parametri da inserire e chiama il service per inserire un link con questi parametri
		case "INSERT":
			idNode1 = Integer.parseInt(request.get("idNode1").toString());
			idNode2 = Integer.parseInt(request.get("idNode2").toString());
			
			//costruisce l'oggetto user da inserire
			LinkDTO linktoinsert = new LinkDTO(idNode1, idNode2);
			//invoca il service
			linkService.insert(linktoinsert);
			request = new Request();
			request.put("mode", "mode");
			//Rimanda alla view con la risposta
			MainDispatcher.getInstance().callView(sub_package + "LinkInsert", request);
			break;
		
		// Arriva qui dalla LinkDeleteView. Estrae gli ID dei link da cancellare e li passa al Service
		case "DELETE":
			idNode1 = Integer.parseInt(request.get("idNode1").toString());
			idNode2 = Integer.parseInt(request.get("idNode2").toString());
			//Qui chiama il service
			linkService.delete(idNode1, idNode2);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "LinkDelete", request);
			break;
		
		// Arriva qui dalla LinkUpdateView
		case "UPDATE":
			
			break;
			
		//Arriva qui dalla LinkView Invoca il Service e invia alla LinkView il risultato da mostrare 
		case "LINKLIST":
			List<LinkDTO> linksDTO = linkService.getAll();
			//Impacchetta la request con la lista dei link
			request.put("links", linksDTO);
			MainDispatcher.getInstance().callView("Link", request);
			break;
			
		//Esegue uno switch sulla base del comando inserito dall'utente e reindirizza tramite il Dispatcher alla View specifica per ogni operazione
		//con REQUEST NULL (vedi una View specifica)
		case "GETCHOICE":
					
					//toUpperCase() mette in maiuscolo la scelta
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "LinkRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "LinkInsert", null);
				break;
				
			case "M":
				
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "LinkDelete", null);
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
