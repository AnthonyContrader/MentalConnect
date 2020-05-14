import { Injectable } from '@angular/core';
import { tap, catchError } from 'rxjs/operators';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { User } from 'src/app/models/User';
import { Login } from 'src/app/models/Login';
import { Observable, of } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> =>  {
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

  login(user: string, pass: string): Observable<User> {
    var login: Login = {
      username : user,
      password : pass
    };
    return this.http.post<User>('http://localhost:8080/user/login', login);

    /*return this.http.get<User>('http://localhost:8080/user/login?username='+username+'&password='+password)
    .pipe(tap((response) => console.log('User')), catchError(this.handleError('login error', {}))
    );*/
  }

  logOut() {
    if (typeof (Storage) !== 'undefined') {
      sessionStorage.removeItem('user');
    }
  }

}
