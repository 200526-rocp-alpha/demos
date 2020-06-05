-- now we will use DDL - Data Definition Language to create our tables

DROP TABLE students; -- I am using DDL to drop any tables in existence

CREATE TABLE students (
  student_id  NUMBER GENERATED BY DEFAULT AS IDENTITY (START WITH 1 INCREMENT BY 1),
  first_name VARCHAR2(100) NOT NULL,
  last_name VARCHAR2(100) NOT NULL,
  PRIMARY KEY(student_id) -- primary key is a unique identifier for that instance
);

-- When we insert values...this is DML! Data Manipulation....
INSERT INTO students (first_name, last_name)
  VALUES ('Bruce', 'Wayne');
  
SELECT * FROM students;

INSERT INTO students (first_name, last_name)
  VALUES ('Clark', 'Kent');

SELECT * FROM students;
