package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.NodeDTO;
import it.contrader.service.NodeService;

@Controller
@RequestMapping("/node")
public class NodeController {

	@Autowired
	private NodeService service;

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idMap", idMap);
		setAll(request,idMap);
		return "nodes";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("idNode") Long idNode, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idNode", idNode);
		request.setAttribute("idMap", idMap);
		service.delete(idNode);
		setAll(request,idMap);
		return "nodes";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("idNode") Long idNode) {
		request.getSession().setAttribute("dto", service.read(idNode));
		return "updatenode";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("idNode") Long idNode, @RequestParam("text") String text, @RequestParam("idMap") Long idMap) {
		request.setAttribute("idNode", idNode);
		request.setAttribute("text", text);
		request.setAttribute("idMap", idMap);
		NodeDTO dto = new NodeDTO();
		dto.setIdNode(idNode);
		dto.setText(text);
		dto.setIdMap(idMap);
		service.update(dto);
		setAll(request,idMap);
		return "nodes";

	}

	@PostMapping("/insert")
	public String insert (HttpServletRequest request, @RequestParam("text") String text, @RequestParam("idMap") Long idMap)
			 {
		request.setAttribute("text", text);
		request.setAttribute("idMap",idMap);
		NodeDTO dto = new NodeDTO();
		dto.setText(text);
		dto.setIdMap(idMap);
		service.insert(dto);
		setAll(request,idMap);
		return "nodes";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("idNode") Long idNode) {
		request.getSession().setAttribute("dto", service.read(idNode));
		return "readnode";
	}

	private void setAll(HttpServletRequest request, Long idMap) {
		request.getSession().setAttribute("list", service.findByIdMap(idMap));
	}
}