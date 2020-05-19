export class MapDTO {

idMap : number;
idFolder : number;
mapName : string;
elixirmap : string;

constructor(idMap: number, idFolder: number, mapName: string, elixirmap: string) {
    this.idMap = idMap;
    this.idFolder = idFolder;
    this.mapName = mapName;
    this.elixirmap = elixirmap;
}

  

}

