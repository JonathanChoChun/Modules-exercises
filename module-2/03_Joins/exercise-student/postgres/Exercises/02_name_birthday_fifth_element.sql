-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
select
    p.person_name, p.birthday

from
     movie_actor as ma
join movie m on ma.movie_id = m.movie_id
join person p on ma.actor_id = p.person_id


where m.title='The Fifth Element'

