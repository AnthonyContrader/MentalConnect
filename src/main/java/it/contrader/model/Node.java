package it.contrader.model;

public class Node {
	private int idNode;
	private String text;
	private int idMap;
	
	
	//Costruttori
	public Node(){}
	
	public Node(String text, int idMap){
		this.idMap= idMap;
		this.text = text;
	}
	public Node(int idNode, String text, int idMap){
		this.idMap= idMap;
		this.text = text;
		this.idNode= idNode;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (idMap != other.idMap)
			return false;
		if (idNode != other.idNode)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	//Metodo per il confronto degli oggetti

}