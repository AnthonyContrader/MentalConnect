package it.contrader.service;

import java.util.List;

import it.contrader.converter.LinkConverter;
import it.contrader.dao.LinkDAO;
import it.contrader.dto.LinkDTO;

/**
 * 
 * @author Vittorio, De Santis
 *
 *Grazie all'ereditariet� mi basta specificare i tipi di questa classe per
 *ereditare i metodi della clase AbstractService. Pertanto la classe risulta meno complicata
 *da scrivere, facendoci risparmiare tempo e fatica!
 */
public class LinkService {
	
	private LinkDAO linkDAO;
	private LinkConverter linkConverter;
	
	//Istanzio DAO  e Converter specifici.
	public LinkService(){
		this.linkDAO = new LinkDAO();
		this.linkConverter = new LinkConverter();
	}
	

	public List<LinkDTO> getAll() {
		// Ottiene una lista di entit� e le restituisce convertendole in DTO
		return linkConverter.toDTOList(linkDAO.getAll());
	}


	public LinkDTO read(int idNode1, int idNode2) {
		// Ottiene un'entit� e la restituisce convertendola in DTO
		return linkConverter.toDTO(linkDAO.read(idNode1, idNode2));
	}


	public boolean insert(LinkDTO dto) {
		// Converte un DTO in entit� e lo passa al DAO per l'inserimento
		return linkDAO.insert(linkConverter.toEntity(dto));
	}


	/*public boolean update(LinkDTO dto) {
		// Converte un userDTO in entit� e lo passa allo userDAO per la modifica
		return linkDAO.update(linkConverter.toEntity(dto));
	}*/


	public boolean delete(int idNode1, int idNode2) {
		// Questo metodo chiama direttamente il DAO
		return linkDAO.delete(idNode1, idNode2);
	}
	

}
