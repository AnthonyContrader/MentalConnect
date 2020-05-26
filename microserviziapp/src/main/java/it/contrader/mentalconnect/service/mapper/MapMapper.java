package it.contrader.mentalconnect.service.mapper;


import it.contrader.mentalconnect.domain.*;
import it.contrader.mentalconnect.service.dto.MapDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Map} and its DTO {@link MapDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MapMapper extends EntityMapper<MapDTO, Map> {



    default Map fromId(Long id) {
        if (id == null) {
            return null;
        }
        Map map = new Map();
        map.setId(id);
        return map;
    }
}
