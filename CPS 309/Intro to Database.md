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


<mark style="background: #FFB8EBA6;">What is a database model</mark>