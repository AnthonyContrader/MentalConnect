package it.contrader.servlets;

import java.util.List;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.NodeDTO;
import it.contrader.service.NodeService;

/*
 * Per dettagli vedi Guida sez Servlet
 */
public class NodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NodeServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		NodeService service = new NodeService();
		List<NodeDTO>listDTO = service.getAll(Integer.parseInt(request.getParameter("idmap")));
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NodeService service = new NodeService();
		String mode = request.getParameter("mode");
		NodeDTO dto;
		int id;
		int idmap;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "NODELIST":
			updateList(request);
			request.setAttribute("idmap", Integer.parseInt(request.getParameter("idmap")));
			getServletContext().getRequestDispatcher("/node/nodemanager.jsp").forward(request, response);
			break;

		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/node/readnode.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/node/updatenode.jsp").forward(request, response);
			
			break;

		case "INSERT":
			String text = request.getParameter("text").toString();
			idmap = Integer.parseInt(request.getParameter("idmap"));
			dto = new NodeDTO (text,idmap);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			request.setAttribute("idmap", idmap);
			updateList(request);
			getServletContext().getRequestDispatcher("/node/nodemanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			text = request.getParameter("text");
			
			id = Integer.parseInt(request.getParameter("id"));
			idmap = Integer.parseInt(request.getParameter("idmap"));
			request.setAttribute("idmap", idmap);
			dto = new NodeDTO (id,text,idmap);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/node/nodemanager.jsp").forward(request, response);
			break;

		case "DELETE":
			id = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(id);
			idmap = Integer.parseInt(request.getParameter("idmap"));
			request.setAttribute("idmap", idmap);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/node/nodemanager.jsp").forward(request, response);
			break;
		}
	}
}