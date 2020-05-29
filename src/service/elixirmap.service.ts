import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { MapDTO } from 'src/dto/mapdto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserDTO } from 'src/dto/userdto';


@Injectable({
  providedIn: 'root'
})
export class ElixirmapService extends AbstractService<MapDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'map';
    this.microservicetype = "maps";
    this.name= "services/microserviziapp";

  }

}
