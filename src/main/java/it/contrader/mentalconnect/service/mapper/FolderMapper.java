package it.contrader.mentalconnect.service.mapper;

import it.contrader.mentalconnect.domain.*;
import it.contrader.mentalconnect.service.dto.FolderDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Folder and its DTO FolderDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FolderMapper extends EntityMapper<FolderDTO, Folder> {


    @Mapping(target = "maps", ignore = true)
    Folder toEntity(FolderDTO folderDTO);

    default Folder fromId(Long id) {
        if (id == null) {
            return null;
        }
        Folder folder = new Folder();
        folder.setId(id);
        return folder;
    }
}
