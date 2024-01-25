SQL: Structured Queried Language. 
Pronounced `see-queel`
It is used for creating, accessing and maintaining a database. It derives it syntax from the early programming languages Like PL-1, PASCALl. 

Dominant commands:

SQL is a standard established for definition and manipulation of relational databases, it consists of a set of commands that allow the definition manipulation and control of data in a relational database. 

The history of SQL began in 1974, today there are many implementation of SQL, the following commands are prominently use in SQL, namely :
	DDL: Data Definition Language
	DML: Data Manipulation Language
	DCL: Data Control Language


| Matric_no | Name | Age | Height | CGPA | Mode_of_Entry | Gender | State_of_origin |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|  |  |  |  |  |  |  |  |



Write a sql command that would count the number of students whose CGPA is greater than 30.5 in 300Level table

```SQL
SELECT COUNT (*) FROM STUDREC WHERE CGPA > 3.5;
```
\
```SQL
UPDATE [tablename]
SET [fieldtobechanged]
where [criteria];
```

```SQL
UPDATE STUDREC
SET martial_status = "Married"
WHERE matric_num = "FUO/22/0034";
```

```SQL
DELETE FROM STUDREC
WHERE matric_num = "FUO/22/3343"
```


SQL (Structured Query Language) is a standard language for accessing and manipulating data in relational database management systems (RDBMS). SQL is used to perform tasks such as updating data on a table, retrieving data from a table, and creating new tables.

SQL syntax is case-insensitive, which means that keywords and identifiers can be written in uppercase or lowercase. However, it is recommended to use consistent capitalization for readability.

All SQL statements must end with a semicolon (;). This is used to separate statements and prevent errors.

Here are some of the most common SQL keywords:

- SELECT: This keyword is used to select data from a table.
- INSERT: This keyword is used to insert new data into a table.
- UPDATE: This keyword is used to update existing data in a table.
- DELETE: This keyword is used to delete data from a table.
- CREATE: This keyword is used to create a new table.
- DROP: This keyword is used to delete a table.
- ALTER: This keyword is used to modify a table.
- TRUNCATE: This keyword is used to delete all data from a table.

Here is an example of a simple SQL statement:

SQL

```
SELECT * FROM table_name;
```

This statement will select all rows from the table named `table_name`.

You can also use the `WHERE` clause to filter the results of a `SELECT` statement. For example, the following statement will select all rows from the `customers` table where the `country` is `United States`:

SQL

```
SELECT * FROM customers WHERE country = 'United States';
```

You can also use the `ORDER BY` clause to sort the results of a `SELECT` statement. For example, the following statement will sort the results of the previous statement by the `name` column in ascending order:

SQL

```
SELECT * FROM customers WHERE country = 'United States' ORDER BY name;
```

You can also use the `GROUP BY` clause to group the results of a `SELECT` statement. For example, the following statement will group the results of the previous statement by the `country` column and count the number of rows in each group:

SQL

```
SELECT country, COUNT(*) FROM customers WHERE country = 'United States' GROUP BY country;
```

These are just a few examples of the many things you can do with SQL. For more information, please consult a SQL tutorial or reference manual.



