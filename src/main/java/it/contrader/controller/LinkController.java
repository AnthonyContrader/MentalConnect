package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.LinkDTO;
import it.contrader.service.LinkService;


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
@RequestMapping("/link")
@CrossOrigin(origins = "http://localhost:4200")
public class LinkController extends AbstractController<LinkDTO>{
	
	@Autowired
	private LinkService linkService;


}