package it.contrader.model;

public class Map {
	private int idMap;
	private int idCartella;
	private String mapName;
	
	
	
	public String getMapName() {
		return mapName;
	}
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public int getIdMap() {
		return idMap;
	}
	public void setIdMap(int idMap) {
		this.idMap = idMap;
	}
	public int getIdCartella() {
		return idCartella;
	}
	public void setIdCartella(int idCartella) {
		this.idCartella = idCartella;
	}
	
	public Map() {}
	
	public Map(int idCartella, String mapName) {
		this.idCartella = idCartella;
		this.mapName = mapName;
	}
	
	public Map(int idMap, int idCartella, String mapName) {
		this.idMap = idMap;
		this.idCartella = idCartella;
		this.mapName = mapName;
	}
	
	 @Override
	public String toString() {
		return idMap + "\t" + mapName  + "\t\t" +idCartella  ;
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
			if (idCartella != other.idCartella)
				return false;
		
			return true;
		}
	
	
}
