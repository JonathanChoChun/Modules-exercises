-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

select distinct p.person_name

from movie as m
join collection c on c.collection_id = m.collection_id
join person p on m.director_id = p.person_id

where c.collection_name='Harry Potter Collection'