package it.contrader.dto;

public class LinkDTO {
	
	private int idNode1;
	private int idNode2;
	
	public LinkDTO() {}

	public LinkDTO(int idNode1, int idNode2) {
		this.idNode1 = idNode1;
		this.idNode2 = idNode2;
	}
	
	public int getIdNode1() {
		return idNode1;
	}
	
	public void setIdNode1(int idNode1) {
		this.idNode1 = idNode1;
	}
	
	public int getIdNode2() {
		return idNode2;
	}
	
	public void setIdNode2(int idNode2) {
		this.idNode2 = idNode2;
	}
	
	//Trasforma un oggetto in una stringa
	@Override
	public String toString() {
		return  idNode1 + "\t\t" + idNode2;
	}
}
