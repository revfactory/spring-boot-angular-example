import { Component, OnInit } from '@angular/core';
import { PostApiService } from "../../../api/post-api.service";
import { Post } from "../../../models/post";
import { Observable } from "rxjs";

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  posts$: Observable<Post[]>;

  constructor(
      private postApiService: PostApiService,
  ) { }

  ngOnInit(): void {
    this.posts$ = this.postApiService.getPosts();
  }

}
