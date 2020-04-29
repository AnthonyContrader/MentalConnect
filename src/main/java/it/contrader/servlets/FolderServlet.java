package it.contrader.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.contrader.dto.FolderDTO;
import it.contrader.service.FolderService;


public class FolderServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public FolderServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		FolderService service =  new FolderService();
		List<FolderDTO>listDTO = service.getAll(Integer.parseInt(request.getParameter("idUser")));
		request.setAttribute("list", listDTO);
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FolderService service =  new FolderService();
		String mode = request.getParameter("mode");
		FolderDTO dto;
		int idFolder;
		int idUser;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "FOLDERLIST":
			updateList(request);
			request.setAttribute("idUser", Integer.parseInt(request.getParameter("idUser")));
			getServletContext().getRequestDispatcher("/folder/foldermanager.jsp").forward(request, response);
			break;

		case "READ":
			idFolder = Integer.parseInt(request.getParameter("idFolder"));
			dto = service.read(idFolder);
			idUser = Integer.parseInt(request.getParameter("idUser"));
			request.setAttribute("dto", dto);
			request.setAttribute("idUser", idUser);
			
			if (request.getParameter("update") == null) {
				 getServletContext().getRequestDispatcher("/folder/readfolder.jsp").forward(request, response);
				
			}
			
			else getServletContext().getRequestDispatcher("/folder/updatefolder.jsp").forward(request, response);
			
			break;

		case "INSERT":
			String nameFolder = request.getParameter("nameFolder").toString();
			idUser = Integer.parseInt(request.getParameter("idUser"));
			dto = new FolderDTO (nameFolder , idUser);
			ans = service.insert(dto);
			request.setAttribute("ans", ans);
			request.setAttribute("idUser", idUser);
			updateList(request);
			getServletContext().getRequestDispatcher("/folder/foldermanager.jsp").forward(request, response);
			break;
			
		case "UPDATE":
			nameFolder = request.getParameter("nameFolder");
		    idFolder = Integer.parseInt(request.getParameter("idFolder"));
		    idUser = Integer.parseInt(request.getParameter("idUser"));
		    request.setAttribute("idFolder", idFolder);
			request.setAttribute("idUser", idUser);
			dto = new FolderDTO (idFolder, nameFolder,idUser);
			
			ans = service.update(dto);
			updateList(request);
			getServletContext().getRequestDispatcher("/folder/foldermanager.jsp").forward(request, response);
			break;

		case "DELETE":
			idFolder = Integer.parseInt(request.getParameter("idFolder"));
			ans = service.delete(idFolder);
			idUser = Integer.parseInt(request.getParameter("idUser"));
			request.setAttribute("idUser", idUser);
			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/folder/foldermanager.jsp").forward(request, response);
			break;
		}
	}
}
