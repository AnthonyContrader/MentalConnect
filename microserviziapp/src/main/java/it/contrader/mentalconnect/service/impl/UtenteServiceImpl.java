package it.contrader.mentalconnect.service.impl;

import it.contrader.mentalconnect.service.UtenteService;
import it.contrader.mentalconnect.domain.Utente;
import it.contrader.mentalconnect.repository.UtenteRepository;
import it.contrader.mentalconnect.service.dto.UtenteDTO;
import it.contrader.mentalconnect.service.mapper.UtenteMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Utente}.
 */
@Service
@Transactional
public class UtenteServiceImpl implements UtenteService {

    private final Logger log = LoggerFactory.getLogger(UtenteServiceImpl.class);

    private final UtenteRepository utenteRepository;

    private final UtenteMapper utenteMapper;

    public UtenteServiceImpl(UtenteRepository utenteRepository, UtenteMapper utenteMapper) {
        this.utenteRepository = utenteRepository;
        this.utenteMapper = utenteMapper;
    }

    /**
     * Save a utente.
     *
     * @param utenteDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public UtenteDTO save(UtenteDTO utenteDTO) {
        log.debug("Request to save Utente : {}", utenteDTO);
        Utente utente = utenteMapper.toEntity(utenteDTO);
        utente = utenteRepository.save(utente);
        return utenteMapper.toDto(utente);
    }

    /**
     * Get all the utentes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<UtenteDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Utentes");
        return utenteRepository.findAll(pageable)
            .map(utenteMapper::toDto);
    }


    /**
     * Get one utente by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<UtenteDTO> findOne(Long id) {
        log.debug("Request to get Utente : {}", id);
        return utenteRepository.findById(id)
            .map(utenteMapper::toDto);
    }

    /**
     * Delete the utente by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Utente : {}", id);

        utenteRepository.deleteById(id);
    }
}
