export class MapDTO {

id? : number;
idfolder : number;
mapName : string;
elixirMap : string;

constructor(id: number, idfolder: number, mapName: string, elixirMap: string) {
    this.id = id;
    this.idfolder = idfolder;
    this.mapName = mapName;
    this.elixirMap = elixirMap;
}

  

}

