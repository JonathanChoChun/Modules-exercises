-- 6. The genres of "The Wizard of Oz" (3 rows)
select genre_name

from movie_genre
join genre g on g.genre_id = movie_genre.genre_id
join movie m on m.movie_id = movie_genre.movie_id

where m.title ='The Wizard of Oz'

