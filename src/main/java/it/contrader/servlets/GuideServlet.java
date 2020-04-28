package it.contrader.servlets;

import java.util.List;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.GuideDTO;
import it.contrader.service.GuideService;

/*
 * Per dettagli vedi Guida sez Servlet
 */
public class GuideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GuideServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		GuideService service = new GuideService();
		List<GuideDTO>listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuideService service = new GuideService();
		String mode = request.getParameter("mode");
		GuideDTO dto;
		int idGuide;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "GUIDELIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/guide/guidemanager.jsp").forward(request, response);
			break;

		case "READ":
			idGuide = Integer.parseInt(request.getParameter("id"));
			dto = service.read(idGuide);
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/guide/readguide.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/guide/updateguide.jsp").forward(request, response);
			
			break;

		case "INSERT":
			String question = request.getParameter("question").toString();
			String answer = request.getParameter("answer").toString();
			dto = new GuideDTO (question,answer);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/guide/guidemanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			question = request.getParameter("question");
			answer = request.getParameter("answer");
			idGuide = Integer.parseInt(request.getParameter("id"));
			dto = new GuideDTO (idGuide,question,answer);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/guide/guidemanager.jsp").forward(request, response);
			break;

		case "DELETE":
			idGuide = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(idGuide);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/guide/guidemanager.jsp").forward(request, response);
			break;
		}
	}
}