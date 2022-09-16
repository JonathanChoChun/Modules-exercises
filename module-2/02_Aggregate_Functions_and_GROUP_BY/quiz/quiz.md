1. Assume the data pictured was stored in a table called "employee." What would be the last name of the employee in the first row returned by the following query?

    ```sql
    SELECT first_name, last_name
    FROM employee
    ORDER BY first_name;
    ```
    a. Baker
    b. Smith
    c. Woodard *
    d. Green
    e. I don't know

2. Assume the data pictured was stored in a table named "employee." What would be the first name of the employee in the first row returned by the following query?

    ```sql
    SELECT first_name, last_name
    FROM employee
    ORDER BY last_name, first_name;
    ```
    a. Sarah
    b. Gary
    c. Alice
    d. Barb
    e. John
    f. Michael *
    g. I don't know

3. Assume the data pictured was stored in a table named "employee." What would be the first name of the employee in the *second* row returned by the following query?

    ```sql
    SELECT first_name, last_name
    FROM employee
    ORDER BY last_name DESC, first_name;
    ```
    a. Sarah
    b. Gary *
    c. Alice
    d. Barb
    e. John
    f. Michael
    g. I don't know

4. Assume the data pictured is stored in a table named "employee." How many rows would be returned by the following query?

    ```sql
    SELECT last_name, count(*)
    FROM employee
    GROUP BY last_name;
    ```
    a. 4 *

5. Assume the data pictured is stored in a table named "employee." How many rows would be returned by the following query?

    ```sql
    SELECT department, count(*)
    FROM employee
    GROUP BY department;
    ```
    a. 3 *

6. Assume the data pictured is stored in a table named "employee." How many rows would be returned by the following query?

    ```sql
    SELECT state_of_residence, department, count(*)
    FROM employee
    GROUP BY state_of_residence, department;
    ```
    a. 3 *

7. Assume the data pictured is stored in a table named "employee." What would be the value of the `employee_count` field returned by the following query?

    ```sql
    SELECT count(*) AS employee_count
    FROM employee
    WHERE last_name = 'Smith';
    ```
    a. 2 *

8. Assume the data pictured is stored in a table named "employee." What would be the value of the `employee_count` field of the first row returned by the following query?

   ```sql
   SELECT state_of_residence, department, count(*) AS employee_count
   FROM employee
   GROUP BY state_of_residence, department
   ORDER BY state_of_residence DESC, department
   ```
   a. 1 *
