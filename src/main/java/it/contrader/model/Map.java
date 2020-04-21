package it.contrader.model;

public class Map {
	private int idMap;
	private int idUser;
	
	public int getIdMap() {
		return idMap;
	}
	public void setIdMap(int idMap) {
		this.idMap = idMap;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public Map() {}
	
	public Map(int idUser) {
		this.idUser = idUser;
	}
	
	public Map(int idMap, int idUser) {
		this.idMap = idMap;
		this.idUser = idUser;
		
	}
	
	 @Override
	public String toString() {
		return idMap + "\t" + idUser ;
	}
	 
	 @Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Map other = (Map) obj;
			if (idMap != other.idMap)
				return false;
			if (idUser != other.idUser)
				return false;
		
			return true;
		}
	
	
}
