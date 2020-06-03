-- this is a comment!
-- ctrol + enter to run
-- constraints (what are they? what do they do?)
-- data type
DESCRIBE employees;

-- DQL --> SELECT

SELECT * FROM employees;
SELECT first_name, last_name, phone_number FROM employees;
-- now we will use ALIASES

SELECT first_name AS "First Name", phone_number AS "Number" FROM employees;

SELECT salary FROM EMPLOYEES;
SELECT salary FROM employees ORDER bY SALARY ASC;

SELECT first_name, last_name, salary
FROM employees
WHERE salary > 6000 ORDER BY salary DESC;

SELECT first_name, last_name, salary
FROM employees
WHERE first_name = 'Steven';
-- this is filter data with the WHERE clause;

-- in order to return a single value from a collection of data
-- we use an AGGREGATE FUNCTION AVG MIN MAX 

-- I want to return the MAXIMUM salary from all employees
SELECT MAX(salary) from employees;
SELECT AVG(salary) from employees;

-- 1. Write a query to display the first and last name and salary for employees
-- with a salary higher than 8000;

SELECT first_name, last_name FROM EMPLOYEES WHERE SALARY > 8000;
-- PL/SQL specific to ORACLE ||
SELECT first_name || ' ' || last_name AS "Full Name", salary
  FROM employees
    WHERE salary > 8000;


-- 2. Write a query to display all the information for the employees WITHOUT
-- a department number;





