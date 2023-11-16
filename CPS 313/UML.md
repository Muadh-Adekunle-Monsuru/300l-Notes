UML: Unified Modelling Language.

UML, or Unified Modeling Language, is a standardized visual modeling language used in software engineering and other fields to design and document software systems. UML provides a set of graphical notations and a common language for representing the structure, behavior, and relationships of various components within a software system. It was developed by the Object Management Group (OMG) and has become a widely accepted standard in the software development industry. UML is linked with
object oriented design and analysis. 

### Purpose of UML
1. **Modeling:** UML allows software developers to create abstract models of a system, which can help in understanding the system's structure and behavior before actual implementation.

2. **Communication:** UML diagrams serve as a common language for communication among project stakeholders, including developers, designers, testers, and project managers. They help in conveying complex concepts and ideas in a visual and standardized way.

3. **Documentation:** UML diagrams are used to document various aspects of a software system. They provide a visual representation of the system's architecture, design, and behavior, making it easier to maintain and update documentation.

4. **Analysis and Design:** UML supports the analysis and design phases of software development. It includes a wide range of diagrams to model different aspects of a system, such as class diagrams, sequence diagrams, use case diagrams, and more, which aid in designing and refining the system's architecture.

5. **Code Generation:** Some UML modeling tools can generate code from UML diagrams, speeding up the development process. This is particularly useful for ensuring consistency between the design and the implementation.

### General Classification of UML
- **Structural Diagrams** : Capture static aspects or structure of a system. Structural Diagrams include:
	- Component Diagrams,
	- Object Diagrams, 
	- Class Diagrams 
	- Deployment Diagrams.
- **Behavior Diagrams** – Capture dynamic aspects or behavior of the system. Behavior diagrams include: 
	- Use Case Diagrams, 
	- State Diagrams, 
	- Activity Diagrams 
	- Interaction Diagrams.
 
1. **Class Diagrams:** Represent the static structure of a system, showing classes, attributes, methods, and their relationships.

2. **Use Case Diagrams:** Describe the functional requirements of a system from the user's perspective.

3. **Sequence Diagrams:** Show the interactions between objects over time, illustrating the dynamic behavior of a system.

4. **Activity Diagrams:** Model the workflow or business processes within a system.

5. **State Machine Diagrams:** Describe the different states and transitions of an object.

6. **Component Diagrams:** Depict the physical components of a system and their relationships.

7. **Deployment Diagrams:** Illustrate the deployment of software components to hardware.

8. **Package Diagrams:** Organize and show the dependencies between different packages within a system.



![[Pasted image 20231108125954.png]]



### Object Oriented Concepts Used in UML –
- **Class** : A class defines the blue print i.e. structure and functions of an object.
- **Objects** : Objects help us to decompose large systems and help us to modularize our system. Modularity helps to divide our system into understandable components so that we can build our system piece by piece. An object is the fundamental unit (building block) of a system which is used to depict an entity.
- **Inheritance** : Inheritance is a mechanism by which child classes inherit the properties of their parent classes.
- **Abstraction** : Abstraction in UML refers to the process of emphasizing the essential aspects of a system or object while disregarding irrelevant details. By abstracting away unnecessary complexities, abstraction facilitates a clearer understanding and communication among stakeholders.
- **Encapsulation** : Binding data together and protecting it from the outer world is referred to as encapsulation.
- **Polymorphism** : Mechanism by which functions or entities are able to exist in different forms.

### Types of Relationships between classes:
- Association
- Aggregation
- Composition
- Generalization

- **Association** is a bidirectional relationship between two classes, where each class is aware of the other and can interact with it. This is the most general type of relationship, and it is used to represent a wide variety of real-world relationships, such as:

	- A customer and an order
	- A student and a course
	- An employee and a department

- **Aggregation** is a unidirectional relationship between two classes, where the parent class "has a" child class. The child class can exist independently of the parent class, but the parent class may not be able to function without the child class. Aggregation is often used to represent a "part-of" relationship, such as:

	- A car and its wheels
	- A house and its rooms
	- A computer and its monitor

- **Composition** is a stronger form of aggregation, where the child class cannot exist independently of the parent class. If the parent class is destroyed, the child class must also be destroyed. Composition is often used to represent a "whole-part" relationship, such as:

	- A car and its engine
	- A house and its foundation
	- A computer and its CPU
 
- **Generalization** is a relationship between two classes, where the child class is a more specialized version of the parent class. The child class inherits all of the attributes and behaviors of the parent class, and it may also add its own unique attributes and behaviors. Generalization is often used to represent a "is-a" relationship, such as:
	
	- A dog is a mammal
	- A student is a person
	- A car is a vehicle