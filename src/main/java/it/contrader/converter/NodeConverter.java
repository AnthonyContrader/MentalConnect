package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.NodeDTO;
import it.contrader.model.Node;

public class NodeConverter {
	/**
	 * Crea un oggetto di tipo NodeDTO e lo riempie con i campi del parametro user di tipo Node.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public NodeDTO toDTO(Node node) {
		NodeDTO nodeDTO = new NodeDTO(node.getIdNode(), node.getText(),node.getIdMap());
		return nodeDTO;
	}

	/**
	 * Crea un oggetto di tipo Node e lo riempie con i campi del parametro user di tipo NodeDTO.
	 * Notare l'uso del metodo get() per ottenere il valore dell'attributo-
	 */
	public Node toEntity(NodeDTO nodeDTO) {
		Node node = new Node(nodeDTO.getIdNode(), nodeDTO.getText(),nodeDTO.getIdMap());
		return node;
	}
	
	/**
	 * Metodo per convertire le liste di Node.
	 */
	public List<NodeDTO> toDTOList(List<Node> nodeList) {
		//Crea una lista vuota.
		List<NodeDTO> nodeDTOList = new ArrayList<NodeDTO>();
		
		//Cicla tutti gli elementi della lista e li converte uno a uno
		for(Node node : nodeList) {
			//Utilizza il metodo toDTO per convertire ogni singolo elemento della lista
			//e lo aggiunge adda lista di DTO
			nodeDTOList.add(toDTO(node));
		}
		return nodeDTOList;
	}

}
