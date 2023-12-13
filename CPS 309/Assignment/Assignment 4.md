1. Write short notes on the following database concepts
- **Primary Key:** A column or set of columns used to identify all records uniquely present in that table. All the values of primary key has to be different with no repetition. Any table can consists of only a single primary key construct. 
- **Foreign Key:** Represents link between tables
- **Alternate record keys:**  
- **Candidate Key:** refers to attributes that identify rows uniquely in a table. In a table we may select the candidate key from primary key. A candidate key has similar properties of that or primary key. But in a table their can be multiple candidate key. 
- **Super Key**: A column or a set of columns that can be used to identify a row in a table. A key is a minimal super key example 
- Composite Key: A set of multiple attributes that helps to uniquely identify tuple present in a table. The attribute present in a set may not be unique when ever you consider them separately. If you take then together it ensure total uniqueness. 
- Unique Key: A column or set of of column that identifies every record uniquely in a table. All the values in this key has to be unique. It is different from a primary key because it is only capable of having only one null value. A primary key on the other hand can not have a null value. 




![[Pasted image 20231205101606.png]]
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



1. What is instance of a database
An instance of a database refers to a specific occurrence or realization of a database at a particular point in time. 
A database instance is the state of the database system as it is actively being used or operated upon. It includes all the data, relationships, and structures defined in the database schema.
