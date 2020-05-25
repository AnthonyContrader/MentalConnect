package it.contrader.mentalconnect.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Folder.
 */
@Entity
@Table(name = "folder")
public class Folder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idfolder")
    private Long idFolder;

    @NotNull
    @Column(name = "iduser", nullable = false)
    private Long idUser;

    @NotNull
    @Column(name = "namefolder", nullable = false)
    private String nameFolder;

    @OneToMany(mappedBy = "folder")
    private Set<Map> maps = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFolder() {
        return idFolder;
    }

    public Folder idFolder(Long idFolder) {
        this.idFolder = idFolder;
        return this;
    }

    public void setIdFolder(Long idFolder) {
        this.idFolder = idFolder;
    }

    public Long getIdUser() {
        return idUser;
    }

    public Folder idUser(Long idUser) {
        this.idUser = idUser;
        return this;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    public Folder nameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
        return this;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public Set<Map> getMaps() {
        return maps;
    }

    public Folder maps(Set<Map> maps) {
        this.maps = maps;
        return this;
    }

    public Folder addMap(Map map) {
        this.maps.add(map);
        map.setFolder(this);
        return this;
    }

    public Folder removeMap(Map map) {
        this.maps.remove(map);
        map.setFolder(null);
        return this;
    }

    public void setMaps(Set<Map> maps) {
        this.maps = maps;
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
        Folder folder = (Folder) o;
        if (folder.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), folder.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Folder{" +
            "id=" + getId() +
            ", idFolder=" + getIdFolder() +
            ", idUser=" + getIdUser() +
            ", nameFolder='" + getNameFolder() + "'" +
            "}";
    }
}
