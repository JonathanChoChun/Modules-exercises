-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)

select m.title, m.release_date

from movie_genre as mg
join movie m on mg.movie_id = m.movie_id
join genre g on mg.genre_id = g.genre_id


where genre_name='Comedy'
order by
m.release_date