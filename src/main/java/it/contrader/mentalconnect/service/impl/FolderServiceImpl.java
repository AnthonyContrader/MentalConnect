package it.contrader.mentalconnect.service.impl;

import it.contrader.mentalconnect.service.FolderService;
import it.contrader.mentalconnect.domain.Folder;
import it.contrader.mentalconnect.repository.FolderRepository;
import it.contrader.mentalconnect.service.dto.FolderDTO;
import it.contrader.mentalconnect.service.mapper.FolderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing Folder.
 */
@Service
@Transactional
public class FolderServiceImpl implements FolderService {

    private final Logger log = LoggerFactory.getLogger(FolderServiceImpl.class);

    private final FolderRepository folderRepository;

    private final FolderMapper folderMapper;

    public FolderServiceImpl(FolderRepository folderRepository, FolderMapper folderMapper) {
        this.folderRepository = folderRepository;
        this.folderMapper = folderMapper;
    }

    /**
     * Save a folder.
     *
     * @param folderDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public FolderDTO save(FolderDTO folderDTO) {
        log.debug("Request to save Folder : {}", folderDTO);
        Folder folder = folderMapper.toEntity(folderDTO);
        folder = folderRepository.save(folder);
        return folderMapper.toDto(folder);
    }

    /**
     * Get all the folders.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<FolderDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Folders");
        return folderRepository.findAll(pageable)
            .map(folderMapper::toDto);
    }


    /**
     * Get one folder by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<FolderDTO> findOne(Long id) {
        log.debug("Request to get Folder : {}", id);
        return folderRepository.findById(id)
            .map(folderMapper::toDto);
    }

    /**
     * Delete the folder by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Folder : {}", id);
        folderRepository.deleteById(id);
    }
}
