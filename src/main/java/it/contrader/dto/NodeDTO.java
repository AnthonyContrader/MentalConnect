package it.contrader.dto;

public class NodeDTO {
	private int idNode;
	private String text;
	private int idMap;
	
	public NodeDTO(){}
	
	public NodeDTO(String text,int idMap){
		this.idMap= idMap;
		this.text = text;
	}
	public NodeDTO(int idNode, String text, int idMap){
		this.text = text;
		this.idNode= idNode;
		this.idMap= idMap;
	}
	
	//Setter e getter
	public int getIdNode() {
		return idNode;
	}
	public void setIdNode(int idNode) {
		this.idNode = idNode;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getIdMap() {
		return idMap;
	}
	public void setIdMap(int idMap) {
		this.idMap = idMap;
	}

	//Trasforma un oggetto in una stringa
	@Override
	public String toString() {
		return  idNode + "\t"  +   text + "\t\t" + idMap;
	}
}
