package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Folder;
import it.contrader.model.User;

@Repository
@Transactional
public interface FolderRepository extends CrudRepository<Folder, Long> {

	Folder findByIdUserAndNameFolder(String nameFolder, Long idUser);

}

