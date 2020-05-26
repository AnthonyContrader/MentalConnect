package it.contrader.mentalconnect.service.impl;

import it.contrader.mentalconnect.service.MapService;
import it.contrader.mentalconnect.domain.Map;
import it.contrader.mentalconnect.repository.MapRepository;
import it.contrader.mentalconnect.service.dto.MapDTO;
import it.contrader.mentalconnect.service.mapper.MapMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Map}.
 */
@Service
@Transactional
public class MapServiceImpl implements MapService {

    private final Logger log = LoggerFactory.getLogger(MapServiceImpl.class);

    private final MapRepository mapRepository;

    private final MapMapper mapMapper;

    public MapServiceImpl(MapRepository mapRepository, MapMapper mapMapper) {
        this.mapRepository = mapRepository;
        this.mapMapper = mapMapper;
    }

    /**
     * Save a map.
     *
     * @param mapDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public MapDTO save(MapDTO mapDTO) {
        log.debug("Request to save Map : {}", mapDTO);
        Map map = mapMapper.toEntity(mapDTO);
        map = mapRepository.save(map);
        return mapMapper.toDto(map);
    }

    /**
     * Get all the maps.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<MapDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Maps");
        return mapRepository.findAll(pageable)
            .map(mapMapper::toDto);
    }


    /**
     * Get one map by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<MapDTO> findOne(Long id) {
        log.debug("Request to get Map : {}", id);
        return mapRepository.findById(id)
            .map(mapMapper::toDto);
    }

    /**
     * Delete the map by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Map : {}", id);

        mapRepository.deleteById(id);
    }
}
