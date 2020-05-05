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
public class Folder {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFolder;
	
	@Column(unique = true)
	private String nameFolder;

	//@ManyToOne
	private Long idUser;
	
	

	

	
	
	

}