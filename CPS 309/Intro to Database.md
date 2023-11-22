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
It should be emphasized that unnormalized can be greedy with disk space and eventually cause, integrity and consistency issues. Duplication creates the risk of data corruption. With other attendant problem such as having a particular piece of information in more than one place. Especially when any piece of information is inserted a basic object of 1NF as defined by Edgar Codd in 1970 is to facilitates query of data and its manipulation using a universal data of language SQL. 

### Benefits of Database Normalization
- Minimizes database redesign when scaling up the database structure. Database can be expanded to accommodate new types of data while preexisiting aspect of the structure remains largely unchanged
- Makes the database model more informative to the users. Normalized tables and relationships between one table and the other gives a concise view of the database
- Avoidance of bais towards a any particular type of database. Normalize table are suitable for general purpose query and this then implies that any query against the table including future queries whose details cannot be anticipated can be supported .