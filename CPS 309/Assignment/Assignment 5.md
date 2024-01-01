 Taking a shopping mall as a case study implement the step by step process in developing an enterprise database. 
Your database must have up to 6 tables. 


1. **Requirement Engineering:**
   - Define goals: Manage product inventory, track sales, customer information, and employee data.
   - Observe existing processes if any.

2. **Compile Data:**
   - Interact with stakeholders: Gather information on products, sales, customers, and employees.

3. **Select Database Model:**
   - Choose a relational database model.

4. **Design Schema:**
   - Create the following tables:
     - `Products`: ProductID, ProductName, Category, Price, StockQuantity
     - `Sales`: SaleID, ProductID, CustomerID, EmployeeID, SaleDate, QuantitySold
     - `Customers`: CustomerID, FirstName, LastName, Email, Phone
     - `Employees`: EmployeeID, FirstName, LastName, Position, Salary
     - `Categories`: CategoryID, CategoryName
     - `Transactions`: TransactionID, SaleID, PaymentMethod, TransactionAmount, TransactionDate


1. **Products Table:**

  | Column          | Data Type   | Constraints      | Description                           |
   | --------------- | ----------- | ----------------- | ------------------------------------- |
   | ProductID       | INT         | PRIMARY KEY       | Unique identifier for each product    |
   | ProductName     | VARCHAR(255)|                 | Name of the product                   |
   | Category        | VARCHAR(50) |                 | Category to which the product belongs |
   | Price           | DECIMAL(10,2)|                | Price of the product                  |
   | StockQuantity   | INT         |                 | Quantity of the product in stock      |


2. **Sales Table:**

  | Column          | Data Type   | Constraints      | Description                           |
   | --------------- | ----------- | ----------------- | ------------------------------------- |
   | SaleID          | INT         | PRIMARY KEY       | Unique identifier for each sale       |
   | ProductID       | INT         | FOREIGN KEY       | Reference to Products table            |
   | CustomerID      | INT         | FOREIGN KEY       | Reference to Customers table           |
   | EmployeeID      | INT         | FOREIGN KEY       | Reference to Employees table           |
   | SaleDate        | DATE        |                 | Date of the sale                      |
   | QuantitySold    | INT         |                 | Quantity of products sold             |


3. **Customers Table:**
  
  | Column          | Data Type   | Constraints      | Description                           |
  | --------------- | ----------- | ----------------- | ------------------------------------- |
   | CustomerID      | INT         | PRIMARY KEY       | Unique identifier for each customer   |
   | FirstName       | VARCHAR(50) |                 | First name of the customer            |
   | LastName        | VARCHAR(50) |                 | Last name of the customer             |
   | Email           | VARCHAR(100)| UNIQUE            | Unique email address of the customer  |
   | Phone           | VARCHAR(20) |                 | Phone number of the customer          |


4. **Employees Table:**

  | Column          | Data Type   | Constraints      | Description                           |
   | --------------- | ----------- | ----------------- | ------------------------------------- |
   | EmployeeID      | INT         | PRIMARY KEY       | Unique identifier for each employee   |
   | FirstName       | VARCHAR(50) |                 | First name of the employee            |
   | LastName        | VARCHAR(50) |                 | Last name of the employee             |
   | Position        | VARCHAR(50) |                 | Position/title of the employee        |
   | Salary          | DECIMAL(10,2)|                 | Salary of the employee                |


5. **Categories Table:**

  | Column          | Data Type   | Constraints      | Description                           |
   | --------------- |---------------  |---------------  |---------------  |
   | CategoryID      | INT         | PRIMARY KEY       | Unique identifier for each category   |
   | CategoryName    | VARCHAR(50) |                 | Name of the category           |

5. **Select DBMS:**
   - Choose a suitable DBMS: MySQL.
   - Consider factors like data volume, transaction velocity, and data veracity.

6. **Infrastructure Setup:**
   - Deploy necessary hardware and software for MySQL.
   - Set up networking components.

7. **Implement Database Schema:**
   - Use SQL for schema implementation. Example:
     ```SQL
     INSERT INTO Products VALUES (1, 'Laptop', 'Electronics', 1200, 50);
     ```

8. **Security Implementation:**
   - Implement role-based access control.
   - Ensure a secure data environment.

9. **Test Database:**
   - Verify functionality (e.g., product addition, sales recording).
   - Validate data accuracy.

10. **Performance Optimization:**
    - Monitor system performance with increasing sales and data volume.

11. **Deployment & Maintenance:**
    - Hand over the system to mall management and establish a maintenance plan.
