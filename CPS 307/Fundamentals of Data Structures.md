11/6/23
https://www.geeksforgeeks.org/what-is-data-structure-types-classifications-and-applications/?ref=roadmap

https://www.geeksforgeeks.org/complete-roadmap-to-learn-dsa-from-scratch/

## **Definition**
- **Data:** Data is a value or set of values.
- **Entity:** An entity is any object in a system that we want to model and store information about.
- **Information:** Processed data.
- **Data Types:** Data types are classifications of the types of data that a variable or object can hold.

## **What is Data Structure?**
Data structure refers to:
- A scheme for organizing related pieces of information.
- The way in which sets of data are organized in a particular system.
- An organized aggregate of data items.
- The representation of the logical relationship existing between individual elements of data.
- How data is efficiently organized to aid ease of access and storage.

### **Data Structures Classification**

Data structures can be broadly categorized into two general classifications:

1. **Linear Data Structures**: Linear data structures are organized in a sequential and linear manner, where each element is connected to its previous and next elements, forming a one-dimensional arrangement. This structure facilitates straightforward traversal and access to the data elements.
2. **Non-Linear Data Structures**: Non-linear data structures, in contrast, do not follow a linear sequence. Instead, they allow elements to be connected in a more complex, branching manner. These structures represent more intricate relationships among data elements and enable the creation of hierarchical or interconnected relationships. 
#### **Linear Data Structures**
- **Array:** A collection of a finite number of homogeneous data elements.
- **Queue:** A linear collection of data items in which insertion takes place at one end and deletion can take place at the other end (First in First Out).
- **Stack:** A linear collection of data items where insertion and deletion can occur at only one end (Last in First Out).
- **Linked List:** Data elements are managed by a collection of nodes, where each node contains a link or pointer pointing to the next node in the list. [[Types of Linked List]]

#### **Non-Linear Data Structures**
- **Tree**: It is a non-linear data structure which is used to represent data elements, having hierarchical relationship between them. 
- **Graph**: It is a non-linear data structure which is used to represent data having relationship among its elements which are not necessarily hierarchical in nature.

In linear data structures, each element has a fixed next element, whereas in non-linear data structures, each element can have many different next elements.

---
13/11/23
Applications of data structure

Data structure such as stack are applied in functions, expression evaluation, undo and redo operation in word processors.

Queue: Operating systems often maintain a queue of processes that are ready to execute or that are waiting for a particular even to occur. 

Graph: Connections in social networking sites, routing, networks of communication, dictionary, library

Tree: mathematical expression 



---
# Array 
Array: A structure that holds multiple values of the same type. An array element can be accessed using an index value. 
Write a program to calculate the average age among six student 
An array can be multidimentional

## Classification of Array:
- Static: The size is fixed an cannot be changed, once their storage has been allocated. 
- Dynamic: Size can be changed and array can be resized despite storage being allocation

Applications of arrays :
- Applications which data items needs to be saved in the computer memory for subsequent reprocessing. 
- Can be implemented in other data structures:
	- Stack 
	- Queue
	- Heaps

# Linked List
Linked-List: Sequential data structure or collection of items accessible one after the other beginning at the head and ending at the tail. 

Operations performable on list:
- Add: Items can be added to a list
	L = A B C
	Add(1,X,L)
	<mark style="background: #FFF3A3A6;">	means add X to the index 1 of array L</mark>
	L = A X B C
- Set
	Set (2, Z, L)
	<mark style="background: #FFF3A3A6;">	means set the value in index 2 to Z in the array L</mark>
	L = A X Z C
- Remove
	Remove(Z,L)
	<mark style="background: #FFF3A3A6;">	means remove Z from the array L</mark>
- Get
	Get(2,L)
	<mark style="background: #FFF3A3A6;">	means get the value at index 2 of array L</mark>
	C
- Index of
	IndexOf(X,L)
	<mark style="background: #FFF3A3A6;">	means get the index of X in the array L</mark>
	1
-