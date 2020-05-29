import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { MapDTO } from 'src/dto/mapdto';
import { UserDTO } from 'src/dto/userdto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MapService  extends AbstractService<MapDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'map';
    this.microservicetype = "maps";
    this.name= "services/microserviziapp";
  }

  auth() {
    const user = JSON.parse(localStorage.getItem('currentUser')) as UserDTO;
    if (user) {
      return 'Bearer ' + user.authorities;
    } else {
      return '';
    }
  }

  getallbyidfolder(idFolder: number): Observable<MapDTO[]> {
    console.log(this.auth());
    return this.http.get<MapDTO[]>('http://localhost:' + this.port +'/'+ this.name + '/api/mapsByFolder/'+idFolder,{
        headers: {
            Authorization : this.auth()
        }
      }
    )};

  /*getallbyidfolder(idFolder: number): Observable<MapDTO[]> {
    return this.http.get<any>('http://localhost:8080/' + this.type + '/getallbyidfolder?idFolder='+idFolder );
  }*/

}
