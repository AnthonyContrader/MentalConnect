package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.MapDTO;
import it.contrader.service.MapService;

@Controller
@RequestMapping("/map")
public class MapController {
	
	@Autowired
	private MapService service;




	@GetMapping("/getall")
	public String getAll(HttpServletRequest request, @RequestParam("idFolder") Long idFolder) {
		request.setAttribute("idFolder", idFolder);
		setAll(request, idFolder);
		return "maps";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idMap") Long idMap, @RequestParam("idFolder") Long idFolder) {
		request.setAttribute("idMap", idMap);
		request.setAttribute("idFolder", idFolder);
		service.delete(idMap);
		setAll(request, idFolder);
		return "maps";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idMap") Long idMap) {
		request.getSession().setAttribute("dto", service.read(idMap));
		return "updatemap";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("idMap") Long idMap, @RequestParam("mapName") String mapName,
			@RequestParam("idFolder") long idFolder) {
		request.setAttribute("idMap", idMap);
		request.setAttribute("mapName", mapName);
		request.setAttribute("idFolder", idFolder);
		MapDTO dto = new MapDTO();
		dto.setIdMap(idMap);
		dto.setMapName(mapName);
		dto.setIdFolder(idFolder);
		service.update(dto);
		setAll(request, idFolder);
		return "maps";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("mapName") String mapName,
			@RequestParam("idFolder") long idFolder) {
		
		request.setAttribute("mapName", mapName);
		request.setAttribute("idFolder", idFolder);
		
		MapDTO dto = new MapDTO();
		dto.setMapName(mapName);
		dto.setIdFolder(idFolder);
		
		service.insert(dto);
		setAll(request, idFolder);
		return "maps";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idMap") Long idMap) {
		request.getSession().setAttribute("dto", service.read(idMap));
		return "readmap";
	}

	
	

	private void setAll(HttpServletRequest request, Long idFolder ) {
		request.getSession().setAttribute("list", service.findByIdFolder(idFolder));
	}

}
