/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 11                       */
/* Created on:     2014/1/16 17:03:18                           */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_njecc2ydqws93ggnsgkejyiqq') then
    alter table dbo.RBAC_ACTION_PRIVILEGE
       delete foreign key FK_njecc2ydqws93ggnsgkejyiqq
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_qwnw12ow3qyvnykprsmr2ddoe') then
    alter table dbo.RBAC_ACTION_PRIVILEGE
       delete foreign key FK_qwnw12ow3qyvnykprsmr2ddoe
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_ACT_REFERENCE_RBAC_MEN') then
    alter table dbo.RBAC_ACTION_PRIVILEGE
       delete foreign key FK_RBAC_ACT_REFERENCE_RBAC_MEN
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_trr2p5p1syfgm7hr07m22rq1p') then
    alter table dbo.RBAC_AREA
       delete foreign key FK_trr2p5p1syfgm7hr07m22rq1p
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_4e8c4sndx5i2s82t3kedlep7h') then
    alter table dbo.RBAC_COMPANY
       delete foreign key FK_4e8c4sndx5i2s82t3kedlep7h
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_mui753gfwq0pq33tqam0rdetc') then
    alter table dbo.RBAC_COMPANY
       delete foreign key FK_mui753gfwq0pq33tqam0rdetc
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_jonemj12ip06jltp4oolkpbyb') then
    alter table dbo.RBAC_COMPANY_ROLE
       delete foreign key FK_jonemj12ip06jltp4oolkpbyb
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_lqwch1o02jta1q7o6nyvpneta') then
    alter table dbo.RBAC_COMPANY_ROLE
       delete foreign key FK_lqwch1o02jta1q7o6nyvpneta
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_GRO_REFERENCE_RBAC_GRO') then
    alter table dbo.RBAC_GROUP_ROLE
       delete foreign key FK_RBAC_GRO_REFERENCE_RBAC_GRO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_GRO_REFERENCE_RBAC_ROL') then
    alter table dbo.RBAC_GROUP_ROLE
       delete foreign key FK_RBAC_GRO_REFERENCE_RBAC_ROL
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_4r56ocrdv8rfcn3ra0s0lxq3d') then
    alter table dbo.RBAC_MENU
       delete foreign key FK_4r56ocrdv8rfcn3ra0s0lxq3d
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_POS_REFERENCE_RBAC_ORG') then
    alter table dbo.RBAC_POSITION
       delete foreign key FK_RBAC_POS_REFERENCE_RBAC_ORG
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_POS_REFERENCE_RBAC_COM') then
    alter table dbo.RBAC_POSITION
       delete foreign key FK_RBAC_POS_REFERENCE_RBAC_COM
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_8blrsuu3horl77de0bpb0wpj4') then
    alter table dbo.RBAC_PRIVILEGE_MENU
       delete foreign key FK_8blrsuu3horl77de0bpb0wpj4
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ta7a6w4edg57ntqed8ikexuux') then
    alter table dbo.RBAC_PRIVILEGE_MENU
       delete foreign key FK_ta7a6w4edg57ntqed8ikexuux
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_cr00s5ta6sh8itla4f6h08u5s') then
    alter table dbo.RBAC_ROLE
       delete foreign key FK_cr00s5ta6sh8itla4f6h08u5s
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_p4kq3bsx47gju0wvbk9ljaldx') then
    alter table dbo.RBAC_ROLE_PRIVILEGE
       delete foreign key FK_p4kq3bsx47gju0wvbk9ljaldx
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_rbvbml7v3kws2p1rdjqhsj5p4') then
    alter table dbo.RBAC_ROLE_PRIVILEGE
       delete foreign key FK_rbvbml7v3kws2p1rdjqhsj5p4
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_n4f4qblj81fhqhj2i5jed9t1e') then
    alter table dbo.RBAC_USER
       delete foreign key FK_n4f4qblj81fhqhj2i5jed9t1e
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_24htwemnnwwx1kg64g3ystnbp') then
    alter table dbo.RBAC_USER_GROUP
       delete foreign key FK_24htwemnnwwx1kg64g3ystnbp
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_9tgv4x0ytvpsy1t3mlgkj9f5e') then
    alter table dbo.RBAC_USER_GROUP
       delete foreign key FK_9tgv4x0ytvpsy1t3mlgkj9f5e
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_USE_REFERENCE_RBAC_GRO') then
    alter table dbo.RBAC_USER_GROUP
       delete foreign key FK_RBAC_USE_REFERENCE_RBAC_GRO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_gdxqx2mk4gpm06ws5s5b4f02u') then
    alter table dbo.RBAC_USER_POSITION
       delete foreign key FK_gdxqx2mk4gpm06ws5s5b4f02u
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ge753nadkcifhoh6oxim1v26f') then
    alter table dbo.RBAC_USER_POSITION
       delete foreign key FK_ge753nadkcifhoh6oxim1v26f
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_USE_REFERENCE_RBAC_POS') then
    alter table dbo.RBAC_USER_POSITION
       delete foreign key FK_RBAC_USE_REFERENCE_RBAC_POS
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_USE_REFERENCE_RBAC_USE') then
    alter table RBAC_USER_ROLE
       delete foreign key FK_RBAC_USE_REFERENCE_RBAC_USE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RBAC_USE_REFERENCE_RBAC_ROL') then
    alter table RBAC_USER_ROLE
       delete foreign key FK_RBAC_USE_REFERENCE_RBAC_ROL
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_ACTION'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_ACTION
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_ACTION_PRIVILEGE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_ACTION_PRIVILEGE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_AREA'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_AREA
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_COMPANY'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_COMPANY
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_COMPANY_ROLE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_COMPANY_ROLE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_DICT'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_DICT
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_GROUP'
     and table_type in ('BASE', 'GBL TEMP')
) then
    drop table RBAC_GROUP
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_GROUP_ROLE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_GROUP_ROLE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_MENU'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_MENU
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_ORG_LEVEL'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_ORG_LEVEL
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_POSITION'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_POSITION
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_PRIVILEGE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_PRIVILEGE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_PRIVILEGE_MENU'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_PRIVILEGE_MENU
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_ROLE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_ROLE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_ROLE_PRIVILEGE'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_ROLE_PRIVILEGE
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_USER'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_USER
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_USER_EXT'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_USER_EXT
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_USER_GROUP'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_USER_GROUP
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_USER_POSITION'
     and table_type in ('BASE', 'GBL TEMP')
     and creator=user_id('dbo')
) then
    drop table dbo.RBAC_USER_POSITION
end if;

if exists(
   select 1 from sys.systable 
   where table_name='RBAC_USER_ROLE'
     and table_type in ('BASE', 'GBL TEMP')
) then
    drop table RBAC_USER_ROLE
end if;

revoke connect from dbo;

/*==============================================================*/
/* User: dbo                                                    */
/*==============================================================*/
grant connect to dbo identified by "";

/*==============================================================*/
/* Table: RBAC_ACTION                                           */
/*==============================================================*/
create table dbo.RBAC_ACTION 
(
   ID                   numeric(19)                    not null default autoincrement,
   ACTION_ID            varchar(32)                    not null,
   ACTION_NAME          varchar(32)                    null,
   PREFIX_URL           varchar(32)                    null,
   constraint PK__RBAC_ACTION__52AE4273 primary key clustered (ID),
   constraint UK_cd69ctkdbaffhc0nlsebqdo90 unique (ACTION_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_ACTION_PRIVILEGE                                 */
/*==============================================================*/
create table dbo.RBAC_ACTION_PRIVILEGE 
(
   ID                   int                            not null default autoincrement,
   PRIVILEGE_ID         numeric(19)                    null,
   ACTION_ID            varchar(32)                    null,
   MENU_ID              varchar(32)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_PRIVILEGE_A__60083D91 primary key clustered (ID),
   constraint UK_q1okcnfdm5o16q3hoxk6apqgm unique (PRIVILEGE_ID, ACTION_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_AREA                                             */
/*==============================================================*/
create table dbo.RBAC_AREA 
(
   ID                   varchar(36)                    not null,
   AREA_ID              varchar(36)                    not null,
   CODE                 varchar(36)                    null,
   PARENT_IDS           varchar(36)                    null,
   TYPE                 int                            null,
   PARENT_ID            varchar(36)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_AREA__54968AE5 primary key clustered (ID),
   constraint UK_iwdcim840ulkkl3rm2d26gdec unique (AREA_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_COMPANY                                          */
/*==============================================================*/
create table dbo.RBAC_COMPANY 
(
   ID                   varchar(36)                    not null,
   ADDRESS              varchar(128)                   null,
   CODE                 varchar(36)                    null,
   COMPANY_ID           varchar(36)                    not null,
   GRADE                int                            null,
   LEVEL                int                            null,
   PARENT_IDS           varchar(36)                    null,
   TYPE                 int                            null,
   WORK_PHONE           varchar(128)                   null,
   ZIP_WORK             varchar(128)                   null,
   AREA_ID              varchar(36)                    null,
   PARENT_ID            varchar(36)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_COMPANY__567ED357 primary key clustered (ID),
   constraint UK_44n848qxloae4fyfgp0b2ntr9 unique (COMPANY_ID),
   constraint UK_4e8c4sndx5i2s82t3kedlep7h unique (AREA_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_COMPANY_ROLE                                     */
/*==============================================================*/
create table dbo.RBAC_COMPANY_ROLE 
(
   ID                   int                            not null default autoincrement,
   COMPANY_ID           varchar(36)                    null,
   ROLE_ID              varchar(36)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_COMPANY_ROL__58671BC9 primary key clustered (ID),
   constraint UK_gxt55tal15v06f4pvh1ejls3s unique (ROLE_ID, COMPANY_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_DICT                                             */
/*==============================================================*/
create table dbo.RBAC_DICT 
(
   ID                   numeric(19)                    not null default autoincrement,
   LABEL                varchar(255)                   null,
   SORT                 int                            null,
   TYPE                 varchar(255)                   null,
   VALUE                varchar(255)                   null,
   AUTHOR               varchar(32)                    null,
   DESCRIPTION          varchar(255)                   null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_DICT__5A4F643B primary key clustered (ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_GROUP                                            */
/*==============================================================*/
create table RBAC_GROUP 
(
   ID                   char(36)                       not null,
   GROUP_NAME           varchar                        null,
   GROUP_DESC           varchar                        null,
   constraint PK_RBAC_GROUP primary key clustered (ID)
);

/*==============================================================*/
/* Table: RBAC_GROUP_ROLE                                       */
/*==============================================================*/
create table dbo.RBAC_GROUP_ROLE 
(
   ID                   int                            not null default autoincrement,
   ROLE_ID              varchar(36)                    null,
   GROUP_ID             varchar(32)                    null,
   AUTHOR               varchar(32)                    null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   REMARK               varchar(64)                    null,
   constraint PK__RBAC_USER_ROLE__6D6238AF primary key clustered (ID),
   constraint UK_hax5df7wrocs1clb7ryrs4iel unique (ROLE_ID, GROUP_ID)
)
on "PRIMARY";

comment on table dbo.RBAC_GROUP_ROLE is 
'以组为单位授权';

/*==============================================================*/
/* Table: RBAC_MENU                                             */
/*==============================================================*/
create table dbo.RBAC_MENU 
(
   ID                   numeric(19)                    not null default autoincrement,
   HREF                 varchar(255)                   null,
   ICON                 varchar(255)                   null,
   IS_SHOW              varchar(255)                   null,
   NAME                 varchar(255)                   null,
   PARENT_IDS           varchar(255)                   null,
   PERMISSION           varchar(255)                   null,
   SORT                 int                            null,
   TARGET               varchar(255)                   null,
   PARENT_ID            numeric(19)                    null,
   constraint PK__RBAC_MENU__5C37ACAD primary key clustered (ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_ORG_LEVEL                                        */
/*==============================================================*/
create table dbo.RBAC_ORG_LEVEL 
(
   ID                   varchar(32)                    not null,
   ORG_LEVEL_NAME       varchar                        null,
   ORG_LEVEL_DESC       varchar(128)                   null,
   constraint PK__RBAC_USER_EXT__6B79F03D primary key clustered (ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_POSITION                                         */
/*==============================================================*/
create table dbo.RBAC_POSITION 
(
   ID                   varchar(32)                    not null,
   ORG_LEVEL_ID         varchar(32)                    null,
   COMPANY_ID           varchar(32)                    null,
   POSITION_NAME        varchar                        null,
   POSITION_DESC        varchar                        null,
   constraint PK__RBAC_USER_EXT__6B79F03D primary key clustered (ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_PRIVILEGE                                        */
/*==============================================================*/
create table dbo.RBAC_PRIVILEGE 
(
   ID                   numeric(19)                    not null default autoincrement,
   NAME                 varchar(32)                    null,
   TYPE                 int                            null,
   constraint PK__RBAC_PRIVILEGE__5E1FF51F primary key clustered (ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_PRIVILEGE_MENU                                   */
/*==============================================================*/
create table dbo.RBAC_PRIVILEGE_MENU 
(
   ID                   int                            not null default autoincrement,
   MENU_ID              numeric(19)                    null,
   PRIVILEGE_ID         numeric(19)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_PRIVILEGE_M__61F08603 primary key clustered (ID),
   constraint UK_2a1qt2bternqk1t96q3yb591q unique (PRIVILEGE_ID, MENU_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_ROLE                                             */
/*==============================================================*/
create table dbo.RBAC_ROLE 
(
   ID                   varchar(36)                    not null,
   LEVEL                int                            null,
   PARENT_IDS           varchar(36)                    null,
   ROLE_ID              varchar(36)                    not null,
   ROLE_NAME            varchar(36)                    null,
   ROLE_TYPE            int                            null,
   PARENT_ID            varchar(36)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_ROLE__63D8CE75 primary key clustered (ID),
   constraint UK_60l1oe39eon3r5tydstq2tgpq unique (ROLE_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_ROLE_PRIVILEGE                                   */
/*==============================================================*/
create table dbo.RBAC_ROLE_PRIVILEGE 
(
   ID                   int                            not null default autoincrement,
   PRIVILEGE_ID         numeric(19)                    null,
   ROLE_ID              varchar(36)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_ROLE_PRIVIL__65C116E7 primary key clustered (ID),
   constraint UK_pgd7y5ib7utn0802vsoo60112 unique (PRIVILEGE_ID, ROLE_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_USER                                             */
/*==============================================================*/
create table dbo.RBAC_USER 
(
   ID                   varchar(36)                    not null,
   ENAME                varchar(32)                    null,
   LOGIN_ID             varchar(32)                    not null,
   LOGIN_TIME           datetime                       null,
   NAME                 varchar(32)                    null,
   NICK_NAME            varchar(32)                    null,
   PASSWORD             varchar(32)                    null,
   REGISTER_TIME        datetime                       null,
   SALT                 varchar(255)                   null,
   USER_ID              varchar(32)                    not null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_USER__67A95F59 primary key clustered (ID),
   constraint UK_awsit9ihl0pglo85cxbxfsxey unique (LOGIN_ID),
   constraint UK_n4f4qblj81fhqhj2i5jed9t1e unique (USER_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_USER_EXT                                         */
/*==============================================================*/
create table dbo.RBAC_USER_EXT 
(
   USER_ID              varchar(32)                    not null,
   IS_APPROVED          bit                            null,
   EMAIL                varchar(128)                   null,
   FAILED_PASSWORD_ANSWER_ATTEMP_COUNT int                            null,
   FAILED_PASSWORD_ATTEMP_COUNT int                            null,
   lastPasswordChanged  datetime                       null,
   IS_LOCKED_OUT        bit                            null,
   MOBILE               varchar(128)                   null,
   PASSWORD_ANSWER      varchar(128)                   null,
   PASSWORD_QUESTION    varchar(128)                   null,
   constraint PK__RBAC_USER_EXT__6B79F03D primary key clustered (USER_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_USER_GROUP                                       */
/*==============================================================*/
create table dbo.RBAC_USER_GROUP 
(
   ID                   int                            not null default autoincrement,
   GROUP_ID             varchar(36)                    null,
   USER_ID              varchar(32)                    null,
   AUTHOR               varchar(32)                    null,
   CREATE_TIME          datetime                       null,
   DELETE_TIME          datetime                       null,
   DESCRIPTION          varchar(64)                    null,
   ENABLE               bit                            null,
   FLAG                 int                            null,
   OPERATION            varchar(32)                    null,
   REMARK               varchar(64)                    null,
   RESERVER             varchar(64)                    null,
   UPDATE_TIME          datetime                       null,
   constraint PK__RBAC_USER_ROLE__6D6238AF primary key clustered (ID),
   constraint UK_hax5df7wrocs1clb7ryrs4iel unique (GROUP_ID, USER_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_USER_POSITION                                    */
/*==============================================================*/
create table dbo.RBAC_USER_POSITION 
(
   ID                   int                            not null default autoincrement,
   POSITION_ID          varchar(36)                    null,
   USER_ID              varchar(32)                    null,
   constraint PK__RBAC_USER_COMPAN__6991A7CB primary key clustered (ID),
   constraint UK_ffkeg1j55y30o1rtspbgpbo1h unique (POSITION_ID, USER_ID)
)
on "PRIMARY";

/*==============================================================*/
/* Table: RBAC_USER_ROLE                                        */
/*==============================================================*/
create table RBAC_USER_ROLE 
(
   ID                   varchar(32)                    null,
   USER_ID              varchar(32)                    null,
   ROLE_ID              varchar(32)                    null
);

comment on table RBAC_USER_ROLE is 
'用户角色直接授权';

alter table dbo.RBAC_ACTION_PRIVILEGE
   add constraint FK_njecc2ydqws93ggnsgkejyiqq foreign key (ACTION_ID)
      references dbo.RBAC_ACTION (ACTION_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_ACTION_PRIVILEGE
   add constraint FK_qwnw12ow3qyvnykprsmr2ddoe foreign key (PRIVILEGE_ID)
      references dbo.RBAC_PRIVILEGE (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_ACTION_PRIVILEGE
   add constraint FK_RBAC_ACT_REFERENCE_RBAC_MEN foreign key (MENU_ID)
      references dbo.RBAC_MENU (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_AREA
   add constraint FK_trr2p5p1syfgm7hr07m22rq1p foreign key (PARENT_ID)
      references dbo.RBAC_AREA (AREA_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_COMPANY
   add constraint FK_4e8c4sndx5i2s82t3kedlep7h foreign key (AREA_ID)
      references dbo.RBAC_AREA (AREA_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_COMPANY
   add constraint FK_mui753gfwq0pq33tqam0rdetc foreign key (PARENT_ID)
      references dbo.RBAC_COMPANY (AREA_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_COMPANY_ROLE
   add constraint FK_jonemj12ip06jltp4oolkpbyb foreign key (COMPANY_ID)
      references dbo.RBAC_COMPANY (COMPANY_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_COMPANY_ROLE
   add constraint FK_lqwch1o02jta1q7o6nyvpneta foreign key (ROLE_ID)
      references dbo.RBAC_ROLE (ROLE_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_GROUP_ROLE
   add constraint FK_RBAC_GRO_REFERENCE_RBAC_GRO foreign key (ID)
      references RBAC_GROUP (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_GROUP_ROLE
   add constraint FK_RBAC_GRO_REFERENCE_RBAC_ROL foreign key (ROLE_ID)
      references dbo.RBAC_ROLE (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_MENU
   add constraint FK_4r56ocrdv8rfcn3ra0s0lxq3d foreign key (PARENT_ID)
      references dbo.RBAC_MENU (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_POSITION
   add constraint FK_RBAC_POS_REFERENCE_RBAC_ORG foreign key (ORG_LEVEL_ID)
      references dbo.RBAC_ORG_LEVEL (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_POSITION
   add constraint FK_RBAC_POS_REFERENCE_RBAC_COM foreign key (COMPANY_ID)
      references dbo.RBAC_COMPANY (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_PRIVILEGE_MENU
   add constraint FK_8blrsuu3horl77de0bpb0wpj4 foreign key (PRIVILEGE_ID)
      references dbo.RBAC_PRIVILEGE (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_PRIVILEGE_MENU
   add constraint FK_ta7a6w4edg57ntqed8ikexuux foreign key (MENU_ID)
      references dbo.RBAC_MENU (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_ROLE
   add constraint FK_cr00s5ta6sh8itla4f6h08u5s foreign key (PARENT_ID)
      references dbo.RBAC_ROLE (ROLE_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_ROLE_PRIVILEGE
   add constraint FK_p4kq3bsx47gju0wvbk9ljaldx foreign key (ROLE_ID)
      references dbo.RBAC_ROLE (ROLE_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_ROLE_PRIVILEGE
   add constraint FK_rbvbml7v3kws2p1rdjqhsj5p4 foreign key (PRIVILEGE_ID)
      references dbo.RBAC_PRIVILEGE (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER
   add constraint FK_n4f4qblj81fhqhj2i5jed9t1e foreign key (USER_ID)
      references dbo.RBAC_USER_EXT (USER_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_GROUP
   add constraint FK_24htwemnnwwx1kg64g3ystnbp foreign key (USER_ID)
      references dbo.RBAC_USER (USER_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_GROUP
   add constraint FK_9tgv4x0ytvpsy1t3mlgkj9f5e foreign key (GROUP_ID)
      references dbo.RBAC_ROLE (ROLE_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_GROUP
   add constraint FK_RBAC_USE_REFERENCE_RBAC_GRO foreign key (GROUP_ID)
      references RBAC_GROUP (ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_POSITION
   add constraint FK_gdxqx2mk4gpm06ws5s5b4f02u foreign key (POSITION_ID)
      references dbo.RBAC_COMPANY (COMPANY_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_POSITION
   add constraint FK_ge753nadkcifhoh6oxim1v26f foreign key (USER_ID)
      references dbo.RBAC_USER (USER_ID)
      on update restrict
      on delete restrict;

alter table dbo.RBAC_USER_POSITION
   add constraint FK_RBAC_USE_REFERENCE_RBAC_POS foreign key (POSITION_ID)
      references dbo.RBAC_POSITION (ID)
      on update restrict
      on delete restrict;

alter table RBAC_USER_ROLE
   add constraint FK_RBAC_USE_REFERENCE_RBAC_USE foreign key (USER_ID)
      references dbo.RBAC_USER (ID)
      on update restrict
      on delete restrict;

alter table RBAC_USER_ROLE
   add constraint FK_RBAC_USE_REFERENCE_RBAC_ROL foreign key (ROLE_ID)
      references dbo.RBAC_ROLE (ID)
      on update restrict
      on delete restrict;

