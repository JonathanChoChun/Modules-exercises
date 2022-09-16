-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
select m.title, m.tagline

from movie_genre as mg

join movie m on mg.movie_id = m.movie_id

join genre g on mg.genre_id = g.genre_id

where genre_name='Fantasy'

order by m.title

