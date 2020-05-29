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

    this.microservicetype = "folders";
    this.name= "services/microserviziapp";

    this.user = <UserDTO> JSON.parse(localStorage.getItem('AUTOKEN'));
 
   }

   auth() {
    const user = JSON.parse(localStorage.getItem('currentUser')) as UserDTO;
    if (user) {
      return 'Bearer ' + user.authorities;
    } else {
      return '';
    }
  }

   getAllBy(): Observable<FolderDTO[]> {
    console.log(this.auth());
    return this.http.get<FolderDTO[]>('http://localhost:' + this.port +'/'+ this.name + '/api/foldersByUser/'+this.user.id,{
        headers: {
            Authorization : this.auth()
        }
      }
    )};

   /**getAllBy(): Observable<FolderDTO[]> {
    return this.http.get<any>('http://localhost:' + this.port + '/' + this.type + '/folder?idUser='+this.user.id);
  }*/
}
