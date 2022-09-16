-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)


select
       m.title, m.release_date

from
        movie_actor as ma
join
        person as p on ma.actor_id = p.person_id
join
        movie m on ma.movie_id = m.movie_id


where
        p.person_name='Tom Hanks'

