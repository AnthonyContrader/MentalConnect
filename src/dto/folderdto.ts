export class FolderDTO{

    idUser : number ;
    idFolder : number;
    nameFolder :string;

    constructor(idUser: number, idFolder: number, nameFolder: string) {
        this.idUser = idUser;
        this.idFolder = idFolder;
        this.nameFolder = nameFolder;
    }
}