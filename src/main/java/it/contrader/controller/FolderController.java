package it.contrader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import it.contrader.dto.FolderDTO;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.UserDTO;
import it.contrader.service.FolderService;



@RestController
@RequestMapping("/folder")
@CrossOrigin(origins = "http://localhost:4200")
public class FolderController extends AbstractController<FolderDTO>{
	
	@Autowired
	private FolderService folderService;
	
	@GetMapping (value = "/folder")
	public List<FolderDTO> folder( Long idUser ) {
		return  folderService.findByIdUser(idUser);
}
}