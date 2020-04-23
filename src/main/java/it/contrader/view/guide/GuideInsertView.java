package it.contrader.view.guide;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class GuideInsertView extends AbstractView{
	private Request request;

	private String question;
	private String answer;
	
	private final String mode = "INSERT";

	public GuideInsertView() {
	}
	
	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode INSERT del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Inserimento andato a buon fine.\n");
			MainDispatcher.getInstance().callView("Guide", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi dell'utente da inserire
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci nuova Domanda: ");
			question = getInput();
			System.out.println("Inserisci nuova Risposta:");
			answer = getInput();
			
	}

	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("question", question);
		request.put("answer", answer);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Guide", "doControl", request);
	}


}