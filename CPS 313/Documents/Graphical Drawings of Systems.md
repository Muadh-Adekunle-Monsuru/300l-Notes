## DFD Data Flow Diagrams

A structured analysis technique that employs a set of visual representations of the data that moves through the organization, the paths through which the data moves, and the processes that produce, use, and transform data.

### Uses of DFD
- Can diagram the organization or the system 
-  Can diagram the current or proposed situation 
- Can facilitate analysis or design 
- Provides a good bridge from analysis to design 
- Facilitates communication with the user at all stages

## Levels of DFD 
- Context Level (Level 0) 
- Level 1
- Level 2

In DFD each subsequent level contains an increasing amount of details. The context level has the highest level of abstraction, meaning fewest detail and complexity, while level 2 has the highest level of details. 
- Context diagrams — context diagram DFDs are diagrams that present an overview of the system and its interaction with the rest of the “world”.
- Level 1 data-flow diagrams — Level 1 DFDs present a more detailed view of the system than context diagrams, by showing the main sub-processes and stores of data that make up the system as a whole.
- Level 2 (and lower) data-flow diagrams — a major advantage of the data-flow modelling technique is that, through a technique called “levelling”, the detailed complexity of real world  systems can be managed and modeled in a hierarchy of abstractions. Certain elements of any dataflow diagram can be decomposed (“exploded”) into a more detailed model a level lower in the hierarchy

### Four basic elements are used to construct data-flow diagrams: 
- processes 
- data-flows 
- data stores 
- external entities

### Symbols used in DFD
![[Pasted image 20240216231829.png]]
![[Pasted image 20240216231858.png]]
![[Pasted image 20240216231917.png]]
![[Pasted image 20240216232328.png]]

---
## Context Diagram
The context diagram is used to establish the context and boundaries of the system to be modelled: which things are inside and outside of the system being modelled, and what is the relationship of the system with these external entities

Just one process • All sources and sinks that provide data to or receive data from the process • Major data flows between the process and all sources/sinks • No data stores

![[Pasted image 20240216232356.png]]

![[Pasted image 20240216232847.png]]

---
## Level 1 
- Process is “exploded” 
- Sources, sinks, and data flows repeated from context diagram 
- Process broken down into subprocesses, numbered sequentially 
- Lower-level data flows and data stores added
![[Pasted image 20240216232500.png]]
![[Pasted image 20240216232955.png]]

---

## Level 2 of Pizza Delivery 
![[Pasted image 20240216232815.png]]