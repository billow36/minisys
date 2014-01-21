insert into rbac_task (id, title, description, login_id) values(1, 'Study PlayFramework 2.0','http://www.playframework.org/', 1);
insert into rbac_task (id, title, description, login_id) values(2, 'Study Grails 2.0','http://www.grails.org/', 1);
insert into rbac_task (id, title, description, login_id) values(3, 'Try SpringFuse','http://www.springfuse.com/', 1);
insert into rbac_task (id, title, description, login_id) values(4, 'Try Spring Roo','http://www.springsource.org/spring-roo', 1);
insert into rbac_task (id, title, description, login_id) values(5, 'Release SpringSide 4.0','As soon as posibble.', 1);

INSERT INTO rbac_user (id, create_date, delete_date, delete_flag, description, flag, remarks, update_date, account_status, ename, enable, last_login_time, login_id, login_ip, name, nick_name, password, regesit_time, salt) VALUES ('1', '2014-01-21 21:17:16', NULL, NULL, NULL, '1', NULL, NULL, 0, 'admin', NULL, NULL, 'admin', NULL, '管理员', NULL, '691b14d79bf0fa2215f155235df5e670b64394cc', '2014-01-21 16:33:36', NULL);

INSERT INTO rbac_user (id, create_date, delete_date, delete_flag, description, flag, remarks, update_date, account_status, ename, enable, last_login_time, login_id, login_ip, name, nick_name, password, regesit_time, salt) VALUES ('2', '2014-01-21 21:17:12', NULL, NULL, NULL, '1', NULL, NULL, 0, 'user', NULL, NULL, 'user', NULL, '普通用户', NULL, '691b14d79bf0fa2215f155235df5e670b64394cc', '2014-01-21 16:33:36', NULL);
