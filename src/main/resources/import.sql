insert into task(title, description, version) values ('task1', 'description1', 1);
insert into task(title, description, version) values ('두번째 작업', 'description2', 1);

insert into user(id, name, email) values (1, 'robin', 'robin.hwang@kakaocorp.com');
insert into user(id, name, email) values (2, 'sean', 'sean.gold@kakaocorp.com');
insert into user(id, name, email) values (3, 'yally', 'yally.next@kakaocorp.com');

insert into post(id, subject, user_id) values(1, 'Agnular 스터디 계획', 1);
insert into post(id, subject, user_id) values(2, 'Refactoring 목록', 1);
insert into post(id, subject, user_id) values(3, '오픈소스 현황', 1);
insert into post(id, subject, user_id) values(4, 'TDD 고찰', 2);
insert into post(id, subject, user_id) values(5, 'PM 분석기 배포', 2);

insert into comment(id, reply, post_id, user_id) values(1, '기대됩니다.', 1, 2);
insert into comment(id, reply, post_id, user_id) values(2, '오호!!', 1, 3);
insert into comment(id, reply, post_id, user_id) values(3, '언제부터 하나요?', 1, 3);
insert into comment(id, reply, post_id, user_id) values(4, '다음 스프린트에 해볼까요?', 2, 1);
insert into comment(id, reply, post_id, user_id) values(5, '찬성합니다.', 2, 2);

