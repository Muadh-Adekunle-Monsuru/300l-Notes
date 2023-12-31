## Tree:

It is a hierarchical structure that is used to represent and organize data in a way that is easy to navigate and search.  It is a collection of nodes that are connected by edges. And has a hierarchical relationship between the nodes.

A tree is a non-linear and hierarchical data structure where the elements are arranged in tree-like structure. In a tree, the topmost node is called the root node. Each node contains some data, and data can be of any type. 


Different tree data structures allow quicker and easier access to the data as it is non-linear

![[Pasted image 20231111110133.png]]
#### Characteristics of a tree
- In a tree, the Height of the root can be defined as the longest path from the root node to the leaf node. 
- In a tree, one can also calculate the depth from the top to any node. The root node has a depth of 0

- Root Node: the root node is the topmost node in the tree. 
- Sub-trees: If the root node R is not null then T1,T2 and T3 are called subtrees of R
- Leaf Node: A node that has no children 
- Path: A sequence of consecutive edges
- Level Number: Every node in the tree is assigned a level number in such a way that the root node is at level 0, and every node is one level higher than its parent.
- Degree: Equal to the number of children that a node has. 
	- In-degree: It is the number of edges arriving at the node
	- Out-degree: Number of edges leaving the node
- Ancestor node: Any predecessor on the path from root to the node. 
- Descendant node: Any successor node on any path from the node to a leaf node

---
https://www.baeldung.com/cs/depth-first-traversal-methods
## Binary Tree:
A data structure that is defined as a collection of elements called nodes. Each node has 0 or 1 or at most 2 children. 

![[Pasted image 20231127092944.png]]

Siblings: All nodes that are at the same level and share the same parent are called siblings

## Similar Binary Tree
A tree is similar if they have the same structure. 
![[Pasted image 20231127093513.png]]

## Copies Binary Tree
Two binary trees are copies if they have similar structure and same contents at the corresponding node
![[Pasted image 20231127093738.png]]


## Traversing A Binary Tree
It is the process of visiting each node of a tree exactly once in a systematic way. 
NLR: Node-Left-Right
**Ways of traversing trees data structure:**
- Preorder Algorithm:
1. Visit the root node
2. Visit the left subtree
3. Visit the right subtree

![[Pasted image 20231127094725.png]] 


## In-order NLR
![[Pasted image 20231127095430.png]]
![[Pasted image 20231201111209.png]]
## Post Order LRN
![[Pasted image 20231201111140.png]]

---
# Binary Search Tree
A binary search tree is also know as an ordered binary tree, it is a variant of binary tree in which the nodes are arranged in order. 
- The left subtree of a node N contains values that are less than N's value
- The right subtree of node N contains values that are greater than N's value
- Both Left and Right binary tree also satisfy this properties, and thus are binary search three

- ![[Pasted image 20231204090153.png]]

## Operations on binary search tree
- **Insertion:** Used to add new node with a given value at the correct position in the binary search tree
- **Deleting:** Deletes a node from the binary search tree however care should be taken following the properties below. 
	- Case 1: Node without children
	- ![[Pasted image 20231204092659.png]]
	- Case 2: Deleting a node with one child
	- ![[Pasted image 20231204093424.png]]
	- Case 3: Deleting a node with two children 
		![[Pasted image 20231204093253.png]]
		![[Pasted image 20231204093332.png]]



# Applications of trees
- Used to store simple and complex data, simple such as integer value and character values and complex such as structure or record. 
- Implementing other types of data structure. Such as Hash tables, sets and maps. 
- Used in database design
- In file system system directory



## Expression Tree














---
