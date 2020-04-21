package it.contrader.model;

public class Node {
	private int idNode;
	private String text;
	private String color;
	private int idMap;
	
	
	//Costruttori
	public Node(){}
	
	public Node(String text, String color, int idMap){
		this.idMap= idMap;
		this.text = text;
		this.color = color;
	}
	public Node(int idNode, String text, String color, int idMap){
		this.idMap= idMap;
		this.text = text;
		this.color = color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
		return  idNode + "\t"  + color +"\t\t" +   text + "\t\t" + idMap;
	}
	
	//Metodo per il confronto degli oggetti
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (idNode!= other.idNode)
			return false;
		return true;
	}
}