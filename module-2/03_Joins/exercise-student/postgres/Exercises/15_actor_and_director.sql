-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)


select m.title, p.person_name

from movie_actor as ma
join movie m on ma.movie_id = m.movie_id
join person p on ma.actor_id = p.person_id and p.person_id=m.director_id