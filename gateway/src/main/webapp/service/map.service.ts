import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { MapDTO } from 'src/dto/mapdto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MapService  extends AbstractService<MapDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'map';
  }

  getallbyidfolder(idFolder: number): Observable<MapDTO[]> {
    return this.http.get<any>('http://localhost:8080/' + this.type + '/getallbyidfolder?idFolder='+idFolder );
  }

}
