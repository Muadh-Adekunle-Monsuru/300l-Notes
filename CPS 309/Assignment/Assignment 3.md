
Write short notes on each of the following database concepts
1. Conceptual View of a database
2. Logical view of a database
3. Physical view of a database

**Conceptual View:**

The conceptual view, also known as the high-level view, represents the overall structure and relationships between key entities in a system. It focuses on the business perspective, capturing the essential concepts and interactions without delving into technical details. The conceptual view is typically depicted using entity-relationship diagrams (ERDs) that illustrate the entities, their attributes, and the relationships between them.

This view is primarily concerned with understanding the business context and identifying the core data elements that support the organization's operations. It serves as a foundation for further data modeling activities and ensures that the data model aligns with the business objectives.

**Logical View:**

The logical view, also known as the implementation-independent view, provides a more detailed representation of the data structure, including data types, constraints, and relationships. It bridges the gap between the high-level conceptual view and the physical implementation details.

The logical view maintains the business perspective but introduces more technical specifications, such as primary keys, foreign keys, and data validation rules. It defines the logical structure of the data without specifying the specific storage mechanisms or database technologies.

This view serves as a blueprint for the physical implementation and ensures that the data model can be translated into a functional database system. It also facilitates communication between data analysts and database developers.

**Physical View:**

The physical view represents the actual implementation of the data model within a specific database system. It considers the technical limitations and constraints of the chosen database technology and translates the logical data structures into physical tables, indexes, and storage mechanisms.

The physical view is tailored to the specific database environment and incorporates optimizations for performance and scalability. It defines the data types, storage formats, and access methods that are compatible with the chosen database system.

This view is crucial for ensuring that the data model can be efficiently stored, retrieved, and manipulated within the database. It bridges the gap between the logical representation and the physical implementation.

2. Read about Normal Form
1NF: 1st Normal Form
2NF: 2nd Normal Form
3NF: 3rd Normal Form
4NF: 4th Normal Form
5NF: 5th Normal Form

3. Disadvantages of normalization
4. 20 attributes of a building

Here is a brief explanation of the following concepts:

1) What is normal form
Normal form is a database design principle for organizing data in an organized and consistent way. It helps to avoid redundancy and maintain the integrity of the database. It also helps to eliminate undesirable characteristics associated with insertion, deletion, and updating  .

2) 1NF: 1st Normal Form
For a table to be in the first normal form, it must meet the following criteria:
- a single cell must not hold more than one value (atomicity)
- there must be a primary key for identification
- no duplicated rows or columns
- each column must have only one value for each row in the table 

2NF: 2nd Normal Form
For a table to be in the second normal form, it must meet the following criteria:
- it must be in the first normal form
- each non-key attribute must be dependent on the primary key. This means that each column should be directly related to the primary key, and not to other columns 

3NF: 3rd Normal Form
For a table to be in the third normal form, it must meet the following criteria:
- it must be in the second normal form
- all non-key attributes must be independent of each other. This means that each column should be directly related to the primary key, and not to any other columns in the same table 

4NF: 4th Normal Form
For a table to be in the fourth normal form, it must meet the following criteria:
- it must be in the third normal form
- it must not contain any multi-valued dependencies. This means that there should be no columns that have multiple values for a single row

5NF: 5th Normal Form
For a table to be in the fifth normal form, it must meet the following criteria:
- it must be in the fourth normal form
- it must not contain any join dependencies. This means that there should be no tables that can be decomposed into smaller tables without losing information

3. Disadvantages of normalization
Normalization has many advantages, such as reduced data redundancy, improved data consistency, simplified database design, and improved query performance. However, normalization also has some disadvantages, such as:
- increased complexity of database design and queries
- increased number of tables and joins
- decreased performance for some operations that require denormalized data
- possible loss of business meaning or context


20 attributes of a building
 A building can be an object in a class that represents different types of structures. Some possible attributes of a building are:

- name
- address
- height
- area
- number of floors
- number of rooms
- construction date
- architectural style
- material
- color
- function
- owner
- value
- occupancy rate
- energy efficiency
- maintenance cost
- safety features
- amenities
- accessibility
- landmarks

These attributes can be used to describe the properties and characteristics of a building object.