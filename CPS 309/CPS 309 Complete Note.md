[31/10/23]
## **What is a Database:**
A database is an integrated, extensive collection of data stored in a computer system, organized in a way that facilitates access, retrieval, and maintenance, including updating and deletion of data.

## **DBMS (Database Management System):**
A DBMS is a suite of software designed for creating, storing, accessing, and efficiently maintaining a database system. Some examples of DBMS include Microsoft Access, Microsoft SQL, MySQL, and Oracle.

### Frequently Asked Question:

**Difference between a DB System and a DBMS:**
- A DBMS is the software responsible for managing data within a database.
- A DB System encompasses not only the DBMS but also the hardware and infrastructure supporting the database.

## **Detailed Explanation of Databases and DBMS:**

**Database Definition:**
A database is a unified collection of structured data with minimal duplication to provide a consistent and controlled pool of data. It is shared among all users of the system but remains independent of the programs that access the data. In essence, a database system is a structured data collection that facilitates storage, access, retrieval, and maintenance, including creation, updating, and deletion. These systems are typically designed to manage vast volumes of data, and the terms "DB system" and "DBMS" are often used interchangeably.

**DBMS Description:**
A DBMS is a collection of programs used to control activities related to storing, accessing, retrieving, maintaining, and managing data within a database. Modern DB systems can manage not only multiple data columns, rows, and tables within a database but also multiple databases. A DBMS provides an efficient, reliable, and common environment for accessing and maintaining data in a database. It offers several advantages, including the management of large data pools for multiple applications with efficiency, accuracy, and safety.

## Advantages of Database Systems:

- **Persistent Storage of Data:** Data remains stored and accessible.
- **Large Volume Data Storage:** Databases can hold extensive data independently of any specific process.
- **Flexible Data Structure:** Supports efficient access to vast datasets with adaptable data structures.
- **Scalability:** DBMS can expand as data grows, across multiple machines.
- **Developer Productivity:** Eliminates the need to structure data within the program.
- **Shared Data Capability:** Enables data sharing among different individuals.
- **Data Security:** Ensures data safety.

## Disadvantages of Databases:

- **Complex Design:** Designing databases can be complex, time-consuming, and challenging.
- **Confidentiality Issues:** Data security and confidentiality can be a concern.
- **Cost:** Acquiring hardware and software, along with the expenses of training and maintenance.
- System Crashing
- Availability of Network
- Natural disasters

From a program perspective DBMS are applications that are used to manage data:
- MS-Access
- MS-SQL
- Oracle
- JBASE
- Universe
- DB2



### Database System Environment: 
- Hardware
- Operating system
- Database
- Application


---
## Views of A Database

- Conceptual View: 
- Logical View
- Physical View

---

## Database Normalization

DB Normalization can be defined as a systematic way of ensuring that a database structure is suitable for general purpose query and free of certain undesirable characteristics. Such as, insertion, update, and deletion anomalies which could lead to database corruption and total loss of integrity. Therefore normalization is the process of reducing duplication in a database with the ultimate goal of eliminating duplicate data entity. In other words is an attempt to make sure that true data is not destroyed and false data created. 

In addition error are avoided by representing a fact (data) in a database one way, one time, and in one place. It should be empashized that duplicate data is a problem and therefore all efforts must be made to avoid duplicating data item during a database design, to minimize redundant data and maximize data integrity. 

Normalization and normal form (NF) are efforts geared towards ensuring removal of data redundancy, and this include. 

1NF: 1st Normal Form
2NF: 2nd Normal Form
3NF: 3rd Normal Form
4NF: 4th Normal Form
5NF: 5th Normal Form


## Rationale behind Database Normalization
1. **Greedy Disk Space Usage:**
   - Unnormalized databases can be inefficient in disk space usage.
   - The uncontrolled duplication of data contributes to increased storage requirements.

2. **Integrity and Consistency Concerns:**
   - Unnormalized databases may lead to integrity and consistency issues.
   - Duplicated data increases the risk of data corruption.

3. **Data Duplication Risks:**
   - The presence of duplicated data in various locations poses a risk.
   - Having the same piece of information in multiple places can create challenges.

4. **Issues with Information Insertion:**
   - Particularly problematic during the insertion of new information.
   - Basic adherence to 1NF (First Normal Form), as defined by Edgar Codd in 1970, helps mitigate these issues.

5. **Facilitation of Querying:**
   - The primary objective of adhering to 1NF is to facilitate the querying of data.
   - This includes manipulation using a universal data language like SQL (Structured Query Language).

### Benefits of Database Normalization

1. **Scalability and Minimized Redesign:**

- Minimizes the need for significant database redesign when scaling up.
- Allows the database to expand to accommodate new data types without major changes to existing structures.

2. **Informative Database Model:**

- Utilizes normalized tables and establishes relationships between tables.
- Provides users with a concise and informative view of the database structure.
Avoidance of Bias and General Query Support:

3. **Avoids bias towards any specific type of database**.
- Normalized tables are suitable for general-purpose queries.
- Supports a wide range of queries, including future queries with details that cannot be anticipated.



Composite attribute an attribute that has other attributes attached to it. 

When defining attributes of an object always define the **identifying** attribute first. 
## Types of Key:
Write short notes on the following database concepts
- **Primary Key:** Unique attribute that identifies a record
- **Foreign Key:** A primary key in one table when used in another table becomes a foreign key
- **Alternate record keys:** Other unique identifiers in a table that is not the primary key. 
- **Candidate Key:** 
- **Super Key**
---

Schema: A blueprint or templates that are used to create a database. 

| Column          | Data Type   | Constraints| Description                             |
| --------------- | ----------- | ---------------------------------------- | --------------------------------------- |
| student_id      | INT         | PRIMARY KEY                              | Unique identifier for each student      |
| first_name      | VARCHAR(50) | Not Null                                 | First name of the student               |
| last_name       | VARCHAR(50) | Non Null                                          | Last name of the student                |
| date_of_birth   | DATE        | Not Null                                          | Date of birth of the student            |
| email           | VARCHAR(100)| UNIQUE                                   | Unique email address of the student    |


Steps in creating a database
1. CREATE  Database `fuoinfosys`
2. USE `fuoinfosys`
3. CREATE Table `stdu_basic_details` 
	-> 


---
## Database Models

1. **Hierarchical Database Model:**
   - **Definition:** In a hierarchical database model, data is organized in a tree-like structure where each record has a parent-child relationship with other records. The structure resembles an inverted tree with a single root, and each node can have multiple child nodes.
   - **Description:** This model is suitable for representing data with a clear hierarchy, such as organizational structures or file systems. However, it can be less flexible when dealing with complex relationships or changes in the data structure.

2. **Network Database Model:**
   - **Definition:** The network database model extends the hierarchical model by allowing records to have multiple parent and child records, creating a more complex graph-like structure. It introduces the concept of sets to represent these relationships.
   - **Description:** This model is designed to handle more intricate relationships, providing more flexibility than the hierarchical model. It is suitable for scenarios where data exhibits complex interdependencies.

3. **Relational Database Model:**
   - **Definition:** The relational database model organizes data into tables, where each table consists of rows and columns. Relationships between tables are established through keys, providing a straightforward way to query and manipulate data.
   - **Description:** Widely used in modern databases, the relational model is known for its simplicity and ease of use. It's effective for representing structured data and supports complex queries and transactions.

4. **Object-Oriented Database Model:**
   - **Definition:** In an object-oriented database model, data is represented as objects, similar to those in object-oriented programming. Objects encapsulate data and behavior, and relationships are modeled through inheritance and polymorphism.
   - **Description:** This model is particularly useful when dealing with complex data structures and real-world entities. It aligns well with object-oriented programming paradigms and supports encapsulation and code reuse.

5. **Document-Oriented Database Model:**
   - **Definition:** Document-oriented databases store data as documents, typically in JSON or BSON format. Each document contains key-value pairs or nested structures, allowing for flexible and schema-less data storage.
   - **Description:** Well-suited for handling semi-structured or unstructured data, document-oriented databases are commonly used in web development for tasks such as content management and storing data in a way that can evolve over time without a predefined schema.

---
## Database Architecture
## Database Users
Database users fall into the following categories:
- Application programmers: computer professionals interacting with the system through DML calls embedded in a program written in a host language
- Sophisticated Users: Interact with the system without writing programs. They form requests by writing queries in a database query language. 
- Specialized Users: sophisticated users writing special database application programs. These may be CADD systems, expert systems, complex data systems
- Naïve Users: unsophisticated users who interact with the system by using permanent application programs. (ATM)

**Database administrator:** a person having central control over data and programs accessing that data. 
Duties of a database administrator
1. **Scheme Definition:** Create the original database scheme by writing definitions in a DDL, compiled into tables stored in the data dictionary.

2. **Storage Structure and Access Method Definition**: Write definitions for storage structure and access methods, translated by the data storage and definition language compiler.

3. **Scheme and Physical Organization Modification:** Write definitions for modifications to internal system tables using the DDL compiler, occasionally necessary for changes to the database scheme or physical organization.

4. **Granting Authorization for Data Access**: Grant different types of authorization for data access to various users.

5. **Integrity Constraint Specification:** Generate integrity constraints, consulted by the database manager module during updates.

**Database Manger**:
The database manager is a crucial module bridging low-level database data and user applications. With large databases requiring gigabytes of storage on disks, the manager handles data movement between disk and main memory. The system aims to simplify data access, emphasizing performance. The database manager is responsible for:

1. Interaction with the file manager: Storing raw data on disk using the file system provided by the operating system, translating DML statements into low-level file system commands.
   
2. Integrity enforcement: Checking database updates against consistency constraints, such as maintaining a bank account balance above $25.

3. Security enforcement: Restricting user access to authorized information.

4. Backup and recovery: Detecting and recovering from failures like power outages, disk crashes, or software errors.

5. Concurrency control: Preserving data consistency during concurrent user operations.

**Data Manipulation Language**:
Data Manipulation Language (DML) involves retrieving, inserting, deleting, and modifying information in the database. It's a language enabling users to interact with data efficiently. There are two types of DML:

1. Procedural: Users specify both the needed data and how to obtain it.
   
2. Nonprocedural: Users only specify the needed data, making it easier but potentially less efficient than procedural languages.

A query language is a part of DML focused on information retrieval. The terms DML and query language are often used interchangeably.

---

What is database environment
![[Pasted image 20231212094514.png]]

-  **File manager** manages allocation of disk space and data structures used to represent information on disk.
- **Database manager:** The interface between low-level data and application programs and queries.
- **Query processor:** translates statements in a query language into low-level instructions the database manager understands. (May also attempt to find an equivalent but more effcient form.) 
- **DML precompiler:** converts DML statements embedded in an application program to normal procedure calls in a host language. The precompiler interacts with the query processor. 
- **DDL compiler** converts DDL statements to a set of tables containing metadata stored in a data dictionary. 
In addition, several data structures are required for physical system implementation: 
- **Data files**: store the database itself. 
- **Data dictionary**: stores information about the structure of the database. It is used heavily. Great emphasis should be placed on developing a good design and efficient implementation of the dictionary. 
- **Indices:** provide fast access to data items holding particular values

---

---
## Views of A Database

- Conceptual View: 
- Logical View
- Physical View

---

## Database Normalization

DB Normalization can be defined as a systematic way of ensuring that a database structure is suitable for general purpose query and free of certain undesirable characteristics. Such as, insertion, update, and deletion anomalies which could lead to database corruption and total loss of integrity. Therefore normalization is the process of reducing duplication in a database with the ultimate goal of eliminating duplicate data entity. In other words is an attempt to make sure that true data is not destroyed and false data created. 

In addition error are avoided by representing a fact (data) in a database one way, one time, and in one place. It should be empashized that duplicate data is a problem and therefore all efforts must be made to avoid duplicating data item during a database design, to minimize redundant data and maximize data integrity. 

Normalization and normal form (NF) are efforts geared towards ensuring removal of data redundancy, and this include. 

1NF: 1st Normal Form
2NF: 2nd Normal Form
3NF: 3rd Normal Form
4NF: 4th Normal Form
5NF: 5th Normal Form


## Rationale behind Database Normalization
It should be emphasized that unnormalized can be greedy with disk space and eventually cause, integrity and consistency issues. Duplication creates the risk of data corruption. With other attendant problem such as having a particular piece of information in more than one place. Especially when any piece of information is inserted a basic object of 1NF as defined by Edgar Codd in 1970 is to facilitates query of data and its manipulation using a universal data of language SQL. 

### Benefits of Database Normalization
- Minimizes database redesign when scaling up the database structure. Database can be expanded to accommodate new types of data while preexisiting aspect of the structure remains largely unchanged
- Makes the database model more informative to the users. Normalized tables and relationships between one table and the other gives a concise view of the database
- Avoidance of bias towards a any particular type of database. Normalize table are suitable for general purpose query and this then implies that any query against the table including future queries whose details cannot be anticipated can be supported .

---
## Creating An Enterprise Database
1. **Requirement Engineering:** Establish the database goal by finding out exactly what goals the database is meant for. If the system is already existing, one just has to observe the manual process. 
2. Compile the necessary date by interacting with the real  stakeholders of the system. 
3. Select a database model, i.e relational, entity relational, network model. 
4. Design a schema
5. Select a suitable DBMS, MYSQL, Oracle, MongoDB. Things to consider when designing: Volume, Velocity, Veracity 
6. Setting up the infrastructure. Deploy the necessary hardware and software and networking components. 
7. Implementing the database schema using SQL: Structured Query Language.

<mark style="background: #FF5582A6;">How to populate a database using INSERT 
</mark>
```SQL
INSERT INTO pet VALUES ('Fluffy','Harold','cat','f', '1999-02-04',NULL);
```
8. Implement a suitable security measure. 
	1. Role based access control
	2. Sensitive data environment
9. Testing the database: 
	1. is the database functional
	2. are the data correct
	3. Verification and Validation
 10. Performance Optimization
	 1. If the volume of data increase is there a degradation in the performance of the system. 
  11. Deployment & Maintenance: Handing over the system to the users. 


---
## Client Server 
**b) Client-Server Database:**
		In a client-server database system, the database functionality is divided between a client application and a server. The client is responsible for presenting the user interface and processing user requests, while the server manages the database, handling data storage, retrieval, and processing.

## Client-Server Databases: A Deep Dive

Client-server databases are the backbone of modern data management, powering everything from small business accounting software to global ecommerce platforms. Let's dive deep into this crucial technology, exploring its architecture, advantages, challenges, and real-world applications.

**1. Architecture**:

- **Clients:** These are programs that request data from the server. They can be desktop applications, web browsers, mobile apps, or even other servers. Clients don't store the actual data; they act as the user interface and process the results received from the server.
    
- **Server:** This is the central repository that houses the database software and the actual data. The server receives requests from clients, processes them using the database engine, and sends back the results. It performs data manipulation, enforces security, and ensures data integrity.
    
- **Network:** Clients and servers communicate through a network, typically TCP/IP. This allows for centralized storage and management of data, making it accessible from various locations.
    

**2. Advantages**:

- **Centralized Control:** Easier to manage security, backup, and recovery efforts due to one central location for the database.
    
- **Scalability:** Can handle large amounts of data and multiple concurrent users efficiently.
    
- **Data Integrity:** Enforces consistent data structures and access rules, minimizing data corruption.
    
- **Resource Optimization:** Reduces hardware requirements on client machines as processing and storage are centralized.
    
- **Improved Collaboration:** Provides shared access to data for multiple users and applications.
    

**3. Challenges**:

- **Single Point of Failure:** Server downtime can bring entire systems down, requiring robust disaster recovery plans.
    
- **Network Dependency:** Reliable network connectivity is crucial for seamless operation, posing challenges in unstable internet environments.
    
- **Security Concerns:** Server vulnerabilities can expose sensitive data, requiring strong security measures.
    
- **Performance Bottlenecks:** Heavy traffic or poorly optimized queries can lead to slow response times.
    
- **Cost Considerations:** Setting up and maintaining a dedicated server infrastructure can be expensive.
    

**4. Applications**:

- **Enterprise Resource Planning (ERP):** Managing customer data, orders, inventory, and financials.
    
- **Customer Relationship Management (CRM):** Tracking interactions with customers, leads, and opportunities.
    
- **Content Management Systems (CMS):** Storing and managing website content and user data.
    
- **E-commerce platforms:** Handling product information, orders, and payment data.
    
- **Financial institutions:** Managing accounts, transactions, and client information.
    

**5. Future Trends**:

- **Cloud-based databases:** Increased adoption of cloud platforms for cost-effectiveness and scalability.
    
- **NoSQL databases:** Growing popularity for handling unstructured data and high-performance needs.
    
- **In-memory databases:** Faster data access for real-time applications and analytics.
    
- **Advanced security measures:** Increased focus on data encryption, access control, and threat detection.
    

---
## Introduction To SQL
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



