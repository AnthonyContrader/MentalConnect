package it.contrader.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Map;


@Repository
@Transactional
public interface MapRepository extends CrudRepository<Map, Long> {

	List <Map> findByIdFolder(Long idFolder);

}


