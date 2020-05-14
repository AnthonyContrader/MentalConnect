package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.LinkDTO;
import it.contrader.model.Link;

@Component
public class LinkConverter extends AbstractConverter<Link, LinkDTO> {

	@Override
	public Link toEntity(LinkDTO linkDTO) {
		Link link = null;
		if (linkDTO != null) {
			link = new Link(linkDTO.getId(), linkDTO.getIdNode1(), linkDTO.getIdNode2());
		}
		return link;
	}

	@Override
	public LinkDTO toDTO(Link link) {
		LinkDTO linkDTO = null;
		if (link != null) {
			linkDTO = new LinkDTO(link.getId(), link.getIdNode1(), link.getIdNode2());

		}
		return linkDTO;
	}
}