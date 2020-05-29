package it.contrader.mentalconnect.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A Map.
 */
@Entity
@Table(name = "map")
public class Map implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "map_name", nullable = false)
    private String mapName;

    @Column(name = "elixir_map")
    private String elixirMap;

    @NotNull
    @Column(name = "idfolder", nullable = false)
    private Long idfolder;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMapName() {
        return mapName;
    }

    public Map mapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getElixirMap() {
        return elixirMap;
    }

    public Map elixirMap(String elixirMap) {
        this.elixirMap = elixirMap;
        return this;
    }

    public void setElixirMap(String elixirMap) {
        this.elixirMap = elixirMap;
    }

    public Long getIdfolder() {
        return idfolder;
    }

    public Map idfolder(Long idfolder) {
        this.idfolder = idfolder;
        return this;
    }

    public void setIdfolder(Long idfolder) {
        this.idfolder = idfolder;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Map)) {
            return false;
        }
        return id != null && id.equals(((Map) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Map{" +
            "id=" + getId() +
            ", mapName='" + getMapName() + "'" +
            ", elixirMap='" + getElixirMap() + "'" +
            ", idfolder=" + getIdfolder() +
            "}";
    }
}
