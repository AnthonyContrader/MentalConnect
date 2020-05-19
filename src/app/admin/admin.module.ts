import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AdminRoutingModule } from './admin-routing.module';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';


import { FolderComponent } from './folder/folder.component';
<<<<<<< HEAD









=======
import { MapComponent } from './map/map.component';
import { MindMapComponent } from './mindmap/mindmap.component';
>>>>>>> 561c793d478c007795ca451ad2d0318227e1a8f3
import { ElixirmapComponent } from './elixirmap/elixirmap.component';

/**
 * Modulo dell'admin, qui vengono dichiarate le component che utilizza 
 * l'admin. Questo modulo importa AdminRoutingModule.
 * 
 * @author Vittorio Valent
 * 
 * @see AdminRoutingModule
 */
@NgModule({
<<<<<<< HEAD



  




  declarations: [ AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent, ElixirmapComponent],

=======
  declarations: [MindMapComponent, AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent, MapComponent, ElixirmapComponent],
>>>>>>> 561c793d478c007795ca451ad2d0318227e1a8f3
  imports: [
    CommonModule,
    AdminRoutingModule,
    FormsModule,
    
  ],
})
export class AdminModule { }
