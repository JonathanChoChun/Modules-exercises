-- 23. The name and date established of parks opened in the 1960s (6 rows)
select park_name, date_established FROM park where date_established BETWEEN '1960-01-01' and '1969-12-31';
--select park_name, date_established FROM park where date_established >= 1960-01-01;