-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)

select
    m.title

from movie as m
join collection c on m.collection_id = c.collection_id
where c.collection_name = 'Star Wars Collection'

order by
m.release_date desc