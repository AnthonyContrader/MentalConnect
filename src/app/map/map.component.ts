import { Component, OnInit } from '@angular/core';
import { MapService } from 'src/service/map.service';
import { MapDTO } from 'src/dto/mapdto';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  maps: MapDTO[];
  maptoinsert: MapDTO = new MapDTO(0, 0, "");

  constructor(private service: MapService) { }

  ngOnInit() {
    this.getMaps();
  }

  getMaps() {
    this.service.getAll().subscribe(maps => this.maps = maps);
  }

  findByIdFolder(idFolder: number){
    this.service.getallbyidfolder(idFolder).subscribe(maps => this.maps = maps);
  }

  delete(map: MapDTO) {
    this.service.delete(map.idMap).subscribe(() => this.getMaps());
  }

  update(map: MapDTO) {
    this.service.update(map).subscribe(() => this.getMaps());
  }

  insert(map: MapDTO) {
    this.service.insert(map).subscribe(() => this.getMaps());
  }

  clear(){
    this.maptoinsert = new MapDTO(0, 0, "");
  }

}
