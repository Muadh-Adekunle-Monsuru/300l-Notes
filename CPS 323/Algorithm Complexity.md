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

The asymptotic analysis of an algorithm refers to defining the mathematical boundary to framing of its runtime performance. Using asymptotic analysis we can conclude  the:
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
6. project scheduling