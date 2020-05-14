import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

/** Home Component */
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { LinkComponent } from './components/link/link.component';

const routes: Routes = [

  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes, { onSameUrlNavigation: 'reload', enableTracing: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
