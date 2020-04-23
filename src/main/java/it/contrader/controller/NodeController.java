package it.contrader.controller;

import java.util.List;

import it.contrader.dto.NodeDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.NodeService;

public class NodeController implements Controller{
private static String sub_package = "user.";
	
	private NodeService nodeService;
	/**
	 * Costruisce un oggetto di tipo UserService per poterne usare i metodi
	 */
	public NodeController() {
		this.nodeService = new NodeService();
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
		int id, idMap;
		String text;
		

		switch (mode) {
		
		// Arriva qui dalla NodeReadView. Invoca il Service con il parametro id e invia alla NodeReadView un nodo da mostrare 
		case "READ":
			id = Integer.parseInt(request.get("id").toString());
			NodeDTO nodeDTO = nodeService.read(id);
			request.put("node", nodeDTO);
			MainDispatcher.getInstance().callView(sub_package + "NodeRead", request);
			break;
		
		case "INSERT":
			text = request.get("text").toString();
			idMap = Integer.parseInt(request.get("idMap").toString());
						
			//costruisce l'oggetto user da inserire
			NodeDTO nodetoinsert = new NodeDTO(text, idMap);

			nodeService.insert(nodetoinsert);
			request = new Request();
			request.put("mode", "mode");
			//Rimanda alla view con la risposta
			MainDispatcher.getInstance().callView(sub_package + "UserInsert", request);
			break;
		
		case "DELETE":
			id = Integer.parseInt(request.get("id").toString());
			//Qui chiama il service
			nodeService.delete(id);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "UserDelete", request);
			break;
		
		case "UPDATE":
			id = Integer.parseInt(request.get("id").toString());
			text = request.get("text").toString();
			idMap =  Integer.parseInt(request.get("idMap").toString());
			
			NodeDTO nodetoupdate = new NodeDTO(id, text, idMap);
			nodeService.update(nodetoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "UserUpdate", request);
			break;
			
		//Arriva qui dalla UserView Invoca il Service e invia alla UserView il risultato da mostrare 
		case "NODELIST":
			List<NodeDTO> nodesDTO = nodeService.getAll();
			//Impacchetta la request con la lista degli user
			request.put("nodes", nodesDTO);
			MainDispatcher.getInstance().callView("Node", request);
			break;
			
		//Esegue uno switch sulla base del comando inserito dall'utente e reindirizza tramite il Dispatcher alla View specifica per ogni operazione
		//con REQUEST NULL (vedi una View specifica)
		case "GETCHOICE":
					
					//toUpperCase() mette in maiuscolo la scelta
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "NodeRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "NodeInsert", null);
				break;
				
			case "M":
				MainDispatcher.getInstance().callView(sub_package + "NodeUpdate", null);
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "NodeDelete", null);
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
