import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { FolderDTO } from 'src/dto/folderdto';
import { HttpClient } from '@angular/common/http';
import { UserDTO } from 'src/dto/userdto';


import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class FolderService extends AbstractService<FolderDTO> {

  user: UserDTO;

  constructor(http: HttpClient) {
    super(http);
    this.type = 'folder';
    this.user = <UserDTO> JSON.parse(localStorage.getItem('currentUser'));
  
   }

   getAllBy(): Observable<FolderDTO[]> {
    return this.http.get<any>('http://localhost:8080/' + this.type + '/folder?idUser='+this.user.id)
  }
}
