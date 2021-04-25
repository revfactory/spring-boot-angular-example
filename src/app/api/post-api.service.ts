import { Injectable } from '@angular/core'
import { Observable, Subject } from "rxjs";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Task } from 'app/models/task';
import { Page } from "../models/common";
import { Post } from "../models/post";


@Injectable()
export class PostApiService {
    constructor(private http: HttpClient) {
    }

    getPosts(): Observable<Post[]> {
        return this.http.get<Post[]>("/v2/posts");
    }


}
