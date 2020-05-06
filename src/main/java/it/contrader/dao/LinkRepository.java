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

	@Query(value = "SELECT DISTINCT Link.id, Link.idNode1, Link.idNode2 FROM Node, Link WHERE Link.idNode1 = Node.idNode AND Node.idMap = :idMap", nativeQuery = true)
	List<Link> findLinkByIdMap(Long idMap);

}
