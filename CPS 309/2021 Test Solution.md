1. What are the four major components of Database system? Briefly Explain
	A database system consists of four major components: 
		- **Data**: The data component represents the information stored in the database. 
		- **Hardware**: The hardware component refers to the physical devices used for data storage, processing, and retrieval. 
		- **Software:** The software component includes the database management system (DBMS) and application programs. The DBMS is a crucial part of the software component, as it manages the database and enables users to interact with it. 
		- **Users**: The users component encompasses the individuals who interact with the database system, including administrators, programmers, and end users.

2. Enumerate the advantages of Database systems:
	- **Persistent Storage of Data:** Data remains stored and accessible.
	- **Large Volume Data Storage:** Databases can hold extensive data independently of any specific process.
	- **Flexible Data Structure:** Supports efficient access to vast datasets with adaptable data structures.
	- **Scalability:** DBMS can expand as data grows, across multiple machines.
	- **Developer Productivity:** Eliminates the need to structure data within the program.
	- **Shared Data Capability:** Enables data sharing among different individuals.
	- **Data Security:** Ensures data safety.

1. What is DBMS? What are the advantages and disadvantages offered by such systems as compared to file processing system?
	 A Database Management System (DBMS) is a software system that allows users to define, create, and maintain databases while providing controlled access to the data.
	  The advantages of a DBMS include: 
		  - improved data sharing,
		  - enhanced data security, 
		  - better data integration, 
		  - data consistency. 
	DBMS also has certain limitations, such as:
		- increased costs, 
		- complexity, 
		- vendor dependence 
1. Briefly explain the meaning of the following with suitable examples
	1. **Entity**: An entity is a distinct object, such as a person, place, or thing, about which data can be stored. For example, in a hospital system, "patient" and "doctor" are entities.
	2. **Empty Set**: In the context of a database, an empty set refers to a set that contains no elements. For instance, if there are no patients in a hospital's waiting list, the set of waiting list patients is an empty set.
	3. **Weak-Entity Set**: A weak entity is an entity that cannot be uniquely identified by its attributes alone. It depends on another entity, known as the identifying or owner entity. For example, in a database for a bank, a "transaction" entity may be weak and depend on the "account" entity.
	4. **Domain**: A domain is the set of possible values for an attribute. For instance, the domain of the "blood type" attribute for a patient entity in a hospital system could be {A, B, AB, O}.
	5. **Primary Key**: A primary key is a unique identifier for an entity within a table. It uniquely identifies each record in the table. For example, in a "patient" table, the patient's ID could be the primary key[1].

3. An Hospital has a set of patients and a set of medical doctors. Each patient is admitted into different wards and each of them is associated with a log of various test and examinations.
	1. Identify the entities in the above system. 
		 **Entities**: Patients, doctors, wards, tests, examinations.
	6. Identify the attributes of the entities identified in (i)
		 **Attributes**:
		   - Patient: ID, name, age, gender, admission date.
		   - Doctor: ID, name, specialization.
		   - Ward: ID, type, capacity.
		   - Test: ID, type, date, result.
		   - Examination: ID, type, date, result.
	4. Identify relations and their cardinalities
		 **Relations and Cardinalities**:
		   - Patients-Doctors (Many-to-Many)
		   - Patients-Wards (Many-to-Many)
		   - Patients-Tests (One-to-Many)
		   - Patients-Examinations (One-to-Many)
	3. Draw E-R diagram for the above systemi
			![[Pasted image 20240211082045.png]]
	1. Construct the appropriate tables for this E-R diagram and list the tables with their attributes, primary key and foreign key
		 **Tables**:
		   - **Patient** (ID, name, age, gender, admission_date, ward_ID)
		   - **Doctor** (ID, name, specialization)
		   - **Ward** (ID, type, capacity)
		   - **Test** (ID, type, date, result, patient_ID)
		   - **Examination** (ID, type, date, result, patient_ID)

|Table|Attributes|Primary Key|Foreign Key|
|---|---|---|---|
|Patient|patient_ID, name, address, date_of_birth, ward_ID|patient_ID|ward_ID|
|Medical Doctor|doctor_ID, name, department, specialization|doctor_ID||
|Ward|ward_ID, name, capacity, floor_number|ward_ID||
|Test/Examination|test_ID, type, date, result, patient_ID, doctor_ID|test_ID|patient_ID, doctor_ID|

7. Differentiate between the following with examples:
	1. **Entity and Attributes**:
	   - An entity is a distinct object, while an attribute is a characteristic or property of an entity. For example, in a "car" entity, "model" and "color" could be attributes.
	2. **Primary and Foreign Key**:
	   - A primary key is a unique identifier for an entity within a table, while a foreign key is a field in a table that refers to the primary key in another table to establish a link between the two tables.
	3. **Candidate Key and Primary Key**:
	   - A candidate key is a set of attributes that can uniquely identify a tuple, and from which the primary key is selected. The primary key is the chosen candidate key that will be used as the main means of accessing data in a table.
