-- 10. The names of directors who have directed a movie over 3 hours [180 minutes] (15 rows)
select distinct p.person_name

from movie as m
join person p on m.director_id = p.person_id

where length_minutes >180
