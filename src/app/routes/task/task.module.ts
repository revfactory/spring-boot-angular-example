import { NgModule } from '@angular/core';

import { TaskRoutingModule } from './task-routing.module';
import { TaskComponent } from "./task.component";
import { TaskItemComponent } from "./task-item/task-item.component";
import { TaskCreateComponent } from "./task-create/task-create.component";
import { SharedModule } from "../../shared/shared.module";
import { TaskEditModeService } from "./service/task-edit-mode.service";


@NgModule({
  declarations: [
    TaskComponent,
    TaskItemComponent,
    TaskCreateComponent
  ],
  imports: [
    SharedModule,
    TaskRoutingModule
  ],
  providers: [
      TaskEditModeService
  ],
})
export class TaskModule { }
