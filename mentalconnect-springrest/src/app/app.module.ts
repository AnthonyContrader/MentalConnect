import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

/** Import modules */
import { AppRoutingModule } from './app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';

/** Home Component */
import { HomeComponent } from './components/home/home.component';
import { LinkComponent } from './components/link/link.component';
import { LoginComponent } from './components/login/login.component';

/** Services */
import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';
import { LinkService } from './services/link.service';


@NgModule({
  declarations: [
    AppComponent,
    LinkComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [
    LoginService,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
