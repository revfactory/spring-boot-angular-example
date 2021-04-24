insert into task(title, description, version) values ('task1', 'description1', 1);
insert into task(title, description, version) values ('두번째 작업', 'description2', 1);

insert into user(id, name, email) values (1, 'robin', 'robin@gmail.com');
insert into user(id, name, email) values (2, 'minho', 'minho@gmail.com');
insert into user(id, name, email) values (3, 'revfactory', 'revfactory@gmail.com');

insert into post(id, subject, user_id) values(1, '게시글1', 1);
insert into post(id, subject, user_id) values(2, '게시글1-2', 1);
insert into post(id, subject, user_id) values(3, '게시글1-3', 1);
insert into post(id, subject, user_id) values(4, '게시글2', 2);
insert into post(id, subject, user_id) values(5, '게시글2-1', 2);

insert into comment(id, reply, post_id, user_id) values(1, '댓글1', 1, 2);
insert into comment(id, reply, post_id, user_id) values(2, '댓글2', 1, 3);
insert into comment(id, reply, post_id, user_id) values(3, '댓글3', 1, 3);
insert into comment(id, reply, post_id, user_id) values(4, '댓글4', 2, 1);
insert into comment(id, reply, post_id, user_id) values(5, '댓글5', 2, 2);

