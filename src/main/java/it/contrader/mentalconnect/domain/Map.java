package it.contrader.mentalconnect.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

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

    @Column(name = "id_map")
    private Long idMap;

    @NotNull
    @Column(name = "id_folder", nullable = false)
    private Long idFolder;

    @NotNull
    @Column(name = "map_name", nullable = false)
    private String mapName;

    @Column(name = "elixir_map")
    private String elixirMap;

    @ManyToOne
    @JsonIgnoreProperties("")
    private Folder folder;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMap() {
        return idMap;
    }

    public Map idMap(Long idMap) {
        this.idMap = idMap;
        return this;
    }

    public void setIdMap(Long idMap) {
        this.idMap = idMap;
    }

    public Long getIdFolder() {
        return idFolder;
    }

    public Map idFolder(Long idFolder) {
        this.idFolder = idFolder;
        return this;
    }

    public void setIdFolder(Long idFolder) {
        this.idFolder = idFolder;
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

    public Folder getFolder() {
        return folder;
    }

    public Map folder(Folder folder) {
        this.folder = folder;
        return this;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Map map = (Map) o;
        if (map.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), map.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Map{" +
            "id=" + getId() +
            ", idMap=" + getIdMap() +
            ", idFolder=" + getIdFolder() +
            ", mapName='" + getMapName() + "'" +
            ", elixirMap='" + getElixirMap() + "'" +
            "}";
    }
}
