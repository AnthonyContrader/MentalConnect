import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AdminRoutingModule } from './admin-routing.module';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
<<<<<<< HEAD

import { FolderComponent } from './folder/folder.component';

import { MindMapComponent } from './mindmap/mindmap.component';
<<<<<<< HEAD


=======
import { FolderComponent } from './folder/folder.component';
import { MindMapComponent } from './mindmap/mindmap.component';
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
=======
import { ElixirmapComponent } from './elixirmap/elixirmap.component';
>>>>>>> 73cd6b69699db5fcf0980b32fd0c76ceeb6f2a64
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
<<<<<<< HEAD

  

  declarations: [MindMapComponent, AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent],

=======
  declarations: [MindMapComponent, AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent],
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
=======
  declarations: [MindMapComponent, AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent, ElixirmapComponent],
>>>>>>> 73cd6b69699db5fcf0980b32fd0c76ceeb6f2a64
  imports: [
    CommonModule,
    AdminRoutingModule,
    FormsModule,
    
  ],
})
export class AdminModule { }
