DROP TABLE movies;

CREATE TABLE movies (
    id SERIAL,
    title VARCHAR(255),
    duration INT,
    rating VARCHAR(255)
);

-- CREATE 

INSERT INTO movies (title, duration, rating) VALUES ('Alien', 117, '18'); -- notice, we do not need input for id as we are using SERIAL.
INSERT INTO movies (title, duration, rating) VALUES ('The Imitation Game', 114, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('Iron Man', 126, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('The Martian', 144, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('Guardians of the Galaxy', 121, '12A');
INSERT INTO movies (title, duration, rating) VALUES ('You Only Live Twice', 117, 'PG');
INSERT INTO movies (title, duration, rating) VALUES ('I Know What You Did Last Summer', 101, '18');



--READ


--SELECT * FROM movies WHERE title LIKE 'The%'; --finds only what's specified (uppercase), where there are words after.
--SELECT * FROM movies WHERE title LIKE '%The'; --finds only what's specified (uppercase), where there are words before.
--SELECT * FROM movies WHERE title LIKE '%The%'; --finds only what's specified (uppercase), where there are words before and after.
--SELECT * FROM movies WHERE title LIKE LOWER ('%The%'); --finds only lowercase, where there are words before and after.
--SELECT * FROM movies WHERE LOWER(title) LIKE LOWER ('%The%'); --finds both lowercase and uppercase, where there are words before and after.

--SELECT * FROM movies ORDER BY duration DESC; -- uppercase take precedence over lowercase.

--SELECT title FROM movies WHERE rating = '12A' ORDER BY duration DESC; --start with what to select, from what database, where and what to do.

--SELECT COUNT(*) FROM movies;

SELECT DISTINCT rating FROM movies;

--SELECT rating, COUNT(*) FROM movies GROUP BY rating; --counts each movie's ratings and groups or orders them by rating with largest movies.

--SELECT rating, SUM(duration) FROM movies GROUP BY rating; 


--GENERAL FORMULA FOR SQL QUERIES:
--SELECT column1, column2, ... -- List the columns you want to retrieve
--FROM table_name -- Specify the table(s) you want to query

-- Optional: Add joins if you need to retrieve data from multiple tables
-- JOIN table_name ON condition
-- (You can use INNER JOIN, LEFT JOIN, RIGHT JOIN, or FULL JOIN based on your requirement)

-- Optional: Add WHERE clause to filter the rows based on specific conditions
-- WHERE condition1 AND/OR condition2 AND/OR ...

-- Optional: Add GROUP BY clause if you need to group the data based on specific columns
-- GROUP BY column1, column2, ...

-- Optional: Add HAVING clause to filter the groups formed by GROUP BY
-- HAVING condition

-- Optional: Add ORDER BY clause to sort the results based on specific columns
-- ORDER BY column1 [ASC/DESC], column2 [ASC/DESC], ...

-- Optional: Add LIMIT clause to limit the number of rows returned
-- LIMIT n

-- Note: The semicolon (;) at the end is used to terminate the SQL statement

