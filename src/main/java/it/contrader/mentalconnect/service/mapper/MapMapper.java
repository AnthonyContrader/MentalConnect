package it.contrader.mentalconnect.service.mapper;

import it.contrader.mentalconnect.domain.*;
import it.contrader.mentalconnect.service.dto.MapDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Map and its DTO MapDTO.
 */
@Mapper(componentModel = "spring", uses = {FolderMapper.class})
public interface MapMapper extends EntityMapper<MapDTO, Map> {

    @Mapping(source = "folder.id", target = "folderId")
    @Mapping(source = "folder.idFolder", target = "folderIdFolder")
    MapDTO toDto(Map map);

    @Mapping(source = "folderId", target = "folder")
    Map toEntity(MapDTO mapDTO);

    default Map fromId(Long id) {
        if (id == null) {
            return null;
        }
        Map map = new Map();
        map.setId(id);
        return map;
    }
}
