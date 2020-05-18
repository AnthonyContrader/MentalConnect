import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminLayoutComponent } from '../layout/admin-layout/admin-layout.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
<<<<<<< HEAD

import { FolderComponent } from './folder/folder.component';
import { MindMapComponent } from './mindmap/mindmap.component';

=======
import { FolderComponent } from './folder/folder.component';
import { MindMapComponent } from './mindmap/mindmap.component';
<<<<<<< HEAD
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
=======
import { ElixirmapComponent } from './elixirmap/elixirmap.component';
>>>>>>> 73cd6b69699db5fcf0980b32fd0c76ceeb6f2a64

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
    { path: 'folder', component: FolderComponent },

    { path: 'mindmap', component: MindMapComponent},
    { path: 'work-in-progress', component: WorkInProgressComponent}

=======
    { path: 'work-in-progress', component: WorkInProgressComponent},
    { path: 'folder', component: FolderComponent },
    { path: 'mindmap', component: MindMapComponent},
    { path: 'mindelixir', component: ElixirmapComponent},
    { path: 'work-in-progress', component: WorkInProgressComponent}
>>>>>>> c9e9c4b054fc0083cf47767eb9c410bed73bfabb
  ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }