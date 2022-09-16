-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)
--
-- begin transaction ;
insert into collection(collection_name)
values (
        'Bill Murray Collection'
       );
-- update movie as m
-- set
-- collection_id=(select collection_id from collection where collection_name='Bill Murray Collection' limit 1)
-- where movie_id in(
--     select movie_id from movie_actor where actor_id=(
--         select person_id from person where person_name='Bill Murray'));
update movie
set
    collection_id =c.collection_id
from
    collection c,
    movie_actor ma,
    person p
where
        person_name = 'Bill Murray'
  and
        collection_name = 'Bill Murray Collection'
  and
        ma.movie_id = movie.movie_id
  and
        ma.actor_id =  p.person_id;

-- the above is to join movie with movie_actor with person, then say I want rows with person_name equals 'bill Murray'
-- then for those rows, collection id equals c.collections id where the collection_name is ..., notice collection is not joined
-- with the other tables.


--rollback ;
