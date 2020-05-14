import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/User';

import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

import { LoginService } from '../../services/login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User;

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit(): void {
    console.log("arrivato");
  }

  login(f: NgForm): void {
    this.loginService.login(f.value.username, f.value.password).subscribe(response => {
      if (response != null) {
        this.user = response;
        sessionStorage.setItem('user', JSON.stringify(this.user));
        if (response.usertype === 'ADMIN') { 
          this.router.navigateByUrl('/homeAdmin');
        } else if (response.usertype === 'USER') {
          this.router.navigateByUrl('/home');
        }
      }
    });
  }

}
