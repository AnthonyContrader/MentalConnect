package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.FolderDTO;

import it.contrader.service.FolderService;

@Controller
@RequestMapping("/folder")
public class FolderController {

	@Autowired
	private FolderService service;

	
	

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request, @RequestParam("idUser") Long idUser) {
		setAll(request);
		return "folder";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idFolder") Long idFolder) {
		service.delete(idFolder);
		setAll(request);
		return "folders";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idFolder") Long idFolder) {
		request.getSession().setAttribute("dto", service.read(idFolder));
		return "updatefolder";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("idFolder") Long idFolder, @RequestParam("nameFolder") String nameFolder
			) {

		FolderDTO dto = new FolderDTO();
		dto.setIdFolder(idFolder);
		dto.setNameFolder(nameFolder);
		service.update(dto);
		setAll(request);
		return "folders";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("nameFolder") String nameFolder,
			@RequestParam("idUser") Long idUser) {
		FolderDTO dto = new FolderDTO();
		dto.setNameFolder(nameFolder);
		dto.setIdUser(idUser);
		service.insert(dto);
		setAll(request);
		return "folders";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idFolder") Long idFolder) {
		request.getSession().setAttribute("dto", service.read(idFolder));
		return "readfolder";
	}

	

	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
