
--drop tables

drop table if exists SaleAlbum,Sale,AlbumGenre,Track,Customer,Artist,RecordLabel,Album,Genre;

--create tables

create table Customer
(
        CustomerId      serial not null,
        CustomerName    varchar(50) not null,
        Address         varchar(100),
        City            varchar(60),
        PostalCode     varchar(10),
        constraint pk_Customer primary key (CustomerId)        
);


create table Artist
(
        ArtistId        serial not null,
        ArtistName      varchar(50) not null,
        DateEstablised  date,
        Url             varchar(2000),
        Biography       varchar(2000),
        constraint pk_Artist primary key (ArtistId),
        constraint uq_ArtistName unique (ArtistName)      
);

create table RecordLabel
(
        RecordLabelId   serial not null,
        LabelName       varchar(50) not null,
        Url             varchar(2000),
        FoundedDate     date,
        constraint pk_RecordLabel primary key (RecordLabelId) ,
        constraint uq_LabelName unique (LabelName)             
);

create table Genre
(
        GenreId                 serial not null,
        GenreName               varchar(20) not null,
        GenreDescription        varchar(1000),
        constraint pk_Genre primary key (GenreId),
        constraint uq_Genre_GenreName unique (GenreName)
);

create table Album
(
        AlbumId                serial not null,
        Title                   varchar(80) not null,
        RecordLabelId           integer,
        ArtistId                integer,
        Price                   numeric(5,2),
        CurrentInventory        integer,
        constraint pk_Album primary key (AlbumId) ,
        constraint fk_Album_RecordLabel_RecordLabelId foreign key (RecordLabelId)  references RecordLabel
);

create table Track
(
        TrackId        serial not null,
        TrackName       varchar(100) not null,
        Seconds         integer,
        AlbumId         integer,
        constraint pk_Track primary key (TrackId),
        constraint fk_Track_Album foreign key (AlbumId) references Album
);

create table AlbumGenre
(
        AlbumId integer not null,
        GenreId integer not null,
        constraint pk_AlbumGenre primary key (AlbumId,GenreId),
        constraint fk_AlbumGenre_Album foreign key (AlbumId) references Album,
        constraint fk_AlbumGenre_Genre foreign key (GenreId) references Genre
);

create table Sale
(
        SaleId                  serial not null,
        SaleDate                timestamp,
        DiscountPercentage      numeric (3,2),
        VAT                     numeric (5,2),
        CustomerId              integer,
        constraint pk_Sale primary key (SaleId),
        constraint fk_Sale_Customer foreign key (CustomerId) references Customer
);
create table SaleAlbum
(
        SaleId  integer not null,
        AlbumId integer not null,
        constraint pk_SaleAlbum primary key (SaleId,AlbumId),
        constraint fk_SaleAlbum_Sale foreign key (SaleId) references Sale,
        constraint fk_SaleAlbum_Album foreign key (AlbumId) references Album
);


--fill tables


--artist
insert into Artist (ArtistName) values
    ('ABBA')
    ,('The Lumineers')
    ,('Eagles')
    ,('Metallica')
    ,('Kim Larsen')
    ,('Oasis')
    ,('Billie Eilish')
    ,('The Wombats');



--genre
insert into Genre (GenreName, GenreDescription) values ('Pop','Pop music is a genre of popular music that originated in its modern form during the mid-1950s in the United States and the United Kingdom');
insert into Genre (GenreName, GenreDescription) values ('Indie Rock', 'Indie rock is a subgenre of rock music that originated in the United States, United Kingdom and New Zealand from the 1970s to the 1980s.');
insert into Genre (GenreName, GenreDescription) values ('Indie Folk', 'Indie folk is a music genre that arose in the 1990s among musicians from indie rock scenes influenced by folk music');
insert into Genre (GenreName, GenreDescription) values ('Heavy Metal','Heavy metal (or simply metal) is a genre of rock music that developed in the late 1960s and early 1970s, largely in the United Kingdom and United States');
insert into Genre (GenreName, GenreDescription) values ('Rock',       'Rock music is a broad genre of popular music that originated as "rock and roll" in the United States in the late 1940s and early 1950s');

--album

insert into Album (Title, Price, CurrentInventory, ArtistId)
    select
            'ABBA GOLD',
            5.99,
            1,
            ArtistId
        from
            Artist a
        where
                a.ArtistName='ABBA';

insert into Album (Title, Price, CurrentInventory) values ('Brightside', 7.99, 1);
insert into Album (Title, Price, CurrentInventory) values ('One of These Nights', 9.99,2);
insert into Album (Title, Price, CurrentInventory) values ('Enter Sandman', 9.99,3);
insert into Album (Title, Price, CurrentInventory) values ('Midt om natten', 9.99,1);
insert into Album (Title, Price, CurrentInventory) values ('(What''s the Story) Morning Glory?', 8.87,7);
insert into Album (Title, Price, CurrentInventory) values ('When We All Fall Asleep, Where Do We Go?', 9.99,3);
insert into Album (Title, Price, CurrentInventory) values ('This Modern Glitch', 12.00,2);


update Album set ArtistId = (select ArtistId from Artist where ArtistName='The Lumineers' limit 1)  where Title='Brightside';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='Eagles' limit 1)         where Title='One of These Nights';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='Metallica' limit 1)      where Title='Enter Sandman';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='Kim Larsen' limit 1)     where Title='Midt om natten';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='Oasis' limit 1)          where Title='(What''s the Story) Morning Glory?';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='Billie Eilish' limit 1)  where Title='When We All Fall Asleep, Where Do We Go?';
update Album set ArtistId = (select ArtistId from Artist where ArtistName='The Wombats' limit 1)    where Title='This Modern Glitch';



--AlbumGenre
 insert into AlbumGenre (AlbumId, GenreId)
        select
                a.AlbumId,
                g.GenreId
                from
                        Genre g,
                        Album a
                where
                        g.GenreName = 'Pop'
                        and
                        a.Title = 'ABBA GOLD';

insert into AlbumGenre (AlbumId, GenreId)

-- select 'select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName=''xxxxxx'' and a.Title = ''' || replace(Title,'''','''''') || ''' union ' from Album
--select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='xxxxxx' and a.Title = 'ABBA GOLD' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Indie Folk' and a.Title = 'Brightside' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Rock' and a.Title = 'One of These Nights' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Heavy Metal' and a.Title = 'Enter Sandman' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Pop' and a.Title = 'Midt om natten' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Indie Rock' and a.Title = '(What''s the Story) Morning Glory?' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Pop' and a.Title = 'When We All Fall Asleep, Where Do We Go?' union
select a.AlbumId, g.GenreId from Genre g, Album a where g.GenreName='Indie Rock' and a.Title = 'This Modern Glitch'
;

-- select * from Album;
-- select * from Genre;
--tracks

insert into Track (TrackName, Seconds) values ('Walking Disasters',(3*60) +16); update Track set AlbumId=(select AlbumId from Album where Title='This Modern Glitch' limit 1) where TrackName='Walking Disasters';
insert into Track (TrackName, Seconds) values ('!!!!!!!',(0*60) +14); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='!!!!!!!';
insert into Track (TrackName, Seconds) values ('bad guy',(3*60) +14); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='bad guy';
insert into Track (TrackName, Seconds) values ('when the party''s over',(3*60) +16); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='when the party''s over';
insert into Track (TrackName, Seconds) values ('you should see me in a crown',(3*60) +1); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='you should see me in a crown';
insert into Track (TrackName, Seconds) values ('bury a friend',(3*60) +13); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='bury a friend';
insert into Track (TrackName, Seconds) values ('all the good girls go to hell',(2*60) +49); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='all the good girls go to hell';
insert into Track (TrackName, Seconds) values ('my strange addiction',(3*60) +0); update Track set AlbumId=(select AlbumId from Album where Title='When We All Fall Asleep, Where Do We Go?' limit 1) where TrackName='my strange addiction';
insert into Track (TrackName, Seconds) values ('Hello',(3*60) +21); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Hello';
insert into Track (TrackName, Seconds) values ('Roll with It',(3*60) +59); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Roll with It';
insert into Track (TrackName, Seconds) values ('Wonderwall',(4*60) +18); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Wonderwall';
insert into Track (TrackName, Seconds) values ('Don''t Look Back in Anger',(4*60) +48); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Don''t Look Back in Anger';
insert into Track (TrackName, Seconds) values ('Hey Now!',(5*60) +41); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Hey Now!';
insert into Track (TrackName, Seconds) values ('Untitled (also known as The Swamp Song — Excerpt 1)',(0*60) +44); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Untitled (also known as The Swamp Song — Excerpt 1)';
insert into Track (TrackName, Seconds) values ('Some Might Say',(5*60) +29); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Some Might Say';
insert into Track (TrackName, Seconds) values ('Cast No Shadow',(4*60) +51); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Cast No Shadow';
insert into Track (TrackName, Seconds) values ('She''s Electric',(3*60) +40); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='She''s Electric';
insert into Track (TrackName, Seconds) values ('Morning Glory',(5*60) +3); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Morning Glory';
insert into Track (TrackName, Seconds) values ('Untitled (also known as The Swamp Song — Excerpt 2)',(0*60) +39); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Untitled (also known as The Swamp Song — Excerpt 2)';
insert into Track (TrackName, Seconds) values ('Champagne Supernova',(7*60) +27); update Track set AlbumId=(select AlbumId from Album where Title='(What''s the Story) Morning Glory?' limit 1) where TrackName='Champagne Supernova';
insert into Track (TrackName, Seconds) values ('Susan Himmelblå',(3*60) +50); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Susan Himmelblå';
insert into Track (TrackName, Seconds) values ('Papirsklip',(3*60) +15); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Papirsklip';
insert into Track (TrackName, Seconds) values ('Haveje',(3*60) +40); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Haveje';
insert into Track (TrackName, Seconds) values ('Rocco',(3*60) +5); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Rocco';
insert into Track (TrackName, Seconds) values ('Tik tik',(4*60) +45); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Tik tik';
insert into Track (TrackName, Seconds) values ('Sköna flicka',(2*60) +45); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Sköna flicka';
insert into Track (TrackName, Seconds) values ('Tiden står stille',(4*60) +0); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Tiden står stille';
insert into Track (TrackName, Seconds) values ('1910',(2*60) +45); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='1910';
insert into Track (TrackName, Seconds) values ('Lille pige',(2*60) +55); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Lille pige';
insert into Track (TrackName, Seconds) values ('Volver volver',(3*60) +5); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Volver volver';
insert into Track (TrackName, Seconds) values ('Midt om natten',(4*60) +30); update Track set AlbumId=(select AlbumId from Album where Title='Midt om natten' limit 1) where TrackName='Midt om natten';
insert into Track (TrackName, Seconds) values ('Sad but True',(5*60) +24); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Sad but True';
insert into Track (TrackName, Seconds) values ('Holier than Thou',(3*60) +47); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Holier than Thou';
insert into Track (TrackName, Seconds) values ('The Unforgiven',(6*60) +27); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='The Unforgiven';
insert into Track (TrackName, Seconds) values ('Wherever I May Roam',(6*60) +44); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Wherever I May Roam';
insert into Track (TrackName, Seconds) values ('Don''t Tread on Me',(4*60) +0); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Don''t Tread on Me';
insert into Track (TrackName, Seconds) values ('Through the Never',(4*60) +4); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Through the Never';
insert into Track (TrackName, Seconds) values ('Nothing Else Matters',(6*60) +28); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Nothing Else Matters';
insert into Track (TrackName, Seconds) values ('Of Wolf and Man',(4*60) +161); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='Of Wolf and Man';
insert into Track (TrackName, Seconds) values ('The God That Failed',(5*60) +8); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='The God That Failed';
insert into Track (TrackName, Seconds) values ('My Friend of Misery',(6*60) +49); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='My Friend of Misery';
insert into Track (TrackName, Seconds) values ('The Struggle Within',(3*60) +53); update Track set AlbumId=(select AlbumId from Album where Title='Enter Sandman' limit 1) where TrackName='The Struggle Within';
insert into Track (TrackName, Seconds) values ('Take it to the Limit',(4*60) +46); update Track set AlbumId=(select AlbumId from Album where Title='One of These Nights' limit 1) where TrackName='Take it to the Limit';
insert into Track (TrackName, Seconds) values ('Other track',(3*60) +55); update Track set AlbumId=(select AlbumId from Album where Title='One of These Nights' limit 1) where TrackName='Other track';
insert into Track (TrackName, Seconds) values ('Bightside',(3*60) +50); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Bightside';
insert into Track (TrackName, Seconds) values ('A.M. Radio',(3*60) +57); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='A.M. Radio';
insert into Track (TrackName, Seconds) values ('Where we are',(2*60) +52); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Where we are';
insert into Track (TrackName, Seconds) values ('Birthday',(4*60) +14); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Birthday';
insert into Track (TrackName, Seconds) values ('Big shot',(3*60) +1); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Big shot';
insert into Track (TrackName, Seconds) values ('Never really mine',(3*60) +1); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Never really mine';
insert into Track (TrackName, Seconds) values ('Rollercoaster',(3*60) +48); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Rollercoaster';
insert into Track (TrackName, Seconds) values ('Remington',(1*60) +52); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Remington';
insert into Track (TrackName, Seconds) values ('Reprise',(3*60) +28); update Track set AlbumId=(select AlbumId from Album where Title='Brightside' limit 1) where TrackName='Reprise';

--customer
insert into Customer (CustomerName, Address, City, PostalCode) values ('Rob Stewart','123 main', 'St Pete','33701');
--sale
insert into Sale (SaleDate, DiscountPercentage, VAT, CustomerId) values ('2022-08-01 12:03:05',0,0,(select CustomerId from Customer where CustomerName='Rob Stewart'));

insert into SaleAlbum (SaleId, AlbumId)
select
    SaleId,
    AlbumId
    from
        Album a,
        Sale s
    where
        a.Title like '%a%';
--test selects
-- select * from Album;
-- select * from Genre;
-- select * from AlbumGenre;
-- select * from Track

--select * from SaleAlbum;
