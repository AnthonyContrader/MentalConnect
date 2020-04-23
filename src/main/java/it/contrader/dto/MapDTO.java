package it.contrader.dto;

public class MapDTO {
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
	
	public MapDTO() {}
	
	public MapDTO(int idCartella, String mapName) {
		this.idCartella = idCartella;
		this.mapName = mapName;
	}
	
	public MapDTO(int idMap, int idCartella, String mapName) {
		this.idMap = idMap;
		this.idCartella = idCartella;
		this.mapName = mapName;
	}
	
	@Override
	public String toString() {
		return idMap + "\t" + mapName  + "\t" +idCartella  ;
	}
}
