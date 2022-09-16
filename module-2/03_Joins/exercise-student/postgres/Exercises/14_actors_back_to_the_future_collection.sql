-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)

select distinct person_name

from movie_actor
join person p on movie_actor.actor_id = p.person_id
join movie m on movie_actor.movie_id = m.movie_id
join collection c on m.collection_id = c.collection_id


where c.collection_name ='Back to the Future Collection'
