package it.contrader.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import it.contrader.model.Node;

@Repository
@Transactional
public interface NodeRepository extends CrudRepository<Node, Long> {

	List <Node> findByIdMap(Long idMap);

}