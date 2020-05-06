package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.NodeConverter;
import it.contrader.dao.NodeRepository;
import it.contrader.dto.NodeDTO;
import it.contrader.model.Node;

@Service
public class NodeService extends AbstractService<Node, NodeDTO> {

	@Autowired
	private NodeConverter converter;
	@Autowired
	private NodeRepository repository;

	public NodeDTO findBytext(String text) {
		return converter.toDTO(repository.findBytext(text));
	}

}
