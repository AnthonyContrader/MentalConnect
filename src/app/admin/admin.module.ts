import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AdminRoutingModule } from './admin-routing.module';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
<<<<<<< HEAD
import { FolderComponent } from './folder/folder.component';
=======
import { MindMapComponent } from './mindmap/mindmap.component';

>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d
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
  declarations: [AdminDashboardComponent, UsersComponent, WorkInProgressComponent, FolderComponent],
=======
  declarations: [MindMapComponent, AdminDashboardComponent, UsersComponent, WorkInProgressComponent],
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d
  imports: [
    CommonModule,
    AdminRoutingModule,
    FormsModule,
    
  ],
})
export class AdminModule { }
