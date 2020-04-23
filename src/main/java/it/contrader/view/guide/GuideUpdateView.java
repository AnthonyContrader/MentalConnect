package it.contrader.view.guide;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;


public class GuideUpdateView extends AbstractView {
	private Request request;

	private int idGuide;
	private String question;
	private String answer;
	private final String mode = "UPDATE";

	public GuideUpdateView() {
	}

	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode UPDATE del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Modifica andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Guide", null);
		}
	}

	/**
	 * Chiede all'utente di inserire gli attributi della Guida da modificare
	 */
	@Override
	public void showOptions() {
		try {
			System.out.println("Inserisci id della Guida:");
			idGuide = Integer.parseInt(getInput());
			System.out.println("Inserisci la domanda della Guida");
			question = getInput();
			System.out.println("Inserisci la risposta della Guida:");
			question = getInput();
		} catch (Exception e) {

		}
	}


	/**
	 * Impacchetta la request con i dati inseriti nel metodo showOption()
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("id", idGuide);
		request.put("domanda", question);
		request.put("risposta", answer);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Guide", "doControl", request);
	}

}
