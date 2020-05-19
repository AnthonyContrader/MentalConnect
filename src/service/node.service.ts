import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { NodeDTO } from 'src/dto/nodedto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

/**
 * I service sono decorati da @Injectable. 
 * Qui trovate, oltre ai metodi ereditati dall'Abstract,
 *  il metodo per il login (in mirror con il backend).
 * 
 * @author Vittorio Valent
 * 
 * @see AbstractService
 */
@Injectable({
  providedIn: 'root'
})
export class NodeService extends AbstractService<NodeDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'node';
  }

  getAllByidMap(idMap: number): Observable<NodeDTO[]> {
    return this.http.get<NodeDTO[]>('http://localhost:8080/' + this.type + '/getallbyidmap?idMap='+idMap);
  }

}
