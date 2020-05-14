package it.contrader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.MapDTO;
import it.contrader.service.MapService;


@RestController
@RequestMapping("/map")
@CrossOrigin(origins = "http://localhost:4200")
public class MapController extends AbstractController<MapDTO>{
	
	@Autowired
	private MapService mapService;

	//POST Angular a UserDTO
	@GetMapping(value = "/getallbyidfolder")
	public List<MapDTO> findByIdFolder( long idFolder ) {
	return  mapService.findByIdFolder(idFolder);
	
	}
}
