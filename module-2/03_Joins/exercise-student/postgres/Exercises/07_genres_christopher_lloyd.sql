-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.

select distinct genre_name

from movie_actor as ma
join person p on ma.actor_id = p.person_id
join movie_genre mg on ma.movie_id = mg.movie_id
join genre g on mg.genre_id = g.genre_id

where p.person_name='Christopher Lloyd'