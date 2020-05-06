package it.contrader.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.LinkDTO;
import it.contrader.dto.NodeDTO;
import it.contrader.service.LinkService;
import it.contrader.service.NodeService;

@Controller
@RequestMapping("/link")
public class LinkController {

	@Autowired
	private LinkService service;
	@Autowired
	private NodeService nodeService;
	
	@GetMapping("/getall")
	public String getAll(HttpServletRequest request, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idMap", idMap);
		setAll(request, idMap);
		setNodeList(request, idMap);
		return "links";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idMap", idMap);
		service.delete(id);
		setAll(request, idMap);
		return "links";
	}

	/*@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "updateuser";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("usertype") Usertype usertype) {

		UserDTO dto = new UserDTO();
		dto.setId(id);
		dto.setUsername(username);
		dto.setPassword(password);
		dto.setUsertype(usertype);
		service.update(dto);
		setAll(request);
		return "users";

	}*/

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("idNode1") Long idNode1,
			@RequestParam("idNode2") Long idNode2, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idMap", idMap);
		LinkDTO dto = new LinkDTO();
		dto.setIdNode1(idNode1);
		dto.setIdNode2(idNode2);
		
		service.insert(dto);
		setAll(request, idMap);
		return "links";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "readlink";
	}

	private void setAll(HttpServletRequest request, Long idMap) {
		request.getSession().setAttribute("list", service.findLinkByIdMap(idMap));
	}
	
	public void setNodeList(HttpServletRequest request, Long idMap) {
		
		List<NodeDTO> nodelistDTO = nodeService.findByIdMap(idMap);
		request.setAttribute("nodes", nodelistDTO);
	}
}
