-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)

select
    person_name, title
from
    movie_actor as ma
join
        movie m on ma.movie_id = m.movie_id
join
        person p on ma.actor_id = p.person_id

where p.person_name like '% Jones'
order by
    p.person_name
