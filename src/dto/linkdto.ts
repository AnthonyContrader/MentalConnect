export class LinkDTO {

    id: number;
    idNode1: string;
    idNode2: string;

    constructor(id: number, idNode1: string, idNode2: string) {
        this.id = id;
        this.idNode1 = idNode1;
        this.idNode2 = idNode2;
    }

}

