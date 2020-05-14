import { Component, OnInit } from '@angular/core';

import { MapService } from 'src/service/map.service';
import { UserDTO } from 'src/dto/mapdto';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  users: MapDTO[];
  usertoinsert: MapDTO = new MapDTO();

  constructor(private service: MapService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers() {
    this.service.getAll().subscribe(users => this.users = users);
  }

  delete(map: MapDTO) {
    this.service.delete(user.id).subscribe(() => this.getUsers());
  }

  update(map: MapDTO) {
    this.service.update(user).subscribe(() => this.getUsers());
  }

  insert(map: MapDTO) {
    this.service.insert(user).subscribe(() => this.getUsers());
  }

  clear(){
    thistoinsert = new MapDTO();
  }

}
