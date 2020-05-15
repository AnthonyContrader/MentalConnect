export class MapDTO {
  static getIdFolder(): number {
    throw new Error("Method not implemented.");
  }

idMap : number;
idFolder : number;
mapName : string;

constructor(idMap: number, idFolder: number, mapName: string) {
    this.idMap = idMap;
    this.idFolder = idFolder;
    this.mapName = mapName;
}

  

}

