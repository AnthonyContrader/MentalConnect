package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Map {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idmap")
	private Long idMap;
	//@ManyToOne
	//@JoinColumn(name = "idfolder")
	
	@Column(name="idfolder")
	private Long idFolder;
	
	@Column(unique = true, name="mapname")
	private String mapName;
	
	
	

}
