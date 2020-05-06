package it.contrader.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Link;

@Repository
@Transactional
public interface LinkRepository extends CrudRepository<Link, Long> {

	@Query("SELECT DISTINCT link.idNode1, link.idNode2 FROM node, link WHERE link.idNode1 = node.idNode AND node.idMap = :idMap")
	List<Link> findLinkByIdMap(Long idMap);

}
