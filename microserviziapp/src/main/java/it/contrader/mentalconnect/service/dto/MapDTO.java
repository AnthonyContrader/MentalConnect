package it.contrader.mentalconnect.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link it.contrader.mentalconnect.domain.Map} entity.
 */
public class MapDTO implements Serializable {
    
    private Long id;

    @NotNull
    private String mapName;

    private String elixirMap;

    @NotNull
    private Long idfolder;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdfolder() {
        return idfolder;
    }

    public void setIdfolder(Long idfolder) {
        this.idfolder = idfolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MapDTO)) {
            return false;
        }

        return id != null && id.equals(((MapDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MapDTO{" +
            "id=" + getId() +
            ", mapName='" + getMapName() + "'" +
            ", elixirMap='" + getElixirMap() + "'" +
            ", idfolder=" + getIdfolder() +
            "}";
    }
}
