
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
        SaleDate                date,
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


--ALBUM
--ABBA GOLD|ABBA|Pop|5.00
--Dancing Queen|3:51
--Knowing Me Knowing You| 4:03
--Take a Chance on Me|4:04
--Mamma Mia|3:32
--Money, Money, Money|3:07
--The Winner Takes It All|4:55
--Super Trouper|4:13
--Gimme! Gimme! Gimme! (A Man After Midnight)|4:50
--Waterloo|2:46


--artist
insert into Artist (ArtistName) values ('ABBA');

--genre
insert into Genre (GenreName, GenreDescription) values ('Pop','Pop music is a genre of popular music that originated in its modern form during the mid-1950s in the United States and the United Kingdom');

--album
insert into Album (Title, Price, ArtistId)
        select
                        'ABBA GOLD',
                        5.00,                
                        ArtistId
                from
                        Artist a
                where
                        a.ArtistName='ABBA';
                        
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
                        
             
--tracks