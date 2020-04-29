package it.contrader.service;

import java.util.List;

import it.contrader.converter.MapConverter;
import it.contrader.dao.MapDAO;
import it.contrader.dto.MapDTO;
import it.contrader.model.Map;




public class MapService extends AbstractService<Map, MapDTO>{

	private MapDAO mapDAO;
	private MapConverter mapConverter;
	
	//Istanzio DAO  e Converter specifici.
	public MapService(){
		this.mapDAO = new MapDAO();
		this.mapConverter = new MapConverter();
	}
	

	public List<MapDTO> getAll() {
		// Ottiene una lista di entità e le restituisce convertendole in DTO
		return mapConverter.toDTOList(mapDAO.getAll());
	}


	public MapDTO read(int id) {
		// Ottiene un'entità e la restituisce convertendola in DTO
		return mapConverter.toDTO(mapDAO.read(id));
	}


	public boolean insert(MapDTO dto) {
		// Converte un DTO in entità e lo passa al DAO per l'inserimento
		return mapDAO.insert(mapConverter.toEntity(dto));
	}


	public boolean update(MapDTO dto) {
		// Converte un userDTO in entità e lo passa allo userDAO per la modifica
		return mapDAO.update(mapConverter.toEntity(dto));
	}


	public boolean delete(int id) {
		// Questo mtodo chiama direttamente il DAO
		return mapDAO.delete(id);
	}
}
