
select
    m.menuid
     , menuitemcode
     , menulanguage
     , menutext
     , mt.menutypecode as menuCode
     , mt_sub.menutypecode as subMenu
from
    Menu m
    join MenuTypeMenu mtm
        on mtm.menuid = m.menuid
    join MenuType mt
        on mt.menutypeid = mtm.menutypeid
     join MenuSecurityRole msr
         on msr.menuid = m.menuid
    join SecurityRole sr
        on sr.securityroleid = msr.securityroleid
    left join MenuType mt_sub
        on mt_sub.menutypeid = m.submenutypeid
where
    mt.menutypecode='main'
    and
    sr.code = 'admin'
order by
        MenuOrder;

--select * from MenuSecurityRole
select * from MenuSecurityRole where securityroleid=3
select * from Menu;

insert into menusecurityrole (menuid, securityroleid)
    select
        menuid, securityroleid
            from
                Menu m,
                SecurityRole sr
            where
                m.menutext in ('Manage Genres','User Management')
                and
                sr.code='admin';


-- select * from menu;
-- select * from menutype;
-- select * from menutypemenu;

-- create table MenuType
-- (
--     MenuTypeId      serial not null,
--     MenuTypeCode    varchar(20) not null,
--     MenuMessage     varchar(100),
--     constraint pk_MenuType primary key (MenuTypeId),
--     constraint uq_MenuType_MenuTypeCode unique (MenuTypeCode)
-- );
-- create table Menu
-- (
--     MenuId          serial not null,
--     MenuItemCode    varchar(20),
--     MenuLanguage    varchar(5) not null default ('en-GB'),
--     MenuText        varchar(100) not null,
--     SubMenuTypeId   int,
--     constraint pk_Menu primary key (MenuId),
--     constraint fk_Menu_MenuType foreign key (SubMenuTypeId) references MenuType
-- );
--
-- create table MenuTypeMenu
-- (
--     MenuId      int not null,
--     MenuTypeId  int not null,
--     MenuOrder   int not null ,
--     constraint pk_MenuTypeMenu primary key (MenuId, MenuTypeId),
--     constraint fk_MenuTypeMenu_Menu foreign key (MenuId) references Menu,
--     constraint fk_MenuTypeMenu_MenuType foreign key (MenuTypeId) references MenuType
-- );
--
-- create table SecurityRole
-- (
--     SecurityRoleId      serial not null,
--     Code                varchar(20) not null,
--     constraint pk_SecurityRole primary key (SecurityRoleId),
--     constraint uq_SecurityRole_Code unique (Code)
-- );
--
-- create table MenuSecurityRole
-- (
--     MenuId          int not null,
--     SecurityRoleId  int not null,
--     constraint pk_MenuSecurityRole primary key  (MenuId,SecurityRoleId),
--     constraint fk_MenuSecurityRole_Role foreign key (SecurityRoleId) references SecurityRole,
--     constraint fk_MenuSecurityRole_Menu foreign key (MenuId) references Menu
-- );



-- --test
-- select * from RecordLabel;
--
-- select
--         genreid,
--         genrename,
--         genredescription
--     from
--         Genre
--     where
--         genreid = 55;
--
-- insert into genre (genrename, genredescription) values (:genrename, :genredescription);
--
-- select
--                 albumid,
--                 title,
--                 a.recordlabelid,
--                 a.artistid,
--                 price,
--                 currentinventory,
--                 ar.artistname,
--                 r.labelname
--                 from
--                     album a
--                     left join recordlabel r
--                         on a.recordlabelid = r.recordlabelid
--                     join artist ar
--                         on a.artistid = ar.artistid
--
--
-- select
--     albumid,
--     title,
--     a.recordlabelid,
--     a.artistid,
--     price,
--     currentinventory,
--     ar.artistname,
--     r.labelname
-- from
--     album a
--         left join recordlabel r
--                   on a.recordlabelid = r.recordlabelid
--         join artist ar
--              on a.artistid = ar.artistid
-- where
--     a.title like '%B%'
--     and
--     ar.artistname like '%%'
