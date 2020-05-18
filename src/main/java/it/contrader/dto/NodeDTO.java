package it.contrader.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NodeDTO {

	private Long idNode;
	
	private String text;

	private Long idMap;

}
