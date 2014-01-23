--新增权限
INSERT INTO `rbac_privilege` (`id`, `privilege_name`, `privilege_desc`, `type`, `createby`, `create_date`, `delete_date`, `delete_flag`, `description`, `flag`, `remarks`, `updateby`, `update_date`) VALUES ('1', '新建任务流程', '建立一个流程任务，只有添加的功能', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--通用操作
INSERT INTO `rbac_action` (`id`, `action_id`, `action_name`, `action_desc`, `createby`, `create_date`, `delete_date`, `delete_flag`, `description`, `flag`, `remarks`, `updateby`, `update_date`) VALUES ('1', '001', '查询', '通用查询', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `rbac_action` (`id`, `action_id`, `action_name`, `action_desc`, `createby`, `create_date`, `delete_date`, `delete_flag`, `description`, `flag`, `remarks`, `updateby`, `update_date`) VALUES ('2', '002', '新增', '通用增加', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `rbac_action` (`id`, `action_id`, `action_name`, `action_desc`, `createby`, `create_date`, `delete_date`, `delete_flag`, `description`, `flag`, `remarks`, `updateby`, `update_date`) VALUES ('3', '003', '修改', '通用修改', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `rbac_action` (`id`, `action_id`, `action_name`, `action_desc`, `createby`, `create_date`, `delete_date`, `delete_flag`, `description`, `flag`, `remarks`, `updateby`, `update_date`) VALUES ('4', '004', '删除', '通用删除', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--菜单测试用例
INSERT INTO `rbac_menu` (`id`, `href`, `icon`, `is_show`, `menu_name`, `permission`, `sort`, `target`, `parent_id`) VALUES ('1', '', NULL, '1', '系统资源', NULL, '1', NULL, NULL);
INSERT INTO `rbac_menu` (`id`, `href`, `icon`, `is_show`, `menu_name`, `permission`, `sort`, `target`, `parent_id`) VALUES ('2', NULL, NULL, '1', '用户管理', NULL, '2', NULL, NULL);
INSERT INTO `rbac_menu` (`id`, `href`, `icon`, `is_show`, `menu_name`, `permission`, `sort`, `target`, `parent_id`) VALUES ('3', NULL, NULL, '1', '测试管理', NULL, '3', NULL, NULL);
INSERT INTO `rbac_menu` (`id`, `href`, `icon`, `is_show`, `menu_name`, `permission`, `sort`, `target`, `parent_id`) VALUES ('4', '/task', NULL, '1', '流程任务', NULL, '1', NULL, '3');
INSERT INTO `rbac_menu` (`id`, `href`, `icon`, `is_show`, `menu_name`, `permission`, `sort`, `target`, `parent_id`) VALUES ('5', '/login', NULL, '1', '用户登陆', NULL, '2', NULL, '3');

---用户测试用例
INSERT INTO rbac_user (id, create_date, delete_date, delete_flag, description, flag, remarks, update_date, account_status, ename, enable, last_login_time, login_id, login_ip, name, nick_name, password, regesit_time, salt) VALUES ('10000', '2014-01-21 21:17:16', NULL, NULL, NULL, '1', NULL, NULL, 0, 'admin', NULL, NULL, 'admin', NULL, '管理员', NULL, '691b14d79bf0fa2215f155235df5e670b64394cc', '2014-01-21 16:33:36', '9c27e54520958714');

INSERT INTO rbac_user (id, create_date, delete_date, delete_flag, description, flag, remarks, update_date, account_status, ename, enable, last_login_time, login_id, login_ip, name, nick_name, password, regesit_time, salt) VALUES ('2', '2014-01-21 21:17:12', NULL, NULL, NULL, '1', NULL, NULL, 0, 'user', NULL, NULL, 'user', NULL, '普通用户', NULL, '691b14d79bf0fa2215f155235df5e670b64394cc', '2014-01-21 16:33:36', '9c27e54520958714');

--插入任务测试数据
insert into rbac_task (id, title, description, login_id) values(1, 'Study PlayFramework 2.0','http://www.playframework.org/', 1);
insert into rbac_task (id, title, description, login_id) values(2, 'Study Grails 2.0','http://www.grails.org/', 1);
insert into rbac_task (id, title, description, login_id) values(3, 'Try SpringFuse','http://www.springfuse.com/', 1);
insert into rbac_task (id, title, description, login_id) values(4, 'Try Spring Roo','http://www.springsource.org/spring-roo', 1);
insert into rbac_task (id, title, description, login_id) values(5, 'Release SpringSide 4.0','As soon as posibble.', 1);

