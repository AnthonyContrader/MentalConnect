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
import { NodeComponent } from './node/node.component';








=======
import { LinkComponent } from './link/link.component';
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb


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
<<<<<<< HEAD
    
  
  NodeComponent

=======
    LinkComponent
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
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
