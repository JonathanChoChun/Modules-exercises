-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)


select title, tagline


from movie_actor as ma
join person p on ma.actor_id = p.person_id
join movie m on ma.movie_id = m.movie_id
join movie_genre mg on m.movie_id = mg.movie_id
join genre g on mg.genre_id = g.genre_id

where genre_name ='Family' and person_name='Samuel L. Jackson'