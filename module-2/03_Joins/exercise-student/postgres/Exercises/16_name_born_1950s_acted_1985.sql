-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)

select
    distinct p.person_name, p.birthday

from movie_actor as ma
         join movie m on ma.movie_id = m.movie_id
         join person p on ma.actor_id = p.person_id

where (p.birthday between '1950-01-01' and '1960-01-01') and (date_part('year',m.release_date)='1985')