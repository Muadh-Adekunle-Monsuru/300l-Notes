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

[13/11/23]

### Applications of Data Structures:

1. **Stack:**
   - Functions
   - Expression evaluation
   - Undo and redo operations in word processors

2. **Queue:**
   - Operating systems maintain queues for processes ready to execute or waiting for specific events.

3. **Graph:**
   - Social networking site connections
   - Routing
   - Communication networks
   - Dictionary and library structures

4. **Tree:**
   - Mathematical expressions
![[2023_11_13 9_20 AM Office Lens.jpg]]
---

## Array

**Definition:**
An array is a structure that holds multiple values of the same type. Array elements can be accessed using an index value.

**Program Example:**
Write a program to calculate the average age among six students.

**Multidimensional Arrays:**
Arrays can be multidimensional.

### Classification of Array:

1. **Static Array:**
   - Fixed size; cannot be changed once allocated.

2. **Dynamic Array:**
   - Size can be changed; array can be resized despite initial allocation.

### Applications of Arrays:

- Saving data items in computer memory for subsequent reprocessing.
- Implementation in other data structures:
  - Stack
  - Queue
  - Heaps

---

## Linked List

**Definition:**
A linked list is a sequential data structure or collection of items accessible one after the other, beginning at the head and ending at the tail.

### Operations:

1. **Add:**
   - Items can be added to a list.
     - Example: `L = A B C`, `Add(1, X, L)` means add X to index 1 of array L, resulting in `L = A X B C`.

2. **Set:**
   - Set the value at a specific index in the array.
     - Example: `Set(2, Z, L)` means set the value at index 2 to Z in array L, resulting in `L = A X Z C`.

3. **Remove:**
   - Remove a specified item from the array.
     - Example: `Remove(Z, L)` means remove Z from array L.

4. **Get:**
   - Get the value at a specific index in the array.
     - Example: `Get(2, L)` means get the value at index 2 of array L, resulting in `C`.

5. **Index of:**
   - Get the index of a specified value in the array.
     - Example: `IndexOf(X, L)` means get the index of X in array L, resulting in `1`.



---
Application of stack 
- Stacks are frequently used in evaluation of arithmetic expression, an expression consists of operands and operators. 
- Conversions of different notations such as infix, prefix and postfix. 
- Used in computers when recursive functions are called. 
[[Additional Operations of Stack]]

---
**Order of operation**
Multiplication -> Division -> Addition -> Subtraction

---

 Action         | Content of Stack after operation | Return-Value 
----------------|---------------------------------|--------------
 Initialise(S)  | empty                           |              
push(A,S)      | A                               |              
 push(B,S)      | A, B                            |             
 push(C,S)      | A, B, C                         |              
 pop(S)         | A, B                            | C            
 push(D,S)      | A, B, D                         |             
pop(S)         | A, B                            | D            


---
Queue


| Action          | Content of Queue after operation | Return-Value |
|-----------------|----------------------------------|--------------|
| Initialise(S)   | empty                            | -            |
| Add(A,Q)        | A                                | -            |
| Add(B,Q)        | A, B                             | -            |
| Add(C,Q)        | A, B, C                          | -            |
| Remove(Q)       | A, B                             | A            |
| Add(D,Q)        | B, C, D                          | -            |
| Remove(Q)       | C, D                             | B            |

Storing a queue in a static data structure, this implementation stores the queue in an array, the array indexes at which the head and tail of the queue are currently stored must be maintained. 

If we have a Queue B: 

1 | 2 | 3
--- | --- | --- 

the index of the Head of B is 0 and the Tail is at 2

If we perform a remove operation on B the b becomes 

__ | 2 | 3
--- | --- | --- 

 the Head is now at 1 while the Tail remains at 2
 
 __ | 2 | 3
--- | --- | --- 

<mark style="background: #ABF7F7A6;">Read about static dynamic and circular queue</mark>

