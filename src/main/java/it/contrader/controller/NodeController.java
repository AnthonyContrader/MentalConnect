package it.contrader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.NodeDTO;
import it.contrader.service.NodeService;


/**
 * 
 * Questa classe estende AbstractController con tipo LinkDTO.
 * In aggiunta ai metodi di CRUD si implementa il metodo di login.
 * 
 * @author Vittorio Valent & Girolamo Murdaca
 * 
 * @param<LinkDTO>
 * 
 * @see AbstractController
 *
 */
@RestController
@RequestMapping("/node")
@CrossOrigin(origins = "http://localhost:4200")
public class NodeController extends AbstractController<NodeDTO>{
	
	@Autowired
	private NodeService nodeService;

	//POST Angular a UserDTO
	@GetMapping(value = "/getallbyidmap")
	public List<NodeDTO> findByIdMap( Long idMap ) {
		return nodeService.findByIdMap(idMap);
	
	}
}