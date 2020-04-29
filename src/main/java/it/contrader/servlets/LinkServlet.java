package it.contrader.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.contrader.dto.LinkDTO;
import it.contrader.service.LinkService;

/*
 * Per dettagli vedi Guida sez Servlet
 */
public class LinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LinkServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		LinkService service = new LinkService();
		List<LinkDTO> listDTO = service.getAll(Integer.parseInt(request.getParameter("idmap")));
		request.setAttribute("list", listDTO);
	
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkService service = new LinkService();
		String mode = request.getParameter("mode");
		LinkDTO dto;
		int idNode1;
		int idNode2;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "LINKLIST":
			
			request.setAttribute("idmap", Integer.parseInt(request.getParameter("idmap")));
			updateList(request);
			getServletContext().getRequestDispatcher("/link/linkmanager.jsp").forward(request, response);
			break;

		case "READ":
			idNode1 = Integer.parseInt(request.getParameter("idNode1"));
			idNode2 = Integer.parseInt(request.getParameter("idNode2"));
			dto = service.read(idNode1,idNode2);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/link/readlink.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/link/updatelink.jsp").forward(request, response);
			
			break;

		case "INSERT":
			idNode1 = Integer.parseInt(request.getParameter("idNode1"));
			idNode2 = Integer.parseInt(request.getParameter("idNode2"));
	
			dto = new LinkDTO (idNode1,idNode2);
			ans = service.insert(dto);
			request.setAttribute("idmap", Integer.parseInt(request.getParameter("idmap")));
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/link/linkmanager.jsp").forward(request, response);
			break;
			
		/*case "UPDATE":
			Linkname = request.getParameter("Linkname");
			password = request.getParameter("password");
			Linktype = request.getParameter("Linktype");
			id = Integer.parseInt(request.getParameter("id"));
			dto = new LinkDTO (id,Linkname, password, Linktype);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/Link/Linkmanager.jsp").forward(request, response);
			break;*/

		case "DELETE":
			idNode1 = Integer.parseInt(request.getParameter("idNode1"));
			idNode2 = Integer.parseInt(request.getParameter("idNode2"));
			ans = service.delete(idNode1,idNode2);
			request.setAttribute("idmap", Integer.parseInt(request.getParameter("idmap")));
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/link/linkmanager.jsp").forward(request, response);
			break;
		}
	}
}