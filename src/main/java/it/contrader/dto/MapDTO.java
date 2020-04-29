package it.contrader.dto;

public class MapDTO {
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
	
	public MapDTO() {}
	
	public MapDTO(int idFolder, String mapName) {
		this.idFolder = idFolder;
		this.mapName = mapName;
	}
	
	public MapDTO(int idMap, int idFolder, String mapName) {
		this.idMap = idMap;
		this.idFolder = idFolder;
		this.mapName = mapName;
	}
	
	@Override
	public String toString() {
		return idMap + "\t" + mapName  + "    \t\t" +idFolder  ;
	}
}
