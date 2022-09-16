-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
select
    census_region
     ,state_name
     ,population
    from
        state
    order by
        census_region desc
        ,state_name asc;


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.


-- The biggest park by area
select park_name from park order by area desc;


-- LIMITING RESULTS

-- The 10 largest cities by populations
select
        city_name
        ,state_abbreviation
        ,population
    from
        city
    order by
        population desc
    limit 10;



-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
select
        park_name
        ,date_established
        ,date_part('month', date_established) as month_est
        ,date_part('year',date_established) as year_established
        ,date_part('year',current_date) - date_part('year',date_established) as number_of_years
        ,current_date -date_established as days_est
    from
        park
    where
        date_part('year',date_established) between 1960 and 1969
        --year_established between 1960 and 1969
    order by
        year_established
;





-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
select
        city_name
        ,state_abbreviation
        ,(city_name || ', ' || state_abbreviation) as city_state1
        ,concat(city_name,', ',state_abbreviation) as city_state2
    from
        city


-- The all parks by name and date established.


-- The census region and state name of all states in the West & Midwest sorted in ascending order.



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
select
    avg(population) as avg_pop
    from
        state

-- Total population in the West and South census regions
select
        sum(population) as sum_pop
    from
        state
    where
        census_region in ('West','South');


-- The number of cities with populations greater than 1 million
select
        count(*)
    from
        city
    where
        population>1000000;

-- The number of state nicknames.



-- The area of the smallest and largest parks.
select
    min(area) as min_area
    ,max(area) as max_area
from
    park;


-- GROUP BY

select
    census_region
    ,sum(population) as sum_pop
from
    state
where
     census_region in ('West','South')
group by
    census_region;
-- 125580448
--  78347268
-- 203927716


-- Count the number of cities in each state, ordered from most cities to least.
select
        state_abbreviation
        ,count(*) as num_cities
    from
        city
    group by
        state_abbreviation
    order by
        num_cities desc;


-- Determine the average park area depending upon whether parks allow camping or not.


-- Sum of the population of cities in each state ordered by state abbreviation.
select
    state_abbreviation
     ,sum(population) as size_of_city
from
    city
group by
    state_abbreviation
order by
    state_abbreviation asc;

-- The smallest city population in each state ordered by city population.
select
        state_abbreviation
        ,min(population) as smallest_city
    from
        city
    group by
        state_abbreviation
    order by
        smallest_city desc;



-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
select
        *
    from
        city
    order by
        city_name
    offset 10 rows fetch next 10 rows only ;
--Abilene,Anchorage
--Ann Arbor,Aurora


-- SUBQUERIES (optional)

--limit top 10 and aggregate on those
select
    avg(population) as avg_cit
    ,sum(population) as sum_cit
    ,count(*) as num_cit
from (
    select city_name
           , state_abbreviation
           , population
      from
            city
      order by
            population desc
      limit 10) as city_pop;
--     2593216.5,
--     25932165



-- Include state name rather than the state abbreviation while counting the number of cities in each state,
select
    city_name
    ,state_abbreviation
    ,(select state_name from state as s where s.state_abbreviation = c.state_abbreviation) as state_name
    from
        city as c;


-- Include the names of the smallest and largest parks
select
    p.*
    ,case
        when p.area = extreem_parks.min_area then 'Small'
        else 'Large'
        end
from
    park as p,
    (
    select
            min(area) as min_area
            ,max(area) as max_area
        from
            park) extreem_parks
where
    p.area = extreem_parks.min_area
    or
    p.area = extreem_parks.max_area


-- List the capital cities for the states in the Northeast census region.



-- testing
select
    state_name, sales_tax

from state
order by sales_tax desc
limit 5