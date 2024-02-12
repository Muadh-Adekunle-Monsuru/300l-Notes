### Question One
1) Explain each of the following:
		(i) Sorting: 
			- Sorting is a process of placing a list of elements from a collection of data in some  order. 
			- It is nothing but the storage of data in sorted order. Sorting can either be ascending or descending. 
			- It is meant to make searching easier
		(ii) Searching: 
			- Searching is the process of finding a given value in a list of values. 
			- It is the algorithmic process of finding a particular item in a collection of items
		(iii Algorithms: 
			 An algorithm is a step-by-step procedure or a set of rules that must be followed to perform a specific task or solve a particular problem. It's a finite sequence of well-defined, unambiguous instructions.
		(iv) Complexity of Algorithm:
			Complexity refers to the degree to which a system or component has a design or implementation that is difficult to understand and verify. The complexity of an algorithm is also referred to as the efficiency of the algorithm, often measured in terms of time and space.
		(v) Hash Table:
			A hash table is a data structure that allows efficient data retrieval. It uses a hash function to map keys to indices, enabling quick access to values associated with those keys. This can result in faster search, insertion, and deletion operations compared to other data structures.

2) Knowing that not all procedures can be called an algorithm. Explain the conditions that algorithm must satisfy.
	1. **Unambiguous:** Each step and its inputs/outputs should be clear and lead to only one meaning.
	2. **Input:** An algorithm must have one or more well-defined inputs.
	3. **Output:** An algorithm must have one or more well-defined outputs.
	4. **Finiteness:** An algorithm must terminate after a finite number of steps.
	5. **Feasibility:** An algorithm should be achievable with the available resources.
	6. **Independence:** An algorithm should provide step-by-step directions independent of any programming code.

3) What do you understand by each of the following concepts:
	(i) **Space complexity**: 
		Space complexity of an algorithm represents the amount of memory space required by the algorithm in its life cycle. The space required by an algorithm is equal to the sum of its two components which are, 
		- Fixed part: It is a space required to store certain data and variables, that are independent of the size of the problem.  
		- Variable part: It is a space required  by variables who size depend on the size of the problem. 
 
	(ii) **Time complexity:** 
		The time complexity of an algorithm represents the amount of tine required by the algorithm to run into completion. The requirement can be defined  as a numerical function t(n) where t(n) can be measured as the number of steps provided each step consumes constant time. 
	(iii) **In-place sorting:** 
		In-place sorting algorithms perform sorting without needing extra memory space for auxiliary data structures. The sorting is done directly on the input array without additional memory allocation.
### Question Two
1) *While defining the mathematical boundation/framing of the run-time performance of an algorithm. Discuss Asymptotic Notation  and the different types of Asymptotic Notations* 
	The asymptotic analysis of an algorithm refers to defining the mathematical foundation to framing of its runtime performance. Using asymptotic analysis we can conclude  the:
	- **Best Case**: Minimum time is required for program execution
	- **Average Case:** Average time is required for program execution
	- **Worse Case:** Maximum time is required for program execution
	Asymptotic notations are used to calculate the running time complexity of an algorithm it could be either of the following:
	- O  - Big-O Notation
	- Ω - Omega Notation
	- Θ - Theta Notation

1) Explain the operational concepts of the following With examples:
	 (i) Greedy Algorithm: 
		 In greedy algorithm approach decisions are made from a given solutions domain as being greedy the closest solution that seems to provide an optimum solution is chosen. Greedy algorithms tried to find a localized optimum solution which may eventually lead to globally optimized solution.
		**Examples:**
			- Travelling Salesman Problem
			- Graph-Vertex Cover
			- Knapsack Problem
			- Job Scheduling Problem
	 (ii) Divide and Conquer 
		 In divide and conquer approach the problem at hand is divided into smaller sub-problems and then each problem is solved independently. When we keep dividing sub-problems into even smaller sub-problems we may eventually reach a stage where no more division is possible. Those atomic (smallest possible sub-problems) are solved independently. The solutions of all the sub-problems is finally matched in order the obtain the solution of the original problem. 
		 **Examples:**
			1. Merge sort
			2. Quick sort
			3. Binary Search
			4. Strassen's Matric Multiplication
			5. Closest Pair (Points)

	 (iii) Dynamic Programming
		 It is similar to divide and conquer, in breaking down a problem into smaller and yet smaller possible solved problems. But unlike divide and conquer this sub-problems are not solved independently, rather results of this smaller sub-problems are remembered and used for similar or overlapping sub-problems.  
		**Examples**:
			1. Fibonacci number series
			2. Knapsack Problem
			3. Tower of Hanoi
			4. All pair shortest path by floyd-warshall 
			5. Shortest path by dijkstra 
### Question Three
1) Explain Bubble Sort:
	 Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.
2) Write short note on the following:
	(i) **Linear search**: 
		Linear search involves scanning through each element in a collection until the desired element is found. It is simple but may be inefficient for large datasets.
	(ii) **Binary Search:** 
		Binary search is an efficient search algorithm that works on sorted arrays. It repeatedly divides the search interval in half, comparing the target value to the middle element and eliminating half of the remaining elements.
	(iii) **<mark style="background: #FFF3A3A6;">**interpolation search**:</mark>** 
		Interpolation search is an improved version of binary search for uniformly distributed datasets. It estimates the position of the target value based on its value and the values at the ends of the interval.
1) Write out the step by step procedure tor Interpolation search
	1. Calculate the interpolation formula: `pos = low + [(value - arr[low]) * (high - low) / (arr[high] - arr[low])]`
	2. If `arr[pos] == value`, the element is found.
	3. If `arr[pos] < value`, repeat the search in the right sub-array.
	4. If `arr[pos] > value`, repeat the search in the left sub-array.
	5. Repeat until the element is found or the sub-array is empty.
### Question Four
1) Write short note on the following:
	(i) **Insertion sort**: 
		Insertion sort builds the sorted array one element at a time by repeatedly taking the next element and inserting it into its correct position in the sorted part of the array. 
	(ii) **Selection sort:** 
		Selection sort divides the array into a sorted and an unsorted region. It repeatedly selects the smallest (or largest) element from the unsorted region and swaps it with the first element of the unsorted region.
	(iii) **Merge sort**: 
		Merge sort is a divide-and-conquer algorithm that divides the array into two halves, sorts each half, and then merges the sorted halves.  
1) Write out the step by step procedure for Merge Sort: 
	1. **Divide:** Split the unsorted array into two halves.
	2. **Conquer:** Recursively sort each half.
	3. **Merge:** Merge the two sorted halves into a single sorted array.
2) Differentiate between Priori Analysis and Postrior Analysis
	- **Prior Analysis:** This is a theoretical analysis of an algorithm. Efficiency is measured assuming constant factors like processor speed have no effect on the implementation.
	- **Posterior Analysis:** An empirical analysis of an algorithm. The algorithm is implemented using a specific programming language and executed on a target computer machine, collecting actual statistics like running time and required space.
### Question Five
1) Compare and contrast Dynamic Algorithm with Greedy Algorithm
	- **Dynamic Algorithm:**
	    - Solves problems by breaking them into subproblems.
	    - Uses memory (e.g., tables or arrays) to store solutions to subproblems for reuse.
	    - Typically used for optimization problems.
	- **Greedy Algorithm:**
	    - Makes locally optimal choices at each step.
	    - Does not revisit or change choices made.
	    - May not always lead to a globally optimal solution.
2) Compare and contrast Dynamic Algorithm with Divide and Conquer Algorithm
	- **Dynamic Algorithm:**
	    - Solves problems by breaking them into overlapping subproblems.
	    - Stores solutions to subproblems for reuse.
	    - Often used for optimization problems.
	- **Divide and Conquer Algorithm:**
	    - Solves problems by breaking them into non-overlapping subproblems.
	    - Does not store solutions to subproblems for reuse.
	    - Typically used for problems with no overlapping subproblems.
	    
c) Using Binary Search, search for the location of value 45 and 17
15 17 22 26 30 35 38 45 47 50

| 15 | 17 | 22 | 26 | 30 | 35 | 38 | 45 | 47 | 50 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|  |  |  |  | middle element |  |  |  |  |  |
Searching for 45:

Compare 45 with the middle element (30), move to the right half.
Compare 45 with the middle element (45), found.
Searching for 17:

Compare 17 with the middle element (30), move to the left half.
Compare 17 with the middle element (22), move to the left half.
Compare 17 with the middle element (17), found.