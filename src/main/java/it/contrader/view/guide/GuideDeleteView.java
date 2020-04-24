package it.contrader.view.guide;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;
import it.contrader.view.AbstractView;

public class GuideDeleteView extends AbstractView {
	private Request request;

	private int idGuide;
	private final String mode = "DELETE";

	public GuideDeleteView() {
	}

	/**
	 * Se la request non è nulla (ovvero se si arriva dalla mode DELETE del controller) mostra
	 * l'esito dell'operazione
	 */
	@Override
	public void showResults(Request request) {
		if (request!=null) {
			System.out.println("Cancellazione andata a buon fine.\n");
			MainDispatcher.getInstance().callView("Guide", null);
		}
	}

	/**
	 * Chiede all'utente di inserire l'id della guida da cancellare
	 */
	@Override
	public void showOptions() {
			System.out.println("Inserisci id della Guida:");
			idGuide = Integer.parseInt(getInput());

	}

	/**
	 * impacchetta la request con l'id della guida da cancellare
	 */
	@Override
	public void submit() {
		request = new Request();
		request.put("idGuide", idGuide);
		request.put("mode", mode);
		MainDispatcher.getInstance().callAction("Guide", "doControl", request);
	}


}
