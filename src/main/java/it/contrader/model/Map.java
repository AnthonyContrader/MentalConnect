package it.contrader.model;

public class Map {
	private int idMap;
	private int idFolder;
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
	public int getIdFolder() {
		return idFolder;
	}
	public void setIdFolder(int idFolder) {
		this.idFolder = idFolder;
	}
	
	public Map() {}
	
	public Map(int idFolder, String mapName) {
		this.idFolder = idFolder;
		this.mapName = mapName;
	}
	
	public Map(int idMap, int idFolder, String mapName) {
		this.idMap = idMap;
		this.idFolder = idFolder;
		this.mapName = mapName;
	}
	
	 @Override
	public String toString() {
		return idMap + "\t" + mapName  + "\t\t" + "\t\t" + idFolder  ;
	}
	 
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFolder;
		result = prime * result + idMap;
		result = prime * result + ((mapName == null) ? 0 : mapName.hashCode());
		return result;
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
		if (idFolder != other.idFolder)
			return false;
		if (idMap != other.idMap)
			return false;
		if (mapName == null) {
			if (other.mapName != null)
				return false;
		} else if (!mapName.equals(other.mapName))
			return false;
		return true;
	}
	
	
}
