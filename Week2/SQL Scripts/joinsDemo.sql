SELECT * FROM hr.departments; -- oracle browser db


-- write an SQL query to display the first name and last name, department number
-- and dpt. name for each employee.

SELECT E.first_name , E.last_name , E.department_id , D.department_name
  FROM employees E
    JOIN departments D 
      ON E.department_id = D.department_id;


-- write a query to display the first and last name employee table), department name , city and 
-- state province (location table) for each employee  : employees, department, locations

SELECT E.first_name, E.last_name, D.department_name, L.city, L.state_province
  FROM employees E
    JOIN departments D
      ON E.department_id = D.department_id
        JOIN locations L
          ON D.location_id = L.location_id;
 