import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DefaultLayoutComponent } from "../layout/default-layout/default-layout.component";
import { environment } from "../../environments/environment";

const routes: Routes = [
  { path: '', redirectTo: 'task', pathMatch: 'full' },
  {
    path: 'task',
    component: DefaultLayoutComponent,
    children: [{ path: '', loadChildren: () => import('./task/task.module').then((m) => m.TaskModule) }]
  },
  {
    path: 'post',
    component: DefaultLayoutComponent,
    children: [{ path: '', loadChildren: () => import('./post/post.module').then((m) => m.PostModule) }]
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {
      useHash: environment.useHash,
      relativeLinkResolution: 'legacy'
    })
  ],
  exports: [RouterModule]
})
export class RoutesRoutingModule { }
