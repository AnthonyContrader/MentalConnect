package it.contrader.mentalconnect.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Folder entity.
 */
public class FolderDTO implements Serializable {

    private Long id;

    private Long idFolder;

    @NotNull
    private Long idUser;

    @NotNull
    private String nameFolder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFolder() {
        return idFolder;
    }

    public void setIdFolder(Long idFolder) {
        this.idFolder = idFolder;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FolderDTO folderDTO = (FolderDTO) o;
        if (folderDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), folderDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "FolderDTO{" +
            "id=" + getId() +
            ", idFolder=" + getIdFolder() +
            ", idUser=" + getIdUser() +
            ", nameFolder='" + getNameFolder() + "'" +
            "}";
    }
}
