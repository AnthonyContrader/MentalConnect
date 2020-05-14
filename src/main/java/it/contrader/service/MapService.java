package it.contrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.MapConverter;
import it.contrader.dao.MapRepository;
import it.contrader.dto.MapDTO;
import it.contrader.model.Map;

@Service
public class MapService extends AbstractService<Map, MapDTO> {
	
	@Autowired
	private MapConverter converter;
	@Autowired
	private MapRepository repository;

	public List <MapDTO> findByIdFolder(Long idFolder) {
		return converter.toDTOList(repository.findByIdFolder(idFolder));
	}
}
