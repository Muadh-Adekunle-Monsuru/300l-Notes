## Graph

An abstract data structure that is used to implement the mathematical concept of graph. It is basically a collection of vertices and edges that connect this vertex. Graph can be directed or undirected. In an undirected graph edges do not have any direction associated with them.  Likewise in a directed graph edges form an ordered pair. If there is an edge from A to B then there is a path from A to B not from B to A. 
![[Pasted image 20231218085832.png]]


![[Pasted image 20231111110509.png]]

## Terminologies of Graph
- **Adjacent nodes**: For every edge `e = (u,v)` that connects node U and V, the node U and v are the endpoint and are said to be adjacent node or neighbors. 
- **Degree of a n**ode: The degree of a node U `deg(U)` is the total number of edges containing the node. If the degree of a node is 0 it means U does not belong to any edge and such a node is known as an isolated node.  
- Path: A path P is written as `P = {V0,V1,V2...Vn}` of length n from  a node u to v is defined as a sequence of `n+1` nodes. Here $U = V_0$ , $V = V_n$ and $V_{i-1}$ is adjacent to $V_i$ for i = 1,2, 3 .... path.   
## Read about
- Regular graph
- Closed path
- Simple path
- Cycle
- Connected graph 
- Complete graph
- Labeled graph 
- Weighted graph
- Multi-edges
- Loop
- Multi graph
- Size of a graph


# Representation of Graph
A graph can be represented in three ways:
##### 1. Sequential Adjacency matrix representation
![[Pasted image 20231218091739.png]]

---
##### 2. Linked Representation Using Adjacency List
![[Pasted image 20231218093538.png]]
![[Pasted image 20231218093424.png]]
![[Pasted image 20231218094749.png]]

![[Pasted image 20231218095102.png]]
##### 3. Adjacency Multi-List 









---

A graph is a non-linear data structure that consists of finite set of vertices (or nodes) and edges. It is used to solve challenging and complex programming problems. 
#### Characteristics of graph:
- The maximum distance from a vertex to all the other vertices is considered the eccentricity of that vertex. 
- The vertex having minimum eccentricity is considered the central point of the graph. 
- The minimum value of eccentricity from all vertices is considered the radius of a connected graph. 


