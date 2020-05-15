import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginModule } from './login/login.module';
import { HttpClientModule } from '@angular/common/http';
import { LayoutModule } from './layout/layout.module';
import { AdminModule } from './admin/admin.module';
import { MapComponent } from './map/map.component';
<<<<<<< HEAD

import { LinkComponent } from './link/link.component';

=======
import { LinkComponent } from './link/link.component';
import { FolderComponent } from './folder/folder.component';
import { FormsModule } from '@angular/forms';
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d


/** 
 * Modulo principale dell'applicazione. Qui vengono importati i moduli secondari. L'UNICA component
 * da dichiare qui è l'AppComponent, tutte le altre devono essere dichiarate nel loro modulo e questo importato
 * qui.
 * 
 * @author Vittorio Valent
*/
@NgModule({
  declarations: [
    AppComponent,
    MapComponent,
    LinkComponent,
<<<<<<< HEAD
    
=======
    FolderComponent
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    LoginModule,
    HttpClientModule,
    LayoutModule,
    AdminModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
