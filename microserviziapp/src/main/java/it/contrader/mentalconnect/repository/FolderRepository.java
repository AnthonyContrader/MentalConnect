package it.contrader.mentalconnect.repository;

import it.contrader.mentalconnect.domain.Folder;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Folder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
	
	public Page<Folder> findAllByiduser(Long iduser,Pageable page);
}
