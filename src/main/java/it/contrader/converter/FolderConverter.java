package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.FolderDTO;
import it.contrader.model.Folder;

public class FolderConverter {
	public FolderDTO toDTO(Folder folder) {
		FolderDTO folderDTO = new FolderDTO(folder.getIdFolder(), folder.getNameFolder(), folder.getIdUser());
		return folderDTO;
	}

	
	public Folder toEntity(FolderDTO folderDTO) {
		Folder folder = new Folder(folderDTO.getIdFolder(), folderDTO.getNameFolder(), folderDTO.getIdUser());
		return folder;
	}
	
	
	public List<FolderDTO> toDTOList(List<Folder> folderList) {
		
		List<FolderDTO> folderDTOList = new ArrayList<FolderDTO>();
		
		
		for(Folder folder : folderList) {
			
			folderDTOList.add(toDTO(folder));
		}
		return folderDTOList;
	}

}
