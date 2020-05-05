package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.LinkConverter;
import it.contrader.dao.LinkRepository;
import it.contrader.dto.LinkDTO;
import it.contrader.model.Link;

@Service
public class LinkService extends AbstractService<Link, LinkDTO> {

	@Autowired
	private LinkConverter converter;
	@Autowired
	private LinkRepository repository;

	/*public LinkDTO findLinkByIdMap(Integer idMap) {
		return converter.toDTO(repository.findLinkByIdMap(idMap));
	}*/

}
