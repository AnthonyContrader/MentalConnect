package it.contrader.service;

import java.util.List;

import it.contrader.converter.FolderConverter;
import it.contrader.dao.FolderDAO;
import it.contrader.dto.FolderDTO;

public class FolderService {
	private FolderDAO folderDAO;
	private FolderConverter folderConverter;
	
	
	public FolderService(){
		this.folderDAO = new FolderDAO();
		this.folderConverter = new FolderConverter();
	}
	

	public List<FolderDTO> getAll() {
		
		return folderConverter.toDTOList(folderDAO.getAll());
	}


	public FolderDTO read(int id) {
		
		return folderConverter.toDTO(folderDAO.read(id));
	}


	public boolean insert(FolderDTO dto) {
		
		return folderDAO.insert(folderConverter.toEntity(dto));
	}


	public boolean update(FolderDTO dto) {
		
		return folderDAO.update(folderConverter.toEntity(dto));
	}


	public boolean delete(int id) {
		
		return folderDAO.delete(id);
	}
	

}
