1. Write short notes on the following database concepts
- **Primary Key:** Unique attribute that identifies a record
- **Foreign Key:** A primary key in one table when used in another table becomes a foreign key
- **Alternate record keys:** Other unique identifiers in a table that is not the primary key. 
- **Candidate Key:** 
- **Super Key**

1. **Primary Key:**
   - *Definition:* Unique attribute that identifies a record.
   - *Example:*
     ```markdown
     | StudentID (Primary Key) | Name    | Age | 
     |-------------------------|---------|-----| 
     | 1                       | Alice   | 20  | 
     | 2                       | Bob     | 22  | 
     ```

2. **Foreign Key:**
   - *Definition:* A primary key in one table when used in another table becomes a foreign key.
   - *Example:*
     ```markdown
     | OrderID (Primary Key) | ProductID | Quantity | 
     |------------------------|-----------|----------| 
     | 101                    | 1         | 5        | 
     | 102                    | 2         | 3        | 

     | ProductID (Foreign Key) | ProductName | 
     |-------------------------|-------------| 
     | 1                       | Laptop      | 
     | 2                       | Smartphone  | 
     ```

3. **Alternate Record Keys:**
   - *Definition:* Other unique identifiers in a table that are not the primary key.
   - *Example:*
     ```markdown
     | EmployeeID (Primary Key) | SSN (Alternate Key) | Name    | 
     |--------------------------|----------------------|---------| 
     | 101                      | 123-45-6789          | Alice   | 
     | 102                      | 987-65-4321          | Bob     | 
     ```

4. **Candidate Key:**
   - *Definition:* A candidate key is a unique key that could be chosen as the primary key.
   - *Example:*
     ```markdown
     | EmployeeID (Candidate Key) | SSN (Candidate Key) | Name    | 
     |-----------------------------|----------------------|---------| 
     | 101                         | 123-45-6789          | Alice   | 
     | 102                         | 987-65-4321          | Bob     | 
     ```

5. **Super Key:**
   - *Definition:* A super key is a set of attributes that can uniquely identify a record.
   - *Example:*
     ```markdown
     | EmployeeID | SSN        | Name    | 
     |------------|------------|---------| 
     | 101        | 123-45-6789| Alice   | 
     | 102        | 987-65-4321| Bob     | 
     ```
     In this case, {EmployeeID} and {SSN} are super keys as they uniquely identify each record.
2. What is instance of a database
An instance of a database refers to a specific occurrence or realization of a database at a particular point in time. It is the actual, operational, and functional database created and running on a database management system (DBMS). Here are a few key points about a database instance:

1. **Operational State:** A database instance is the state of the database system as it is actively being used or operated upon. It includes all the data, relationships, and structures defined in the database schema.

2. **Memory and Processes:** When a database is running, it is loaded into the computer's memory, and various processes are active to handle queries, transactions, and other operations. This active state is often referred to as the database instance.

3. **Data Persistence:** While the database schema defines the structure and relationships of the data, the instance is where the actual data is stored persistently on the storage devices.

4. **Connection Parameters:** A database instance is often associated with specific connection parameters, such as a unique name or identifier, port number, and network address. These parameters are used to connect applications or users to the running database instance.

5. **Isolation:** Each instance of a database is generally isolated from others to prevent interference and ensure data integrity. This isolation is achieved through techniques such as transaction management and concurrency control.

In summary, an instance of a database represents the active, operational state of a database system, including the data, processes, and structures defined in the database schema.