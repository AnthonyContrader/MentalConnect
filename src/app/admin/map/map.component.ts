import { Component, OnInit } from '@angular/core';
import { MapService } from 'src/service/map.service';
import { MapDTO } from 'src/dto/mapdto';
import { FolderDTO } from 'src/dto/folderdto';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  maps: MapDTO[];
  maptoinsert: MapDTO = new MapDTO(0, 0, "", "");
  folder: FolderDTO;
  idFolder: number;

  constructor(private service: MapService, private route: ActivatedRoute) { 
    
  }

  ngOnInit() {
    this.route
      .queryParams
      .subscribe(params => {
        // Defaults to 1 if no query param provided.
        this.idFolder = +params['idfolder'] || 1;
      });
      console.log("Folder: "+this.idFolder);
    this.findByIdFolder(this.idFolder);
  }

  getMaps() {
    this.service.getAll().subscribe(maps => this.maps = maps);
  }

  findByIdFolder(idFolder: number){
    this.service.getallbyidfolder(idFolder).subscribe(maps => this.maps = maps);
  }

  delete(map: MapDTO) {
    this.service.delete(map.id).subscribe(() => this.findByIdFolder(this.idFolder));
  }

  update(map: MapDTO) {
    map.idfolder = this.idFolder;
    this.service.update(map).subscribe(() => this.findByIdFolder(this.idFolder));
  }

  insert(map: MapDTO) {
    map.idfolder = this.idFolder;
    if (this.idFolder != null) {
      console.log(map.idfolder);
      map.id = null;
      map.elixirMap = `{"nodeData":{"expanded":true,"children":[{"topic":"Nodo","id":"25b995215f562897","direction":0}],"topic":"Mappa","style":{"color":"#2ecc71","background":"#c0392c"}},"linkData":{}}`;
      this.service.insert(map).subscribe(() => this.findByIdFolder(this.idFolder));
    }
  }

  clear(){
    this.maptoinsert = new MapDTO(0, 0, "", "");
  }

}
