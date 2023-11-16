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

The asymptotic analysis of an algorithm refers to defining the mathematical boundation to framing of its runtime performance. Using asymptotic analysis we can conclude  the:
- Best Case
- Average Case
- Worse Case
scenario of an algorithm. 

