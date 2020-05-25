package it.contrader.mentalconnect.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Map entity.
 */
public class MapDTO implements Serializable {

    private Long id;

    private Long idMap;

    @NotNull
    private Long idFolder;

    @NotNull
    private String mapName;

    private String elixirMap;

    private Long folderId;

    private String folderIdFolder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMap() {
        return idMap;
    }

    public void setIdMap(Long idMap) {
        this.idMap = idMap;
    }

    public Long getIdFolder() {
        return idFolder;
    }

    public void setIdFolder(Long idFolder) {
        this.idFolder = idFolder;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getElixirMap() {
        return elixirMap;
    }

    public void setElixirMap(String elixirMap) {
        this.elixirMap = elixirMap;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public String getFolderIdFolder() {
        return folderIdFolder;
    }

    public void setFolderIdFolder(String folderIdFolder) {
        this.folderIdFolder = folderIdFolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MapDTO mapDTO = (MapDTO) o;
        if (mapDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mapDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MapDTO{" +
            "id=" + getId() +
            ", idMap=" + getIdMap() +
            ", idFolder=" + getIdFolder() +
            ", mapName='" + getMapName() + "'" +
            ", elixirMap='" + getElixirMap() + "'" +
            ", folder=" + getFolderId() +
            ", folder='" + getFolderIdFolder() + "'" +
            "}";
    }
}
