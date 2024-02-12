# 2023 Past Question 

l. An idealized, very simple example of a description of a database and their corresponding
attributes is given below meant to be used in the design of an enterprise database for a supply
chain company, JUSTRITE

|  |  |  |  |
| ---- | ---- | ---- | ---- |
| **PURCHASES**<br>COMAPANY NAME<br>NAME<br>SUPPLIER NAME<br>PURCHASE DATE<br>PURCHASE COST<br>INGREDIENT NAME<br>INGREDIENT QUANTITY | **EMPLOYEE**<br>EMPLOYEE ID<br>EMPLOYEE NAME<br>STREET<br>CITY<br>SEX<br>SOCIAL SECURITY CODE | **WORKS** UNIT<br>EMPLOYEE IL)<br>PRODUCT ID<br>SALARY<br>JOBTITLE | **PRODUCT**<br>PRODUCT<br>PRODUCTNAME<br>CITY |
| **SALES** INVENTORY<br>PRODUCTID<br>RETAILER NAME<br>SALES DATE<br>SALES QUANTITY<br>SALES COST | **SUPPLIER**<br>SUPPLIER NAME<br>SUPPLIER CITY | **RETAILER**<br>RETAILER<br>RETAILER | **COMPANY**<br>COMPANY NAME |
| **DEPARTMENT**<br>DEPARTMENT ID<br>COMPANY NAME |  |  |  |

The above description is meant to be used to design and create an enterprise database system for the company:
1) Assuming you are the team leader for the project, list a step-by-step approach of designing and setting up a big database of this magnitude
	1. **Requirement Engineering:**
		  - Define the goals of the database.
		  - Observe existing manual processes if applicable.
	2. **Compile Data:**
		  - Interact with stakeholders to gather necessary information.
	3. **Select Database Model:**
		  - Choose model (e.g., relational, entity relational).
	4. **Design Schema:**
		  - Develop database schema.
	5. **Select DBMS:**
		  - Choose suitable DBMS (e.g., MySQL, Oracle, MongoDB).
		  - Consider factors like Volume, Velocity, Veracity.
	6. **Infrastructure Setup:**
		  - Deploy hardware, software, and networking components.
	7. **Implement Database Schema:**
		  - Use SQL for schema implementation.
		  - Example: `INSERT INTO pet VALUES ('Fluffy','Harold','cat','f', '1999-02-04',NULL);`
	8. **Security Implementation:**
		  - Establish role-based access control.
		  - Ensure a secure data environment.
	9. **Test Database:**
		  - Verify functionality.
		  - Validate data accuracy.
	10. **Performance Optimization:**
		  - Evaluate system performance with increasing data volume.
	11. **Deployment & Maintenance:**
		  - Hand over the system to users.
2) Explain what you understand by database schema. From the tables above prepare a database schema for at least 3 of the tables above
	
	A database schema is a logical blueprint that represents the structure of a database. It defines the organization of data, the relationships between tables, and the constraints that govern the data. The schema includes information about the tables, fields (attributes), data types, and relationships between tables. 
	
	**Product Table**:
	
| Field Name | Data Type | Constraint | Description |
| ---- | ---- | ---- | ---- |
| productId | VARCHAR(50) | Primary Key, Not Null | Product id  |
| productName | VARCHAR(50) | Not Null | Product Name |
| city | VARCHAR(50) | Not Null | City name |
	**Company Table**:

| Field Name | Data Type | Constraint | Description |
| ---- | ---- | ---- | ---- |
| companyName | VARCHAR(50) | Primary Key, Not Null | Company name  |
| productName | VARCHAR(50) | Not Null | Product Name |
	**Department Table**:

| Field Name | Data Type | Constraint | Description |
| ---- | ---- | ---- | ---- |
| departmentId | VARCHAR(50) | Primary Key, Not Null | Department ID   |
| companyName | VARCHAR(50) | Not Null | Company Name |

1) Create a comprehensive database (at least 3 tables) for the company using the schema above
```SQL
CREATE DATABASE retail;

CREATE TABLE product (productID VARCHAR(50) PRIMARY KEY NOT NULL, productName VARCHAR(50) NOT NULL, city VARCHAR(50) NOT NULL);


CREATE TABLE company (companyName VARCHAR(50) PRIMARY KEY NOT NULL, productName VARCHAR(50) NOT NULL);


CREATE TABLE department (departmentID VARCHAR(50) PRIMARY KEY NOT NULL, companyName VARCHAR(50) NOT NULL);
```

4) Write a query command that will filter out SALES QUANTITY above 500 units
```SQL
SELECT * FROM salesInventory WHERE salaesQuantity > 500;
```
5) Using the INSERT clause populate the SALES INVENTORY with relevant data
```sql
INSERT INTO salesInventory (productId,retailerName,salesDate,salesQuantity,salesCost) VALUEs ('P123','Bigi','2023-5-4',34,'#40000'),
('P124','Sosa','2023-3-4',34,'#90000');
```

6) From a database viewpoint, list 5 justifications why this project is a worthwhile initiative for the company. 
	1. Data Centralization and Integrity:
		A centralized database allows JUSTRITE to store all relevant data in one place, ensuring consistency and integrity of information. 
	2. Efficient Operations and Decision-Making:
		The database enables efficient management of various aspects of the supply chain, including purchases, sales, inventory, and employee information. Quick and accurate access to data supports better decision-making, streamlines operations, and enhances overall efficiency.
	3. Improved Inventory Management:
		With detailed records of purchases, sales, and inventory levels, JUSTRITE can optimize its inventory management processes.  Real-time insights into inventory levels help prevent overstocking or understocking issues.
	4. Enhanced Traceability and Compliance:
		A well-designed database allows for comprehensive traceability of products and transactions throughout the supply chain. This traceability is crucial for meeting regulatory requirements and industry standards. JUSTRITE can easily track the origin of products, monitor quality, and demonstrate compliance with relevant regulations.
	5. Improved Customer and Supplier Relationships:
		The database can facilitate better relationships with customers and suppliers. Detailed records of sales transactions, customer preferences, and supplier interactions enable JUSTRITE to personalize services, anticipate customer needs, negotiate better terms with suppliers, and overall enhance the satisfaction of both customers and suppliers.
7) Demonstrate your understand of the concept of database
8) Give 4 reasons why microsoft excel is not suitable to manage large database systems. 
	 - **Limited Data Capacity:** Excel has limitations on the amount of data it can handle, and large databases can quickly exceed these limits, leading to performance issues.
	- **Limited Concurrent Access:** Excel is designed for single-user access, making it unsuitable for scenarios where multiple users need simultaneous access to a large database.
	- **Limited Data Integrity Controls:** Excel lacks robust data integrity controls and validation, making it prone to errors, data inconsistencies, and challenges in maintaining data quality.
	- **Scalability Issues:** As the size of the database grows, Excel becomes less efficient, and managing and analyzing data becomes increasingly time-consuming.
1) Recommend a database management system which can be used to handle large database system
	- **Database System:** PostgreSQL or Oracle Database.
	- **Reasons:** These database management systems are designed to handle large datasets efficiently, provide advanced security features, support concurrent access by multiple users, and offer scalability for growing data needs.
1) Explain what is mean by a client-server database system and discuss briefly how it works. Illustrate your answer with a suitable diagram. 
- **Definition:** In a client-server database system, a database server provides services to multiple clients. Clients send requests to the server, and the server processes these requests, managing the storage and retrieval of data.
- **How It Works:**
    - Clients: Devices or applications making requests.
    - Server: Manages the database, processes queries, and returns results.
    - Communication: Clients and the server communicate over a network.
2) A fact that cannot be denied is that Corporate Data is the Corporate Asset: If corporate data is truly be a Corporate Asset, it's got be consistent, reliability and integrity of a database system. 
3) what is database denormalization?
	**Definition:** Denormalization is the process of intentionally introducing redundancy into a database by merging tables or adding redundant data. The goal is to improve query performance by reducing the need for complex joins.
1) Mention 2 instances when it becomes expedient to denormalize database tables. 
	- **Reporting and Analytics:** When there is a need for complex reporting and analytical queries that would be resource-intensive with a normalized structure.
	- **Read-Heavy Applications:** In scenarios where read operations significantly outnumber write operations, denormalization can enhance query performance.

1) What does the value NULL indicate in a database table. 
	- **Definition:** NULL represents the absence of a value in a database table.
	- **Meaning:** It indicates that the data for a particular attribute is either unknown or undefined.
1) In SQL, explain the two dominat classess of Commands VIZ:(DDL and DML) available and illustrate your answer with good examples. 
- **DDL (Data Definition Language):**
    
    - Examples: `CREATE TABLE`, `ALTER TABLE`, `DROP TABLE`.
    - Usage: Used for defining and managing the structure of the database schema.
- **DML (Data Manipulation Language):**
    
    - Examples: `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
    - Usage: Used for managing and manipulating the data stored in the database.
3) Write shot note on each of the following
	1) Multi-tier database architecture:
	- **Definition:** Multi-tier architecture involves dividing the database application into three components: presentation, application logic, and database management.
- **Layers:** Presentation Layer, Application Layer, Database Layer.
	3) Attributes of a OOD database
		- **Attributes:** Encapsulation, Inheritance, Polymorphism.
		- **Usage:** Facilitates the modeling and representation of complex relationships and structures in the database using object-oriented principles.