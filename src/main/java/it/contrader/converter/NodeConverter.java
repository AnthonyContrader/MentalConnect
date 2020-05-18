package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.NodeDTO;

import it.contrader.model.Node;

@Component
public class NodeConverter extends AbstractConverter<Node, NodeDTO> {

	@Override
	public Node toEntity(NodeDTO nodeDTO) {
		Node node = null;
		if (nodeDTO != null) {
			node = new Node(nodeDTO.getIdNode(), nodeDTO.getText(), nodeDTO.getIdMap());
		}
		return node;
	}

	@Override
	public NodeDTO toDTO(Node node) {
		NodeDTO nodeDTO = null;
		if (node != null) {
			nodeDTO = new NodeDTO(node.getIdNode(), node.getText(), node.getIdMap());

		}
		return nodeDTO;
	}
}
