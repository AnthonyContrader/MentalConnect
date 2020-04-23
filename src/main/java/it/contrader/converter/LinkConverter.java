package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.LinkDTO;
import it.contrader.model.Link;

public class LinkConverter {
	
	/**
	 * Crea un oggetto di tipo LinkDTO e lo riempie con i campi del parametro user di tipo Link.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public LinkDTO toDTO(Link link) {
		LinkDTO linkDTO = new LinkDTO(link.getIdNode1(), link.getIdNode2());
		return linkDTO;
	}

	/**
	 * Crea un oggetto di tipo Link e lo riempie con i campi del parametro user di tipo LinkDTO.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public Link toEntity(LinkDTO linkDTO) {
		Link link = new Link(linkDTO.getIdNode1(), linkDTO.getIdNode2());
		return link;
	}
	
	/**
	 * Metodo per convertire le liste di Link.
	 */
	public List<LinkDTO> toDTOList(List<Link> linkList) {
		//Crea una lista vuota.
		List<LinkDTO> linkDTOList = new ArrayList<LinkDTO>();
		
		//Cicla tutti gli elementi della lista e li converte uno a uno
		for(Link link : linkList) {
			//Utilizza il metodo toDTO per convertire ogni singolo elemento della lista
			//e lo aggiunge adda lista di DTO
			linkDTOList.add(toDTO(link));
		}
		return linkDTOList;
	}
	
}
