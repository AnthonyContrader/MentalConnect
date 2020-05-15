import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD

=======
import { FolderComponent } from './folder/folder.component';
import { MapComponent } from './map/map.component';
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d

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
  
=======
  { path: 'folder', component: FolderComponent },
  { path: 'map', component: MapComponent }
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
