package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;


import it.contrader.model.Map;
import it.contrader.dto.*;
public class MapConverter {
	
	/**
	 * Crea un oggetto di tipo MapDTO e lo riempie con i campi del parametro user di tipo Map.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public MapDTO toDTO(Map map) {
		MapDTO mapDTO = new MapDTO(map.getIdMap(), map.getIdFolder(), map.getMapName());
		return mapDTO;
	}

	/**
	 * Crea un oggetto di tipo Map e lo riempie con i campi del parametro user di tipo MapDTO.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public Map toEntity(MapDTO mapDTO) {
		Map map = new Map(mapDTO.getIdMap(), mapDTO.getIdFolder(), mapDTO.getMapName());
		return map;
	}
	
	/**
	 * Metodo per convertire le liste di Map.
	 */
	public List<MapDTO> toDTOList(List<Map> mapList) {
		//Crea una lista vuota.
		List<MapDTO> mapDTOList = new ArrayList<MapDTO>();
		
		//Cicla tutti gli elementi della lista e li converte uno a uno
		for(Map map : mapList) {
			//Utilizza il metodo toDTO per convertire ogni singolo elemento della lista
			//e lo aggiunge adda lista di DTO
			mapDTOList.add(toDTO(map));
		}
		return mapDTOList;
	}

	

}
