package it.contrader.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MapDTO {
	
	private Long idMap;
	
	private Long idFolder;
	
	private String mapName;
	
	private String elixirmap;
	

}
