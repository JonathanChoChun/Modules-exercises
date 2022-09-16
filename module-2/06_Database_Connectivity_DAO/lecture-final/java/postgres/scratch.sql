--test
select * from RecordLabel;

select
        genreid,
        genrename,
        genredescription
    from
        Genre
    where
        genreid = 55;

insert into genre (genrename, genredescription) values (:genrename, :genredescription);

select
                albumid,
                title,
                a.recordlabelid,
                a.artistid,
                price,
                currentinventory,
                ar.artistname,
                r.labelname
                from
                    album a
                    left join recordlabel r
                        on a.recordlabelid = r.recordlabelid
                    join artist ar
                        on a.artistid = ar.artistid