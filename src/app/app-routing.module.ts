import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD




import { MapComponent } from './map/map.component';

=======
import { MapComponent } from './map/map.component';
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb

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
  { path: '', redirectTo:'/login', pathMatch: 'full' },
<<<<<<< HEAD

  

  
  { path: 'map', component: MapComponent }

=======
  { path: 'map', component: MapComponent }
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
