1. Briefly explain the following
	1. Data structure: A data structure is a way of organizing and storing data in a computer so that it can be efficiently used and manipulated. It defines a set of rules or operations that can be performed on the data, and it includes both the organization of the data and the algorithms used to access and manipulate it.
	2. Multigraph: A multigraph is a mathematical structure that extends the concept of a graph. In a multigraph, multiple edges (connections) between the same pair of vertices (nodes) are allowed. Unlike simple graphs where only one edge is permitted between any two nodes, multigraphs can have multiple edges with possibly different attributes.
	3. Queue: A queue is a linear data structure that follows the First In, First Out (FIFO) principle. In a queue, elements are added at the rear (enqueue) and removed from the front (dequeue). The element that has been in the queue the longest is the first one to be dequeued.
	4. Doubly linked list: A doubly linked list is a type of linked list in which each node contains a data element and two pointers, one pointing to the next node in the sequence (next pointer) and another pointing to the previous node (previous pointer). This structure allows for bidirectional traversal, meaning you can traverse the list in both forward and backward directions
2. List the elements in the tree as one traverse the following
	1. Pre-order: A, B, D, E , H , L , P, M, C, F, I, G, J, K, N, O, Q
	2. In-order: D, B, E, P, L, H, M, A, I, F, C, J, G, N, K, O, Q
	3. Post-order: D, P, L, M, H, E, B, I, F, J, N, Q, O, K, G, C, A
3. Convert 
	1. $0562_{10}$ to base 8 = 1062
	2. $586.981_{10}$ to base 16 = **24A**.3D5
4. Differentiate between
	1. In-degree and out-degree:
		- _In-degree:_ The in-degree of a node in a directed graph is the number of edges directed into that node. It represents the count of incoming edges.
		- _Out-degree:_ The out-degree of a node in a directed graph is the number of edges that leave that node. It represents the count of outgoing edges.
	1. Sift-up and Sift-down:
		- _Sift-up:_ This is an operation commonly performed on a heap data structure. After inserting an element into a heap, it may violate the heap property, so the sift-up operation moves the newly inserted element to its correct position by swapping it with its parent until the heap property is restored.
		- _Sift-down:_ Also used in heaps, the sift-down operation is performed after extracting the root element. The last element is moved to the root, and it is swapped with its smaller (for a max heap) or larger (for a min heap) child until the heap property is satisfied.
	1. Pre-order and Post-order:
		- _Pre-order:_ In a tree traversal, pre-order means visiting the root node first, followed by recursively traversing the left subtree and then the right subtree. The order of operations is root, left subtree, right subtree.
		- _Post-order:_ In post-order traversal, the left subtree is traversed first, followed by the right subtree, and finally, the root node is visited. The order of operations is left subtree, right subtree, root.
1. Enumerate any four operations that can be performed on:
	1. Graphs
		1. Add Vertex: Add a new vertex to the graph.
		2. Add Edge: Create a new edge between two vertices in the graph.
		3. Remove Vertex: Delete a vertex from the graph, along with any associated edges.
		4. Remove Edge: Delete an edge between two vertices.
	3. Tree:
		- _Insert Node:_ Add a new node to the tree.
		- _Delete Node:_ Remove a node from the tree.
		- _Search:_ Find a specific node in the tree.
		- _Traverse:_ Visit all nodes in a specific order, like in-order, pre-order, or post-order traversal.
	1. Set: 
		- _Add:_ Add a new element to the set.
		- _Remove:_ Delete a specific element from the set.
		- _Union:_ Combine two sets to create a new set containing all unique elements from both sets.
		- _Intersection:_ Create a new set containing elements common to two existing sets.
	1. Stack: 
		1. Push: Add an element to the top of the stack.
		2. Pop: Remove and retrieve the element from the top of the stack.
		3. IsFull: Check if the stack is full.
		4. IsEmpty: Check if the stack is empty.
1. Using 1's and 2's complements perform the following subtractions
	1. $110_2$ - $101.11_2$ = 000.01
	2. $111.11_2$ - $101.10_2$ = 010.01
2. Let L be the linked list of the objects in the diagram below. Give the results of the following ADT operations

|  |  | A | B | C | D | E | F |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
	1. Empty L
	2. Insert(X,4)
	3. Delete(5,L)
	4. Retrieve(1,L)

|  |  | Return |  |
| ---- | ---- | ---- | ---- |
| Empty L | - - A B C D E F | False | Checks if the Linked list is empty |
| Insert(X,4) | - - A B X C D E F | - |  |
| Delete(5,L) | - - A B X D E F | - |  |
| Retrieve(1,L) | - - A B X D E F  | Null | Retreives the value in array 1 |

8. Draw the Tree representation of 
	1. $a*(1/6)*(a+b^3)^n$
	2. $(-3+6)+(-7)*4-5+(f/g-e)$
9. Using 10's and 9's complements to perform the arithmetic operations
	1. $8569_{10}$ - $2216_{10}$ = 
	2. $7106_9$ - $6766_9$
10. Draw the tree diagram using Heap inserting method to store the following data 45,16,48,50,55,60,40. And hence perform these operations
	1. Insert 65
	2. Delete number 55
11. Explain in details the implementations of each of the following
	1. Linked List: A linked list is a data strucutre where elements are stored in nodes, and each node points to the next on in the sequence. Reference(or link or pointers) are used to reference the next node. 
	2. Stack: A stack is a Last-in-Firt-Out data structure. Elements are added and removed from the same end, known as the top. 
	3. String: A string is a sequence of characters. It can be implemented as an array of characters or using dynamic memory allocation 
12. Explain in details
	1. Array implementation of binary tree: 
	2. Pre-order representation of binary tree
	3. Cursor based method of linked list implementation
	4. Left most child right sibling representation
13. Let G = (V,E) be a graph with V = (a,b,c,d,e) and E = {(a,b),(b,a),(a,c),(a,d),(b,c),(d,e)}
	1. Draw the graph and write the adjacency matrix for G
14. Show in a table the steps involved in converting these expressions ((A+B)*D)^(E-F)
