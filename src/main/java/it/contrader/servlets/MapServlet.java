package it.contrader.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.contrader.dto.MapDTO;
import it.contrader.service.MapService;


public class MapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MapServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		MapService service = new MapService();
		List<MapDTO>listDTO = service.getAll(Integer.parseInt(request.getParameter("idfolder")));
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MapService service = new MapService();
		String mode = request.getParameter("mode");
		MapDTO dto;
		int id;
		int idfolder;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "MAPLIST":
			updateList(request);
			request.setAttribute("idfolder", Integer.parseInt(request.getParameter("idfolder")));
			
			getServletContext().getRequestDispatcher("/map/mapmanager.jsp").forward(request, response);
			
			
			
			break;

		case "READ":
			id = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id);
			request.setAttribute("idfolder", Integer.parseInt(request.getParameter("idfolder")));
			request.setAttribute("dto", dto);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/map/readmap.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/map/updatemap.jsp").forward(request, response);
			
			break;

		case "INSERT":
			
			String mapname = request.getParameter("mapname").toString();
			idfolder = Integer.parseInt(request.getParameter("idfolder"));
			
			dto = new MapDTO (idfolder, mapname);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			request.setAttribute("idfolder", idfolder);
			updateList(request);
			getServletContext().getRequestDispatcher("/map/mapmanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			id = Integer.parseInt(request.getParameter("id"));
			mapname = request.getParameter("map");
			idfolder = Integer.parseInt(request.getParameter("idfolder"));
			request.setAttribute("idfolder", idfolder);
			
			dto = new MapDTO (id, idfolder, mapname);
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/map/mapmanager.jsp").forward(request, response);
			break;

		case "DELETE":
			id = Integer.parseInt(request.getParameter("id"));
			ans = service.delete(id);
			request.setAttribute("ans", ans);
			request.setAttribute("idfolder", Integer.parseInt(request.getParameter("idfolder")));
			updateList(request);
			getServletContext().getRequestDispatcher("/map/mapmanager.jsp").forward(request, response);
			break;
		}
	}

}
