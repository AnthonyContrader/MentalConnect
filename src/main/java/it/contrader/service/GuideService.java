package it.contrader.service;

import java.util.List;

import it.contrader.converter.GuideConverter;
import it.contrader.dao.GuideDAO;
import it.contrader.dto.GuideDTO;

public class GuideService {
	
	private GuideDAO guideDAO;
	private GuideConverter guideConverter;
	
	//Istanzio DAO  e Converter specifici.
	public GuideService(){
		this.guideDAO = new GuideDAO();
		this.guideConverter = new GuideConverter();
	}
	

	public List<GuideDTO> getAll() {
		// Ottiene una lista di entità e le restituisce convertendole in DTO
		return guideConverter.toDTOList(guideDAO.getAll());
	}


	public GuideDTO read(int idGuide) {
		// Ottiene un'entità e la restituisce convertendola in DTO
		return guideConverter.toDTO(guideDAO.read(idGuide));
	}


	public boolean insert(GuideDTO dto) {
		// Converte un DTO in entità e lo passa al DAO per l'inserimento
		return guideDAO.insert(guideConverter.toEntity(dto));
	}


	public boolean update(GuideDTO dto) {
		// Converte un userDTO in entità e lo passa allo userDAO per la modifica
		return guideDAO.update(guideConverter.toEntity(dto));
	}


	public boolean delete(int idGuide) {
		// Questo mtodo chiama direttamente il DAO
		return guideDAO.delete(idGuide);
	}
	

}

