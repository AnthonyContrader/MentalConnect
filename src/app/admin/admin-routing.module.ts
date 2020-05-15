import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminLayoutComponent } from '../layout/admin-layout/admin-layout.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
<<<<<<< HEAD
import { FolderComponent } from './folder/folder.component';
=======
import { MindMapComponent } from './mindmap/mindmap.component';
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d

/**
 * Modulo di routing dell'admin. Qui ci sono i percorsi che un admin può seguire:
 * appena fa il login viene caricato nel <router-outlet> di app-component il layout e nel 
 * <router-outlet> del layout (come percorsi "children") vengono visualizzati gli altri 
 * (qui sotto sono indentati).
 * 
 * @author Vittorio Valent
 * 
 * @see AdminLayoutComponent
 * 
 * @see layout
 */
const routes: Routes = [
  { path: 'admin-dashboard', component: AdminLayoutComponent, children:[
    { path: '', component: AdminDashboardComponent},
    { path: 'users', component: UsersComponent},
<<<<<<< HEAD
    { path: 'work-in-progress', component: WorkInProgressComponent},
    { path: 'folder', component: FolderComponent }
=======
    { path: 'mindmap', component: MindMapComponent},
    { path: 'work-in-progress', component: WorkInProgressComponent}
>>>>>>> 1e6239b34beb3f2729dfea0fc3edc0479baac41d
  ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }