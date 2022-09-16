--test
select * from RecordLabel;


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