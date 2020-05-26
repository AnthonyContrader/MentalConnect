package it.contrader.mentalconnect.service.mapper;

import it.contrader.mentalconnect.domain.Folder;
import it.contrader.mentalconnect.service.dto.FolderDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-25T17:34:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class FolderMapperImpl implements FolderMapper {

    @Override
    public Folder toEntity(FolderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Folder folder = new Folder();

        folder.setId( dto.getId() );
        folder.setNameFolder( dto.getNameFolder() );

        return folder;
    }

    @Override
    public FolderDTO toDto(Folder entity) {
        if ( entity == null ) {
            return null;
        }

        FolderDTO folderDTO = new FolderDTO();

        folderDTO.setId( entity.getId() );
        folderDTO.setNameFolder( entity.getNameFolder() );

        return folderDTO;
    }

    @Override
    public List<Folder> toEntity(List<FolderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Folder> list = new ArrayList<Folder>( dtoList.size() );
        for ( FolderDTO folderDTO : dtoList ) {
            list.add( toEntity( folderDTO ) );
        }

        return list;
    }

    @Override
    public List<FolderDTO> toDto(List<Folder> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<FolderDTO> list = new ArrayList<FolderDTO>( entityList.size() );
        for ( Folder folder : entityList ) {
            list.add( toDto( folder ) );
        }

        return list;
    }
}
