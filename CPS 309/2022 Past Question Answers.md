# 2022 Past Question

1. Assuming that you work in an ICT company that specializes in designing Database solutions for organization. A newly established community bank wishes to computerize her operations. After an initial fruitful discussion with the representatives of the bank, your technical team has identified the following set of information as being essential in creating the database solution for the bank:
	i. Branch-scheme = (bname, bcity, assets)
	ii. Customer-scheme = (cname, street, city)
	iii. Depositor-scheme = (cname, account_num)
	iv. Account-scheme = (bname, account num, balance).
	
	a)** Prepare database schema for the tables**
	
	Branch Table:
	
	| Field Name | Data Type | Constraint | Description |
	| ---- | ---- | ---- | ---- |
	| bname | VARCHAR(50) | Primary Key, Not Null | Branch Name: The name of the branch |
	| bcity | VARCHAR(50) | Not Null | Branch City: The city in which the branch is located |
	| assets | VARCHAR(100) | Not Null | The assests possesed by the bank |
	
	Customer Table:
	
	| Field Name | Data Type | Constraint | Description |
	| ---- | ---- | ---- | ---- |
	| cname | VARCHAR(50) | Primary Key, Not Null | Customer Name |
	| street | VARCHAR(50) | Not Null | Street address |
	| city | VARCHAR(50) | Not Null | City name |

	Depositor Table:
	
	| Field Name | Data Type | Constraint | Description |
	| ---- | ---- | ---- | ---- |
	| cname | VARCHAR(50) | Primary Key, Not Null | Customer Name |
	| account_num | INT | Not Null | Customer account Number |

	Account Table:
	
	| Field Name | Data Type | Constraint | Description |
	| ---- | ---- | ---- | ---- |
	| bname | VARCHAR(50) | Primary Key, Not Null | Branch Name |
	| account_num | INT | Not Null | Account Number |
	| balance | INT | Not Null | Balance |

b) **From the schema, create a comprehensive database for the community bank**

```SQL
--create database
CREATE database community;

--create branch table 
CREATE TABLE branch (bname VARCHAR(50) PRIMARY KEY NOT NULL,bcity VARCHAR(50) NOT NULL,assets VARCHAR(100) NOT NULL);

--create customer table 
CREATE TABLE customer (cname VARCHAR(50) PRIMARY KEY NOT NULL, street VARCHAR(50) NOT NULL, city VARCHAR(50) NOT NULL);

--create depositor table 
CREATE TABLE depositor (cname VARCHAR(50) PRIMARY KEY NOT NULL, account_num INT  NOT NULL);

--create accounttable 
CREATE TABLE account (bname VARCHAR(50) PRIMARY KEY NOT NULL, account_num INT NOT NULL, balance INT NOT NULL);

```

c) **Using a DDL, Populate at least 4 tables with relevant data**

```SQL
-- Populate the branch table
INSERT INTO branch (bname, bcity, assets) VALUES
('Branch1', 'City1', '100000'),
('Branch2', 'City2', '150000');

-- Populate the customer table
INSERT INTO customer (cname, street, city) VALUES
('Customer1', 'Street1', 'City1'),
('Customer2', 'Street2', 'City2');

-- Populate the depositor table
INSERT INTO depositor (cname, account_num) VALUES
('Customer1', 1001),
('Customer2', 1002);

-- Populate the account table
INSERT INTO account (bname, account_num, balance) VALUES
('Branch1', 1001, 5000),
('Branch2', 1002, 7500);

```

d) **Using DML write a SQL Command to extract customers whose balance is above N5m**
```SQL
SELECT * FROM account WHERE balance > 50000000
```
2. **Assuming you are the team leader for this project, which database architecture will you recommend? Give three justification for this**
		I would recommend using a Relational Database Management System (RDBMS) for this project. Here are three justifications for this recommendation:
	1. Structured Data Model: The data in this project seems to have a well-defined structure with tables such as `branch`, `customer`, `depositor`, and `account`. RDBMS is designed for managing structured data and provides a clear and organized way to store and retrieve information. 
	2. Data Analysis: Relational databases enable complex data analysis and manipulation by supporting various operations and functions, such as joins, aggregations, subqueries, and views.
	3. Data Integrity and Relationships: RDBMS supports the definition of relationships between tables through foreign key constraints. This ensures referential integrity and helps in maintaining the relationships between entities such as customers, branches, and accounts. Enforcing data integrity rules at the database level helps prevent data inconsistencies and errors.

3. **List at least five potential risk factors which may likely plague this database system**. 
	1. **Security Risks:**  Risks may include unauthorized access, data breaches, or vulnerabilities in the database system. 
	2. **Data Integrity Issues:** In a complex system with multiple tables and relationships, ensuring data integrity can be challenging. Any issues with data input, updates, or deletions could lead to inaccurate information. 
	3. **Scalability Challenges:**  Increased user activity, larger datasets, and expanding functionality can impact performance. 
	4. **System Downtime:** Unplanned system downtime can disrupt banking operations and lead to financial losses. Factors such as hardware failures, software bugs, or maintenance activities can contribute to downtime. 
	5. **Compliance and Regulatory Risks:** The financial industry is subject to various regulations and compliance requirements. Failure to comply with these regulations can result in legal consequences and damage to the reputation of the institution. 

---
4. **What is a database**:
	A database is a unified collection of structured data with minimal duplication to provide a consistent and controlled pool of data. It is shared among all users of the system but remains independent of the programs that access the data. 
	A database is an integrated, extensive collection of data stored in a computer system, organized in a way that facilitates access, retrieval, and maintenance, including updating and deletion of data.

5. **Establish the relationship between a database system and a database management system(DBMS)**
	- A DBMS is the software responsible for managing data within a database.
	- A DB System encompasses not only the DBMS but also the hardware and infrastructure supporting the database.
	- But the terms "DB system" and "DBMS" are often used interchangeably, they usually refer to different sides of the same coin.

6. **List 3 common database management software**
	 - MS-Access
	- MS-SQL
	- Oracle
	- JBASE
	- Universe
	- DB2

---
7. **What is a Database model**
		A database model is a conceptual framework that defines the structure, relationships, and rules governing the organization and representation of data within a database. It provides a blueprint for designing the database and serves as a guide for developers in creating, organizing, and managing data.  
8. **Describe relational database model using diagrammatic illustrations like table, with relevant examples**
	The relational database model organizes data into tables, where each table consists of rows and columns. Each row represents a record, and each column represents an attribute of that record. Relationships between tables are established through keys. Here's a simple illustration:
	
	Consider two tables - `Students` and `Courses`:
	**Students Table:**
	
	| StudentID | FirstName | LastName | Age |
	|-----------|-----------|----------|-----|
	| 1         | John      | Doe      | 20  |
	| 2         | Jane      | Smith    | 22  |

	**Courses Table:**
	
	| CourseID | CourseName     | Instructor     |
	|----------|----------------|----------------|
	| 101      | Math           | Prof. Johnson  |
	| 102      | English        | Prof. Smith    |
	
	In this example, `StudentID` is a primary key in the `Students` table, and `CourseID` is a primary key in the `Courses` table. If we want to represent a relationship between students and the courses they are enrolled in, we could introduce another table, say `Enrollments`, with columns such as `StudentID` and `CourseID` as foreign keys.

9. **compare and contrast hierarchical and relational database models, use simple illustrations**
	*Hierarchical Database Model:*
	- **Structure:** Organizes data in a tree-like structure with parent-child relationships.
	- **Example:**
	  ```
	  Department
	  └── Employee
	      ├── Project
	      └── Task
	  ```
	*Relational Database Model:*
	- **Structure:** Organizes data into tables with rows and columns, where relationships are established using keys.
	- **Example:**
	  ```
	  Students
	  Courses
	  ```
	*Contrast:*
	- **Relationships:** Hierarchical databases have rigid parent-child relationships, whereas relational databases support more flexible relationships through keys and join operations.
	- **Flexibility:** Relational databases provide more flexibility in querying and data retrieval compared to hierarchical databases, which might require navigating through a predefined path.
	- **Normalization:** Relational databases support normalization to eliminate data redundancy and improve efficiency, while hierarchical databases may have redundant data due to their structure.


10. **mention 3 reasons why relational database is the most popular database model in the market**
	1. **Data Integrity:** The relational database model enforces data integrity through constraints, such as primary keys and foreign keys, ensuring accuracy and consistency in the stored data.
	2. **Flexibility in Querying:** Relational databases use SQL (Structured Query Language) for querying and data manipulation. SQL provides a powerful and flexible way to retrieve and manipulate data, making it easier for developers and analysts to work with the database.
	3. **Normalization:** Relational databases support normalization, a process that reduces data redundancy and dependency. This leads to more efficient storage and maintenance of data, making relational databases suitable for handling complex and evolving data structures.

---
11. Explain what each of these concepts mean in a database system
	**a) Database Schema:**
		A database schema is a logical blueprint that represents the structure of a database. It defines the organization of data, the relationships between tables, and the constraints that govern the data. The schema includes information about the tables, fields (attributes), data types, and relationships between tables. 
	**b) Client-Server Database:**
		In a client-server database system, the database functionality is divided between a client application and a server. The client is responsible for presenting the user interface and processing user requests, while the server manages the database, handling data storage, retrieval, and processing. 
	**c) Physical View of a Database:**
		The physical view of a database refers to the way data is stored and accessed on the actual hardware. It involves details such as file structures, indexing mechanisms, storage devices, and access methods. The physical view is concerned with optimizing performance, storage efficiency, and data retrieval speed. 
	**d) 2-Tier Database Architecture:**
		In a 2-tier database architecture, also known as client-server architecture, there are two main components: the client and the server. The client is responsible for the presentation and user interface, while the server manages the database and processes the data-related requests. The communication between the client and the server is direct. 
	**e) One-to-Many Relationship:**
		A one-to-many (1:N) relationship in a database refers to a relationship between two tables where one record in the first table (parent table) can have multiple related records in the second table (child table), but each record in the second table corresponds to only one record in the first table. 
---
12. Draw clearly the architecture of the organization of a database system
	![[Pasted image 20231212094514.png | 350]]

13. **Explain fully the functions of at least 5 components of a database system and how they interrelate**
	-  **File manager** manages allocation of disk space and data structures used to represent information on disk.
	- **Database manager:** The interface between low-level data and application programs and queries.
	- **Query processor:** translates statements in a query language into low-level instructions the database manager understands. (May also attempt to find an equivalent but more effcient form.) 
	- **DML precompiler:** converts DML statements embedded in an application program to normal procedure calls in a host language. The precompiler interacts with the query processor. 
	- **DDL compiler** converts DDL statements to a set of tables containing metadata stored in a data dictionary.  In addition, several data structures are required for physical system implementation: 
	- **Data files**: store the data in the database. 
	- **Data dictionary**: stores information about the structure of the database. It is used heavily. Great emphasis should be placed on developing a good design and efficient implementation of the dictionary.

14. **List the major functions of a database manager**
	1. Interaction with the file manager: Storing raw data on disk using the file system provided by the operating system, translating DML statements into low-level file system commands.
	   
	2. Integrity enforcement: Checking database updates against consistency constraints, such as maintaining a bank account balance above $25.
	
	3. Security enforcement: Restricting user access to authorized information.
	
	4. Backup and recovery: Detecting and recovering from failures like power outages, disk crashes, or software errors.
	
	5. Concurrency control: Preserving data consistency during concurrent user operations.

---
15. **Explain database normalization**
	Normalization is the process of reducing duplication in a database with the ultimate goal of eliminating duplicate data entity. In other words is an attempt to make sure that true data is not destroyed and false data created.  Data should be represented in a database one way, one time, and in one place.

16. Reasons why a database must be normalized
	1. **Elimination of Data Redundancy:**
	    - Normalization reduces data redundancy by organizing data into separate tables, avoiding duplicate information. This leads to a more efficient use of storage space and helps maintain consistency in the database.
	2. **Data Integrity:**
	    - Normalization enforces data integrity by minimizing or eliminating data anomalies such as insertion, update, and deletion anomalies. This ensures that the database accurately reflects the real-world relationships between entities.
	3. **Consistency and Accuracy:**
	    - By eliminating duplicate data and establishing relationships through foreign keys, normalization helps maintain consistency and accuracy in the database. Updates or modifications to data are done in one place, reducing the risk of inconsistencies.
	4. **Improved Query Performance:**
	    - Normalization can contribute to improved query performance by organizing data in a way that facilitates efficient retrieval. Well-designed normalized databases generally require fewer indexes and can lead to faster query execution.
	5. **Easier Maintenance:**
	    - Normalized databases are generally easier to maintain and modify. When changes are needed, they can be made in one place without affecting other parts of the database, making the system more adaptable to evolving requirements.

17. What are the roles and responsibilities of each identified stakeholder to the successful operation of a good database system
	i) Database Administrator: a person having central control over data and programs accessing that data. 
	1. **Scheme Definition:** Create the original database scheme by writing definitions in a DDL, compiled into tables stored in the data dictionary.
	
	2. **Storage Structure and Access Method Definition**: Write definitions for storage structure and access methods, translated by the data storage and definition language compiler.
	
	3. **Scheme and Physical Organization Modification:** Write definitions for modifications to internal system tables using the DDL compiler, occasionally necessary for changes to the database scheme or physical organization.
	
	4. **Granting Authorization for Data Access**: Grant different types of authorization for data access to various users.
	
	5. **Integrity Constraint Specification:** Generate integrity constraints, consulted by the database manager module during updates.

	ii) Application Programmer
	In a database environment, application programmers play a crucial role in developing and maintaining the software applications that interact with the database. Their responsibilities are diverse and can include the following:
	
	1. **Database Design:**
	   - Collaborating with database designers and administrators to understand the database schema and designing the application's data access layer accordingly.
	   - Creating and maintaining data models that align with the application's requirements and the underlying database structure.
	
	2. **Query Development:**
	   - Writing and optimizing database queries using Data Manipulation Language (DML) statements to retrieve, update, insert, or delete data.
	   - Ensuring that queries are efficient, well-structured, and adhere to best practices to enhance overall application performance.
	
	3. **Transaction Management:**
	   - Implementing and managing transactions to ensure the consistency and integrity of data in the database. This includes understanding and utilizing transaction control statements to commit or roll back changes.
	
	4. **Database Connectivity:**
	   - Implementing and managing the connection between the application and the database. This involves using appropriate database connectivity APIs or drivers in the chosen programming language.
	
	5. **Error Handling:**
	   - Incorporating robust error-handling mechanisms in the application code to manage exceptions and ensure graceful degradation in the event of database errors or connectivity issues.
	
	7. **Optimizing Performance:**
	   - Profiling and optimizing application code to enhance performance, minimize resource usage, and reduce database load. This may involve optimizing queries, using caching mechanisms, and employing other performance-tuning techniques.

---
