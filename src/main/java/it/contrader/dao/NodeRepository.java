package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Node;

@Repository
@Transactional
public interface NodeRepository extends CrudRepository<Node, Long> {

	Node findBytext(String text);

}