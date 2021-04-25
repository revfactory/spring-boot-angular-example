import { NgModule } from '@angular/core';
import { DefaultLayoutComponent } from './default-layout/default-layout.component';
import { SharedModule } from "../shared/shared.module";


@NgModule({
  declarations: [DefaultLayoutComponent],
  imports: [
    SharedModule
  ]
})
export class LayoutModule { }
