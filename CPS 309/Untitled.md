
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


Assignment

Write short notes on each of the following database concepts
1. Conceptual View of a database
2. Logical view of a database
3. Physical view of a database

2. Read about Normal Form
1NF: 1st Normal Form
2NF: 2nd Normal Form
3NF: 3rd Normal Form
4NF: 4th Normal Form
5NF: 5th Normal Form

3. Disadvantages of normalization
4. 20 attributes of a building