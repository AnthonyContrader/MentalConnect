package it.contrader.mentalconnect.service.mapper;

import it.contrader.mentalconnect.domain.Map;
import it.contrader.mentalconnect.service.dto.MapDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-29T12:38:26+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class MapMapperImpl implements MapMapper {

    @Override
    public Map toEntity(MapDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Map map = new Map();

        map.setId( dto.getId() );
        map.setMapName( dto.getMapName() );
        map.setElixirMap( dto.getElixirMap() );
        map.setIdfolder( dto.getIdfolder() );

        return map;
    }

    @Override
    public MapDTO toDto(Map entity) {
        if ( entity == null ) {
            return null;
        }

        MapDTO mapDTO = new MapDTO();

        mapDTO.setId( entity.getId() );
        mapDTO.setMapName( entity.getMapName() );
        mapDTO.setElixirMap( entity.getElixirMap() );
        mapDTO.setIdfolder( entity.getIdfolder() );

        return mapDTO;
    }

    @Override
    public List<Map> toEntity(List<MapDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Map> list = new ArrayList<Map>( dtoList.size() );
        for ( MapDTO mapDTO : dtoList ) {
            list.add( toEntity( mapDTO ) );
        }

        return list;
    }

    @Override
    public List<MapDTO> toDto(List<Map> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MapDTO> list = new ArrayList<MapDTO>( entityList.size() );
        for ( Map map : entityList ) {
            list.add( toDto( map ) );
        }

        return list;
    }
}
