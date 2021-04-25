import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { TaskApiService } from "../api/task-api.service";
import { PostApiService } from "../api/post-api.service";

const SERVICES = [
  TaskApiService,
  PostApiService
]

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ],
  exports: [
    CommonModule,
    FormsModule,
    RouterModule,
    ReactiveFormsModule
  ],
  providers: [
    ...SERVICES
  ],
})
export class SharedModule { }
