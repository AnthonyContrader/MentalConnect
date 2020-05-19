import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

<<<<<<< HEAD







import { MapComponent } from './map/map.component';
=======
>>>>>>> 561c793d478c007795ca451ad2d0318227e1a8f3


/**
 * Questo è un modulo di routing. Essendo il modulo principale deve UNICAMENTE 
 * eseguire il redirect sul persorso /login (modulo di login) e NON DEVE contenere
 * altri percorsi: questi vanno specificati nei vari sotto-moduli di routing.
 * 
 * @see LoginRoutingModule
 * 
 * @author Vittorio Valent
 */
const routes: Routes = [
<<<<<<< HEAD
  { path: '', redirectTo:'/login', pathMatch: 'full' },


  

  
  { path: 'map', component: MapComponent }




=======
  { path: '', redirectTo:'/login', pathMatch: 'full' }
  
>>>>>>> 561c793d478c007795ca451ad2d0318227e1a8f3
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
