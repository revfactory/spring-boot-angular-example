import { User } from "./user";

export class Post {
    id: string;
    subject: string;
    comments: Comment[];
    user: User;
}

export class Comment {
    id: string;
    reply: string;
    user: User;
}
