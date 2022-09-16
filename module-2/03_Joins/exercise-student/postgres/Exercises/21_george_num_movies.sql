-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'


select person_name, count(ma.*) as num_of_movies

from person as p
--left join movie m on p.person_id = m.director_id
left join movie_actor ma on p.person_id = ma.actor_id
where person_name like 'George %'
group by person_id, person_name
order by person_name
