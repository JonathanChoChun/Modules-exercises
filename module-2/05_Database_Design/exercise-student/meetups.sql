

-- drop tables
drop table if exists Member, InterestGroup, Event,MemberEvent,MemberInterestGroup;


-- create tables

create table Member
(
    MemberNumber serial not null,
    LastName varchar(50) not null,
    FirstName varchar(50) not null,
    EmailAddress varchar(100),
    PhoneNumber varchar(50),
    DateOfBirth date,
    WantReminder bool,
    constraint pk_Member primary key (MemberNumber)
);

create table InterestGroup
(
    GroupName varchar(50),
    GroupNumber serial not null,
    constraint pk_InterestGroup primary key (GroupName),
    constraint uq_InterestGroup_GroupName unique (GroupName)
);

create table Event
(
    EventNumber serial not null,
    EventName varchar(50),
    startDateTime timestamp,
    Duration integer,
    GroupName varchar(50),
    constraint pk_Event primary key (EventNumber),
    constraint fk_Event_InterestGroup_GroupName foreign key (GroupName) references InterestGroup
);

create table MemberEvent
(
    MemberNumber integer,
    EventNumber integer,
    constraint pk_MemberEvent primary key (MemberNumber,EventNumber),
    constraint fk_MemberEvent_MemberNumber foreign key (MemberNumber) references Member,
    constraint fk_MemberEvent_EventNumber foreign key (EventNumber) references Event
);

create table MemberInterestGroup
(
    MemberNumber integer,
    GroupName varchar(50),
    constraint pk_MemberInterestGroup primary key (MemberNumber,GroupName),
    constraint fk_MemberInterestGroup_MemberNumber foreign key (MemberNumber) references Member,
    constraint fk_MemberInterestGroup_GroupNumber foreign key (GroupName) references InterestGroup
);

-- insert value

insert into Member(LastName, FirstName, EmailAddress, PhoneNumber, DateOfBirth, WantReminder)
values(
       'McAlister',
       'Craig',
       'Craig@gmail.com',
       null,
       '1998-01-01',
       true
      ),
(
          'Cho',
          'Jonathan',
          'Craig@gmail.com',
          0758123577,
          '1998-07-04',
          true
      ),
      (
          'Robertson',
          'Bud',
          'Bud@yahoo.com',
          1234345346,
          '1997-01-15',
          false
        )
      ,
          (
           'Ocampos',
           'Rikki',
           null,
           1234345346,
           '1997-01-15',
           true
              ),
      (
          'Liceli',
          'Umut',
          null,
          1234345346,
          '1988-01-15',
          true
      );

insert into InterestGroup(GroupName) values ('techconnect committee');
insert into InterestGroup(GroupName) values ('SEP program committee');
insert into InterestGroup(GroupName) values ('tech for charity');
insert into InterestGroup(GroupName) values ('wider business');

insert into Event(EventName, startDateTime, Duration, GroupName) values ('techconnect','2022-07-06 09:00:00',86400,(select GroupName from InterestGroup where GroupName='techconnect committee'));
insert into Event(EventName, startDateTime, Duration, GroupName) values ('SEP two years program','2022-10-01 09:00:00',14400,(select GroupName from InterestGroup where GroupName='SEP program committee'));
insert into Event(EventName, startDateTime, Duration, GroupName) values ('SEP induction',null,null,null);
insert into Event(EventName, startDateTime, Duration, GroupName) values ('Force for good challenge','2022-10-01 09:00:00',14400,(select GroupName from InterestGroup where GroupName='tech for charity'));

insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where FirstName='Umut'),(select EventNumber from Event where EventName='techconnect'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where FirstName='Jonathan'),(select EventNumber from Event where EventName='techconnect'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where FirstName='Bud'),(select EventNumber from Event where EventName='techconnect'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where FirstName='Rikki'),(select EventNumber from Event where EventName='techconnect'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where LastName='McAlister'),(select EventNumber from Event where EventName='SEP two years program'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where LastName='Robertson'),(select EventNumber from Event where EventName='SEP two years program'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where LastName='Ocampos'),(select EventNumber from Event where EventName='SEP induction'));
insert into MemberEvent(MemberNumber, EventNumber) values ((select membernumber from Member where LastName='Cho'),(select EventNumber from Event where EventName='Force for good challenge'));

insert into MemberInterestGroup(MemberNumber, GroupName) values ((select membernumber from Member where FirstName='Umut'),(select GroupName from InterestGroup where GroupName='techconnect committee'));
insert into MemberInterestGroup(MemberNumber, GroupName) values ((select membernumber from Member where FirstName='Umut'),(select GroupName from InterestGroup where GroupName='SEP program committee'));
insert into MemberInterestGroup(MemberNumber, GroupName) values ((select membernumber from Member where FirstName='Bud'),(select GroupName from InterestGroup where GroupName='SEP program committee'));
insert into MemberInterestGroup(MemberNumber, GroupName) values ((select membernumber from Member where FirstName='Rikki'),(select GroupName from InterestGroup where GroupName='wider business'));