-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas (5 rows)

select m.title

from movie as m

join collection c on c.collection_id = m.collection_id
join person p on m.director_id = p.person_id

where person_name!='George Lucas' and c.collection_name='Star Wars Collection'