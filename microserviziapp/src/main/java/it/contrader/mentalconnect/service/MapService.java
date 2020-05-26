package it.contrader.mentalconnect.service;

import it.contrader.mentalconnect.service.dto.MapDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link it.contrader.mentalconnect.domain.Map}.
 */
public interface MapService {

    /**
     * Save a map.
     *
     * @param mapDTO the entity to save.
     * @return the persisted entity.
     */
    MapDTO save(MapDTO mapDTO);

    /**
     * Get all the maps.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<MapDTO> findAll(Pageable pageable);


    /**
     * Get the "id" map.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<MapDTO> findOne(Long id);

    /**
     * Delete the "id" map.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
