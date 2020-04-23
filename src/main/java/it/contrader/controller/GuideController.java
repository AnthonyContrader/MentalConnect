package it.contrader.controller;

import java.util.List;

import it.contrader.dto.GuideDTO;
import it.contrader.main.MainDispatcher;
import it.contrader.service.GuideService;


public class GuideController implements Controller {

	
	private static String sub_package = "guide.";
	
	private GuideService guideService;

	public GuideController() {
		this.guideService = new GuideService();
	}
	
	
	
	@Override
	public void doControl(Request request) {
		
		
		String mode = (String) request.get("mode");
		
		String choice = (String) request.get("choice");

		
		int idGuide;
		String question;
		String answer;


		switch (mode) {
		
		
		case "READ":
			idGuide = Integer.parseInt(request.get("idGuide").toString());
			GuideDTO guideDTO = guideService.read(idGuide);
			request.put("guide", guideDTO);
			MainDispatcher.getInstance().callView(sub_package + "GuideRead", request);
			break;
		
		
		case "INSERT":
			question = request.get("question").toString();
			answer = request.get("answer").toString();
					
	
			GuideDTO guidetoinsert = new GuideDTO(question, answer);
		
			guideService.insert(guidetoinsert);
			request = new Request();
			request.put("mode", "mode");
	
			MainDispatcher.getInstance().callView(sub_package + "GuideInsert", request);
			break;
		
		
		case "DELETE":
			idGuide = Integer.parseInt(request.get("idGuide").toString());
		
			guideService.delete(idGuide);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "GuideDelete", request);
			break;
		
		
		case "UPDATE":
			idGuide = Integer.parseInt(request.get("idGuide").toString());
			question = request.get("question").toString();
			answer = request.get("answer").toString();
			GuideDTO guidetoupdate = new GuideDTO(question, answer);
			guidetoupdate.setIdGuide(idGuide);
			guideService.update(guidetoupdate);
			request = new Request();
			request.put("mode", "mode");
			MainDispatcher.getInstance().callView(sub_package + "GuideUpdate", request);
			break;
			
		 
		case "GUIDELIST":
			List<GuideDTO> guidesDTO = guideService.getAll();
			
			request.put("Guide", guidesDTO);
			MainDispatcher.getInstance().callView("Guide", request);
			break;
			
		
		case "GETCHOICE":
					
					
			switch (choice.toUpperCase()) {
			
			case "L":
				MainDispatcher.getInstance().callView(sub_package + "GuideRead", null);
				break;
				
			case "I":
				MainDispatcher.getInstance().callView(sub_package + "GuideInsert", null);
				break;
				
			case "M":
				MainDispatcher.getInstance().callView(sub_package + "GuideUpdate", null);
				break;
				
			case "C":
				MainDispatcher.getInstance().callView(sub_package + "GuideDelete", null);
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