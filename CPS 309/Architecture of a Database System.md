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
