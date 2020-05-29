package it.contrader.mentalconnect.service;

import it.contrader.mentalconnect.service.dto.UtenteDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link it.contrader.mentalconnect.domain.Utente}.
 */
public interface UtenteService {

    /**
     * Save a utente.
     *
     * @param utenteDTO the entity to save.
     * @return the persisted entity.
     */
    UtenteDTO save(UtenteDTO utenteDTO);

    /**
     * Get all the utentes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<UtenteDTO> findAll(Pageable pageable);


    /**
     * Get the "id" utente.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<UtenteDTO> findOne(Long id);

    /**
     * Delete the "id" utente.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
