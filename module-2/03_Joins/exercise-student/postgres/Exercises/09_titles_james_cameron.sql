-- 9. The titles of movies directed by James Cameron (6 rows)
select m.title

from
    movie as m
join person p on m.director_id = p.person_id

where person_name= 'James Cameron'
