package it.contrader.converter;



import org.springframework.stereotype.Component;

import it.contrader.dto.MapDTO;

import it.contrader.model.Map;

@Component
public class MapConverter extends AbstractConverter<Map, MapDTO> {
	
	@Override
	public Map toEntity(MapDTO mapDTO) {
		Map map = null;
		if (mapDTO != null) {
			map = new Map(mapDTO.getIdMap(), mapDTO.getIdFolder(), mapDTO.getMapName());
		}
		return map;
	}

	@Override
	public MapDTO toDTO(Map map) {
		MapDTO mapDTO = null;
		if (map != null) {
			mapDTO = new MapDTO(map.getIdMap(), map.getIdFolder(), map.getMapName());

		}
		return mapDTO;
	}
}
