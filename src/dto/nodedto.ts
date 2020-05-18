export class NodeDTO {

    idNode: number;
    idMap: number;
    text: string;

    constructor(idNode: number, idMap: number, text: string) {
        this.idNode = idNode;
        this.idMap = idMap;
        this.text = text;
    }

}
