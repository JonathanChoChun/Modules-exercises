-- 20. The titles, lengths, and release dates of the 5 longest movies in the "Action" genre. Order the movies by length (highest first), then by release date (latest first).
-- (5 rows, expected lengths around 180 - 200)

select title, length_minutes, release_date


from
     movie_genre as mg
join genre g on g.genre_id = mg.genre_id
join movie m on m.movie_id = mg.movie_id
where genre_name='Action'
order by
length_minutes desc,  release_date desc
limit 5