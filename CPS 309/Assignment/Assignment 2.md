14/11/23
## Origin of Database
1. In synopsis format, discuss the origins and evolution of modern day database system. 

	In early day of computing information are stored in flat file systems. 
	The first database model was hierarchical models. Due to the difficulty of many to many relationships the hierarchical model fell out of favor. 
	The Network database model was able to solve the problem of many-to-many relationship. But due to the complexity it is difficult to manage and organize. 
	Relation database was invented by Edgar F Codd in 1970. 

	 The origins of database systems can be traced back to the 1960s, when the first hierarchical and network models were developed to manage large amounts of data for business and scientific purposes. These models used a rigid structure of records and links that made it difficult to handle complex and dynamic data. 
	 
	 In the 1970s, the relational model emerged as a breakthrough in database design, introducing the concept of tables, rows, and columns, and allowing users to query data using a high-level language called SQL. The relational model was widely adopted and became the dominant paradigm for database systems. However, it also had some limitations, such as the inability to handle unstructured or semi-structured data, such as text, images, or multimedia. 
	 
	 In the 1980s and 1990s, new types of database systems were developed to address these challenges, such as object-oriented databases, which integrated data and behavior into objects, and object-relational databases, which extended the relational model with object-oriented features. 
	 
	 In the 2000s and 2010s, with the advent of the internet and big data, new trends emerged in database systems, such as distributed databases, which allowed data to be stored and processed across multiple nodes in a network, and NoSQL databases, which offered more flexibility and scalability than relational databases by using different data models, such as key-value, document, graph, or columnar.
	 
   Today, database systems are ubiquitous and essential for various applications and domains, such as e-commerce, social media, health care, education, and science.
   
2. <mark style="background: #ADCCFFA6;">Reasons why many databases are relational in nature</mark>
	One reason is that relational databases allow data to be organized in tables, which are easy to understand and manipulate. 
	
	Some reasons why many databases are relational are:
	
	- Relational databases allow for efficient data storage and retrieval by organizing data into tables with rows and columns.
	- Relational databases support data integrity and consistency by enforcing constraints and rules on the data, such as primary keys, foreign keys, and referential integrity.
	- Relational databases enable complex data analysis and manipulation by supporting various operations and functions, such as joins, aggregations, subqueries, and views.
	- Relational databases facilitate data access and security by providing mechanisms for user authentication, authorization, encryption, and auditing.
	- Relational databases are widely used and supported by many software tools and platforms, such as SQL, Oracle, MySQL, PostgreSQL, and Microsoft Access.
1. Read about entity relationship database model 
	An entity relationship database model is a type of structural diagram that shows how different entities (such as people, customers, or objects) relate to each other in a database. It uses specific symbols and notations to represent the entities, their attributes, and the relationships between them. An entity relationship database model can help the database designers to understand the structure and logic of the database, and to create or modify it accordingly.
	An entity relationship diagram (ERD) is **a diagram that shows the relationships between entities in a database**. ERDs are also known as ER models or ER diagrams. 

	ERDs are used to model real-world objects and the relationships between them. For example, in a school database, a student is an entity with attributes like name, age, and address. The address is another entity with attributes like street name, city, and pin code. 

	ERDs are used in database design. They can help stakeholders understand the structure, components, and dependencies of a system. 

	ERDs contain symbols and connectors that show: 

- The major entities in the system
- The relationships between the entities
- The attributes of the entities


1. Write short notes on the following database concepts with examples
	1. Relationships
	2. One-many relationships
	3. one to one relationships
	4. many to many relationship
	5. Flaws associated with many-to-many
	6. Unique features of relational database model 

Relationships are the connections between different entities in a database. For example, a student entity can have a relationship with a course entity, indicating that the student is enrolled in the course.

One-many relationships are the most common type of relationships in databases. They occur when one entity can be associated with many instances of another entity, but not vice versa. For example, a course entity can have a one-many relationship with a student entity, meaning that one course can have many students, but one student can only belong to one course.

One-to-one relationships are the rarest type of relationships in databases. They occur when one entity can be associated with only one instance of another entity, and vice versa. For example, a person entity can have a one-to-one relationship with a passport entity, meaning that one person can have only one passport, and one passport can belong to only one person.

Many-to-many relationships are the most complex type of relationships in databases. They occur when one entity can be associated with many instances of another entity, and vice versa. For example, a student entity can have a many-to-many relationship with a course entity, meaning that one student can enroll in many courses, and one course can have many students.

---

Flaws associated with many-to-many relationships are that they can create redundancy and inconsistency in the data. To avoid these problems, many-to-many relationships are usually implemented using an intermediate entity that links the two entities involved. For example, a student-course entity can be used to store the information about which student is enrolled in which course.

Unique features of relational database model are that it uses tables to store data, where each table has a fixed number of columns and a variable number of rows. Each row represents an instance of an entity, and each column represents an attribute of the entity. The tables are linked by using primary keys and foreign keys, which are unique identifiers that establish the relationships between the tables.