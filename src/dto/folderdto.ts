export class FolderDTO{

    id? : number;
    nameFolder :string;
    iduser : number;
    
    constructor(id: number, nameFolder: string, iduser: number,) {
        this.iduser = iduser;
        this.id = id;
        this.nameFolder = nameFolder;
    }
}