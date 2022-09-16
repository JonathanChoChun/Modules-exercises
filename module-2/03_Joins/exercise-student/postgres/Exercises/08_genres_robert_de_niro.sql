-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)

select distinct
    genre_name

from movie_actor as ma
join person p on ma.actor_id = p.person_id
join movie_genre mg on ma.movie_id = mg.movie_id
join genre g on mg.genre_id = g.genre_id
join movie m on ma.movie_id = m.movie_id

--where p.person_name='Robert De Niro' and date_part('year',m.release_date) >=2010
where p.person_name='Robert De Niro' and m.release_date >='2010-01-01'