import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PostRoutingModule } from './post-routing.module';
import { PostListComponent } from './post-list/post-list.component';
import { CommentComponent } from './comment/comment.component';
import { SharedModule } from "../../shared/shared.module";


@NgModule({
  declarations: [PostListComponent, CommentComponent],
  imports: [
    SharedModule,
    PostRoutingModule
  ]
})
export class PostModule { }
