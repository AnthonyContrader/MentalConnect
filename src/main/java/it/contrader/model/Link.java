package it.contrader.model;

public class Link {
	
	private int idNode1;
	private int idNode2;
	
	public Link() {}

	public Link (int idNode1, int idNode2) {
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
		return  idNode1 + "\t" + idNode2;
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
		Link other = (Link) obj;
		if (idNode1 != other.idNode1)
			return false;
		if (idNode2 != other.idNode2)
			return false;
		
		return true;
	}
}
