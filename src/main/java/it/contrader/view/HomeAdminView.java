/**
 * Manage a Business Owner view
 */

package it.contrader.view;


/**
 * Per Ulteriori dettagli vedi Guida sez 9 View.
 * Per la descrizione dei metodi vedi l'interfaccia View in questo pacchetto.
 */
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeAdminView extends AbstractView {

    private String choice;
    
	private Request request;

	/**
	 * Se la request non è nulla mostra un messaggio di benvenuto
	 */
    public void showResults(Request request) {
    	if(request!=null) {
    	System.out.println("\n Benvenuto in MentalConnect "+request.get("username").toString() + "\n");
    	}
    }


    /**
     * Chiede all'utente di effettuare una scelta (da console)
     */
    public void showOptions() {
        System.out.println("--------------------   MENU     --------------------\n");
        System.out.println(" Seleziona cosa vuoi gestire:");
        System.out.println("[U]sers [F]olders [M]ap [N]ode [L]ink [G]uide [E]sci");
        //Il metodo che salva l'input nella stringa choice.
        //getInput() è definito in AbstractView.
        choice = this.getInput();
    }

    /**
     * Impacchetta una request (in base alla scelta sarà diversa) che invia ai controller tramite il
     * Dispatcher
     */
    public void submit() {    
    	//crea una nuova Request (vedi classe Request)
    	request = new Request();
        switch (choice) {
        case "f":
        	this.request.put("mode", "FOLDERLIST");
        	MainDispatcher.getInstance().callAction("Folder", "doControl", request);
        	break;
        case "m":
        	this.request.put("mode", "MAPLIST");
        	MainDispatcher.getInstance().callAction("Map", "doControl", request);
        	break;
        case "n":
        	this.request.put("mode", "NODELIST");
        	MainDispatcher.getInstance().callAction("Node", "doControl", request);
        	break;
        case "l":
        	this.request.put("mode", "LINKLIST");
        	MainDispatcher.getInstance().callAction("Link", "doControl", request);
        	break;
        case "g":
        	this.request.put("mode", "GUIDELIST");
        	MainDispatcher.getInstance().callAction("Guide", "doControl", request);
        	break;
        case "u":
        	this.request.put("mode", "USERLIST");
        	MainDispatcher.getInstance().callAction("User", "doControl", request);
        	break;
        case "e":
        	MainDispatcher.getInstance().callAction("Login", "doControl", null);
        	break;
        default:
        	System.out.println("La voce: "+choice+" non è valida.");
            MainDispatcher.getInstance().callView("HomeAdmin", null);
        }
    }
}
