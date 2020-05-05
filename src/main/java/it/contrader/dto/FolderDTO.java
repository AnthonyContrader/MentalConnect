package it.contrader.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import it.contrader.model.User.Usertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FolderDTO {

	private Long idFolder;
	
	private Long idUser;
	
	private String nameFolder;

	

}
