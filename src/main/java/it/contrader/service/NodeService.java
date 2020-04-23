package it.contrader.service;
import java.util.List;


import it.contrader.converter.NodeConverter;
import it.contrader.dao.NodeDAO;
import it.contrader.dto.NodeDTO;

public class NodeService {
	private NodeDAO nodeDAO;
	private NodeConverter nodeConverter;
	
	public NodeService() {
		this.nodeDAO = new NodeDAO();
		this.nodeConverter = new NodeConverter();
	}
	
	public List<NodeDTO> getAll(){
		return nodeConverter.toDTOList(nodeDAO.getAll());
	}
	
	public NodeDTO read(int id) {
		return nodeConverter.toDTO(nodeDAO.read(id));
		
	}
	
	public boolean insert(NodeDTO dto) {
		return nodeDAO.insert(nodeConverter.toEntity(dto));
	}
	
	public boolean update(NodeDTO dto) {
		return nodeDAO.update(nodeConverter.toEntity(dto));
		
	}
	public boolean delete(int id) {
		return nodeDAO.delete(id);
	}
	
}
