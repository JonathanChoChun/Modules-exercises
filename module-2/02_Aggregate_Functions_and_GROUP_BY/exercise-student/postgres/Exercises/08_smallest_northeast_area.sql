-- 8. The area of the state with the smallest population in the "Northeast" census region. Name the column 'smallest_northeast_area'.
-- Expected answer is around 4,000
-- (1 row)

select
    min(area) as smallest_northeast_area

from state
where census_region='Northeast'
--where population = (select min(population) as min_population from state where census_region='Northeast')
--where population=(select min(population) as min_population from state where census_region='Northeast')


--select min(population) as min_population from state where census_region='Northeast'

