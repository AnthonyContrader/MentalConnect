import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { FolderDTO } from 'src/dto/folderdto';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FolderService extends AbstractService<FolderDTO> {

  constructor(http: HttpClient) {
    super(http);
    this.type = 'folder';
   }
   getAllBy(idUser: number): Observable<FolderDTO[]> {
    return this.http.get<any>('http://localhost:8080/' + this.type + '/folder?idUser='+idUser)
  }
}
