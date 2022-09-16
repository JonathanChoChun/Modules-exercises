-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955,
-- has an area of 0.78 square miles and does not offer camping.)
--insert park
--park name, date est, area, has camping
insert into park (park_name, date_established, area, has_camping)
values
('Disneyland5', '1995-7-17', 0.78, false);

--select * from park where park_name='Disneyland5'



-- Add Hawkins, IN (with a population of 30,000 and an area of 14.71 square miles) and Cicely, AK
-- (with a popuation of 839 and an area of 4.39 square miles) to the city table.
--city
insert into city (city_name, state_abbreviation, population, area)
values
--hawkins
(
 'Hawkins' --city_name
 ,'IN' --state_abbreviation
,30000 --population
 ,14.71 --area
),
--cicely
(
    'Cicely'
    ,'AK'
    ,839
    ,4.39
);


insert into city (city_name, state_abbreviation, population, area)
values
--hawkins
(
    'Hawkins' --city_name
,'XX' --state_abbreviation
,30000 --population
,14.71 --area
);
-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
insert into park_state (park_id, state_abbreviation)
--get the disneyland record
select
    park_id
    ,'FL'
    from
        park
    where
        park_name in ('Disneyland','Acadia','Canyonlands','Yellowstone');
-- 6
-- 18
-- 19

--select * from park p join park_state ps on p.park_id = ps.park_id where ps.state_abbreviation='FL'
-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."
select * from state where state_abbreviation='CA';
update state
    set
        state_nickname = 'The Happiest Place on Earth'
        ,population    = 39512223
    where
        state_abbreviation = 'CA';



-- Increase the population of California by 1,000,000.
update state
set
    population    = population + 1000000
where
        state_abbreviation = 'CA';

-- Change the capital of California to Anaheim. --264
update state
set
    capital = (select city_id from city where city_name='Anaheim' limit 1)
where
        state_abbreviation = 'CA';

update state
set
    capital = c.city_id
from
    city c
where
        state.state_abbreviation = c.state_abbreviation
        and
        state.state_abbreviation = 'CA'
        and
        c.city_name='Anaheim';

select * from state where state_abbreviation='CA';
-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.



-- DELETE

-- Delete Hawkins, IN from the city table.

delete from city where city_id = (select city_id from city where city_name='Tampa' and state_abbreviation='FL' limit 1);



select * from city where city_name='Hawkins';


-- Delete all cities with a population of less than 1,000 people from the city table.
update state set capital=null;
delete from city where population>1000000;


-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.


-- Try deleting California from the state table.
delete from state where state_abbreviation='CA';

-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.



-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.


-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.


-- Retrieve the new record to confirm it has been given a default, non-null value for population.


-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).


-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
update state
    set
        census_region='Southeast'
    where state_abbreviation='FL';


-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.
begin transaction;
--select * from city where state_abbreviation='KS' and city_name='Wichita';
delete from city where state_abbreviation='KS' and city_name='Wichita';

commit;

-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.
begin transaction;
delete from park_state;
select * from park_state;
rollback;
select * from park_state;

-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.
begin transaction;
update city set state_abbreviation='TX';
rollback;

select * from city
-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
