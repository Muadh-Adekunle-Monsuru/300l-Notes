## **Algorithm**
A step-by-step list of instructions for solving a programming problem. Complexity refers to the degree to which a system or component has a design or implementation that is difficult to understand and verify.

### **Categories of Algorithms**
- **Search:** Used to search for an item in a data structure.
- **Sort:** Used to arrange items in a specific order.
- **Insert:** Used to add an item to a data structure.
- **Update:** Used to modify an existing item in a data structure.
- **Delete:** Used to remove an existing item from a data structure.

### **Characteristics of Algorithms**
1. **Unambiguous:** Each step and its inputs/outputs should be clear and lead to only one meaning.
2. **Input:** An algorithm must have one or more well-defined inputs.
3. **Output:** An algorithm must have one or more well-defined outputs.
4. **Finiteness:** An algorithm must terminate after a finite number of steps.
5. **Feasibility:** An algorithm should be achievable with the available resources.
6. **Independence:** An algorithm should provide step-by-step directions independent of any programming code.

## **Algorithm Analysis**
- **Prior Analysis:** This is a theoretical analysis of an algorithm. Efficiency is measured assuming constant factors like processor speed have no effect on the implementation.
- **Posterior Analysis:** An empirical analysis of an algorithm. The algorithm is implemented using a specific programming language and executed on a target computer machine, collecting actual statistics like running time and required space.

### **Factors in Algorithm Analysis**
- **Time Factors**: Measured by counting key operations such as comparisons in sorting algorithms.
- **Space Factors**Measured by counting the maximum memory space required by the algorithm.

Suppose X is an algorithm, and M is the size of the input data. The time and space are the main factors determining the efficiency of X. The algorithm's complexity gives the running time and storage space required in terms of the input data size.

- **Time Complexity:** The time complexity of an algorithm represents the amount of tine required by the algorithm to run into completion. The requirement can be defined  as a numerical function t(n) where t(n) can be measured as the number of steps provided each step consumes constant time. 
- **Space Complexity:** Space complexity of an algorithm represents the amount of memory space required by the algorithm in its life cycle. The space required by an algorithm is equal to the sum of its two components which are, 
	- Fixed part: It is a space required to store certain data and variables, that are independent of the size of the problem.  
	- Variable part: It is a space required  by variables who size depend on the size of the problem. 

---
## Asymptotic Analysis

The asymptotic analysis of an algorithm refers to defining the mathematical foundation to framing of its runtime performance. Using asymptotic analysis we can conclude  the:
- **Best Case**: Minimum time is required for program execution
- **Average Case:** Average time is required for program execution
- **Worse Case:** Maximum time is required for program execution

### Asymptotic Notations

Asymptotic notations are used to calculate the running time complexity of an algorithm it could be either of the following:
- O  - Big-O Notation
- Ω - Omega Notation
- Θ - Theta Notation

Big-O Notation: The notation O(n) is a formal way to express the **upper boundary** of an algorithms running time. It measures the worst case time complexity or the longest amount of time an algorithm can possibly take to complete. 

The notation Ω (n) is the formal way to express the **lower boundary** of an algorithm's running time. It measures the base case time complexity or the best amount of time an algorithm can possibly take to complete. 

Theta notation the notation Θ(n) is the formal way to express **both** the lower boundary and the upper boundary of an algorithm's running time.  

| Asymptotic Notation | Symbol      |
|---------------------|-------------|
| Constant            | O(1)        |
| Logarithmic         | O(log(n))   |
| Linear              | O(n)        |
| NLog(n)             | O(nlog(n))  |
| Quadratic           | O(n^2)      |
| Cubic               | O(n^3)      |
| Polynomial          | n^(O(1))    |
| Exponential         | 2^(O(n))    |



---
#### Greedy Algorithm
They are algorithms designed to achieve optimum solution for a give problem. In greedy algorithm approach decisions are made from a given solutions domain as being greedy the closest solution that seems to provide an optimum solution is chosen. Greedy algorithms tried to find a localized optimum solution which may eventually lead to globally optimized solution.

**Examples:**

- Travelling Salesman Problem
- Prims Minimal Spanning Tree algorithm
- Kruskal Minimal Spanning Tree Algorithm
- Dijkstra's Minimal Spanning Tree Algorithm
- Graph-Map Colouring
- Graph-Vertex Cover
- Knapsack Problem
- Job Scheduling Problem


---
04/12/23

## Divide & Conquer Approach
In divide and conquer approach the problem at hand is divided into smaller sub-problems and then each problem is solved independently. When we keep dividing sub-problems into even smaller sub-problems we may eventually reach a stage where no more division is possible. Those atomic (smallest possible sub-problems) are solved independently. The solutions of all the sub-problems is finally matched in order the obtain the solution of the original problem. 

### Steps in Divide and Conquer:
- **Divide/Break**: involves breaking the problem into smaller subproblems. Subproblems should represent a part of the original problem. This step generally takes a recursive approach. To divide the problem until no subproblem is further divisible, at this stage sub-problems become atomic in nature. But still represent some part of the actual problem. 
- **Conquer/Solve**: This steps receives a large number of sub-problems to be solved. Generally at this level the problems are considered solved on their own independently. 
- **Merge/Combine:** When the smaller sub-problems are solve this stage recursively combines them until they formulate a solution of the original problem. This algorithmic approach works recursively and conquer and merge steps works so close that they appear to be the same

### Examples  of divide & conquer algorithms
1. Merge sort
2. Quick sort
3. Binary Search
4. Strassen's Matric Multiplication
5. Closest Pair (Points)

---
## Dynamic Programming
It is similar to divide and conquer, in breaking down a problem into smaller and yet smaller possible solved problems. But unlike divide and conquer this sub-problems are not solved independently, rather results of this smaller sub-problems are remembered and used for similar or overlapping sub-problems.  

## Problems Solved using Dynamic Programming
1. Fibonacci number series
2. Knapsack Problem
3. Tower of Hanoi
4. All pair shortest path by floyd-warshall 
5. Shortest path by dijkstra

---
The way to write arithmetic expression is called a notation.  An arithmetic expression can be written in three different but equivalent notation, that is without changing the essence or output of an expression. 


These notations are named as how they use operator in expression. 
These notations are the 
- Infix:
- Prefix (Polish)
- Postfix(Reverse-polish)

Infix expressions are written like $a - b + c$ *where* 


The way to write arithmetic expression is known as a **notation**. An arithmetic expression can be written in three different but equivalent notations, i.e., without changing the essence or output of an expression. These notations are −

- Infix Notation
- Prefix (Polish) Notation
- Postfix (Reverse-Polish) Notation

These notations are named as how they use operator in expression. We shall learn the same here in this chapter.

## Infix Notation

We write expression in **infix** notation, e.g. a - b + c, where operators are used **in**-between operands. It is easy for us humans to read, write, and speak in infix notation but the same does not go well with computing devices. An algorithm to process infix notation could be difficult and costly in terms of time and space consumption.

## Prefix Notation

In this notation, operator is **prefix**ed to operands, i.e. operator is written ahead of operands. For example, **+ab**. This is equivalent to its infix notation **a + b**. Prefix notation is also known as **Polish Notation**.

## Postfix Notation

This notation style is known as **Reversed Polish Notation**. In this notation style, the operator is **postfix**ed to the operands i.e., the operator is written after the operands. For example, **ab+**. This is equivalent to its infix notation **a + b**.

The following table briefly tries to show the difference in all three notations −

|Sr.No.|Infix Notation|Prefix Notation|Postfix Notation|
|---|---|---|---|
|1|a + b|+ a b|a b +|
|2|(a + b) ∗ c|∗ + a b c|a b + c ∗|
|3|a ∗ (b + c)|∗ a + b c|a b c + ∗|
|4|a / b + c / d|+ / a b / c d|a b / c d / +|
|5|(a + b) ∗ (c + d)|∗ + a b + c d|a b + c d + ∗|
|6|((a + b) ∗ c) - d|- ∗ + a b c d|a b + c ∗ d -|

## Parsing Expressions

As we have discussed, it is not a very efficient way to design an algorithm or program to parse infix notations. Instead, these infix notations are first converted into either postfix or prefix notations and then computed.

To parse any arithmetic expression, we need to take care of operator precedence and associativity also.

### Precedence

When an operand is in between two different operators, which operator will take the operand first, is decided by the precedence of an operator over others. For example −

![Operator Precendence](https://www.tutorialspoint.com/data_structures_algorithms/images/operator_precedence.jpg)

As multiplication operation has precedence over addition, b * c will be evaluated first. A table of operator precedence is provided later.

---
Queue operation is an operation in abstract data structure that is similar to stacks , unlike stacks a queue open at both ends. One end is used to insert data (enqueue). And the other is used to remove data (dequeue). Queue operations follows first in first out methodology. That is, that data items stored first would be accessed first. 

Steps in Enqueue Operation:
1. Check if the queue is full 
2. If the queue is full produce <mark style="background: #ABF7F7A6;">overflow</mark> error and exit. 
3. If the queue is not full, use the rear point to the next empty space. 
4. Add the new data elements to the queue location, where the rear is pointing. 
5. Return success message

Basic steps in Dequeue Operation:
1. Check if the queue is empty
2. If the queue is empty produce <mark style="background: #ABF7F7A6;">underflow</mark> error and exit. 
3. If the queue is not empty access the data where the front is pointing
4. Use front pointer to point to the next available data element. 
5. Return success message.

---

A hash table, also known as a hash map, is a data structure that allows you to store and retrieve values based on a key. It is particularly efficient for lookups, insertions, and deletions of data. The basic idea behind a hash table is to use a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.

Here's a simple breakdown for beginners:

1. **Key-Value Pairs:**
   - A hash table is essentially a collection of key-value pairs. Each key is unique within the table, and it is associated with a specific value.
  
2. **Hash Function:**
   - The magic happens with a hash function. This function takes a key as input and produces a hash code, which is an integer. The hash code is used to determine the index or position in the array where the corresponding value should be stored or looked up.

3. **Array or Bucket Array:**
   - The hash table uses an array to store data. Each element in the array is called a bucket or slot. The number of buckets is usually determined at the creation of the hash table.

4. **Index Calculation:**
   - The hash code produced by the hash function is often larger than the number of buckets. To get a valid index, the hash code is typically reduced using the modulo operation with the number of buckets. This ensures that the index falls within the range of available buckets.

5. **Collision Handling:**
   - Since multiple keys might produce the same hash code (a collision), hash tables need a way to handle this situation. Common approaches include chaining and open addressing. Chaining involves each bucket holding a linked list of key-value pairs, while open addressing involves finding the next available slot in the array.

6. **Operations:**
   - Hash tables support basic operations such as insertion (adding a key-value pair), deletion (removing a key-value pair), and lookup (finding the value associated with a given key). These operations are typically performed in near-constant time if the hash function is well-designed and the load factor (ratio of items to buckets) is kept low.

In summary, a hash table provides an efficient way to organize and retrieve data using a key by leveraging the power of hash functions and arrays. It's a fundamental data structure used in various applications due to its speed and flexibility.


---
In-place sorting refers to the sorting algorithms that don't require additional memory space proportional to the input size. In other words, the sorting is performed directly on the input data structure without the need for allocating extra memory to store a copy of the data.

Here are a few key points about in-place sorting:

1. **Memory Efficiency:**
   - In-place sorting algorithms are more memory-efficient compared to algorithms that require additional memory proportional to the input size. This can be crucial when sorting large datasets where allocating additional memory may be impractical or too costly.

2. **Space Complexity:**
   - The space complexity of an in-place sorting algorithm is often denoted as O(1), indicating constant space usage, meaning that the amount of extra memory used by the algorithm is constant, regardless of the size of the input.

3. **Examples of In-Place Sorting Algorithms:**
   - Many well-known sorting algorithms are in-place. Examples include:
     - **Bubble Sort:** It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
     - **Insertion Sort:** It builds the final sorted array one item at a time, taking one element from the input data and inserting it into its correct position within the sorted part of the array.
     - **Selection Sort:** It sorts an array by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning.

4. **Trade-offs:**
   - While in-place sorting algorithms are advantageous in terms of memory usage, they may not be as efficient in terms of time complexity compared to some out-of-place algorithms. Some in-place sorting algorithms have a time complexity of O(n^2), making them less suitable for large datasets where more efficient algorithms like merge sort or quicksort (which are not strictly in-place) might be preferred.

5. **Stability:**
   - In-place sorting algorithms can be stable or unstable. A stable sorting algorithm maintains the relative order of equal elements in the sorted output, while an unstable sorting algorithm does not guarantee this.

It's important to consider the specific requirements of a given application or problem when choosing a sorting algorithm, taking into account factors such as time complexity, space complexity, and stability.
