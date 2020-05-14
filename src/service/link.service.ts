import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { LinkDTO } from 'src/dto/linkdto';
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
export class LinkService extends AbstractService<LinkDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'link';
  }

  getAllByidMap(idMap: number): Observable<LinkDTO[]> {
    return this.http.get<LinkDTO[]>('http://localhost:8080/' + this.type + '/getallbyidmap?idMap='+idMap);
  }

}
