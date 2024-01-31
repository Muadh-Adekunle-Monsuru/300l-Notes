## Searching
- Searching is the process of finding a given value in a list of values. 
- It is the algorithmic process of finding a particular item in a collection of items

### Linear Search:
**Definition**: 
- It starts at the beginning of the list and checks every element of the list.
- i.e. It sequentially checks each element of the list until a match is found or the whole list has been searched. So it is also called <mark style="background: #FFB8EBA6;">sequential search</mark>. 

**Algorithm:** 
- Step 1: Read elements in array 
- Step 2: Read the element to search 
- Step 3: Compare the element to search and each element in array sequentially 
- Step 4: If match is found then the search success 
- Step 5: If match is not found till the end then the search unsuccessful

**Example**:
- Let the elements are: 10,6,3,8,9,12,14 
- The search element is : 12 
- Now it compare 12 with each and every element. 
- The 12 is available in 6th place. 
- So the searching process is success and element is found 

### Binary Search
**Definition:**
- It is the most popular search algorithm. It is efficient. 
- Binary search sorts the records either in ascending or descending order to gain better performance than linear search
- Suppose the record is in ascending order. When searching take the middle record/element, if the element to be searched is greater than the middle element then the element must be located in the second part, else it is in the first half. 

Algorithm:
- Step 1: Read sorted elements in array
- Step 2: Read the element to search
- Step 3: Compare the element to search and middle element in the array. If match is found the search is a success. 
- Step 4: If match is not found check the search element with the middle element. If the search element is greater than the middle element then search on the right side of the middle element otherwise search on the left
- This process is repeated for all elements in array. If no match is found upto the end then the search is not successful. 

Example:

- Let the elements in ascending order are 2 4 6 8 10 12 15 
- Let the element to search 12 
- For searching it compare first middle element. 2 4 6 8 10 12 15 
- The middle element is 8 and is not equal to 12. Since 12 is greater than 8 search on right side part of 8. 12 is equal to right side part middle. So element is found



### Fibonacci Search
- Uses Fibonacci numbers(0,1,1,2,3,5,8..) to search an element in a sorted array. 

![[Pasted image 20240128145318.png]]

---
# Sorting
- Sorting is a process of placing a list of elements from a collection of data in some  order. 
- It is nothing but the storage of data in sorted order. Sorting can either be ascending or descending. 
- It is meant to make searching easier

### Insertion Sort:
- In this technique first elements are sorted in an array
- The process of sorting starts with second element

Algorithm:
- Step 1: Check second element of the array with elements before it and insert it in proper position. 
- Step 2: Check the third element of the array with elements before it and inserting it in the proper position. 
- Step 3: Repeat this till all elements are checked
- Stop

Example:
 - Let us consider the elements: 12, 3, 1, 5, 8 1.
	 1. Checking second element of array with element before it and inserting it in proper position. In this case 3 is inserted in position of 12 ![[Pasted image 20240128135253.png]]
	 2.  Checking third element of array with elements before it and inserting it in proper position. In this case 1 is inserted in position of 3![[Pasted image 20240128135304.png]]
	 3.  Checking fourth element of array with elements before it and inserting it in proper position. In this case 5 is inserted in position of 12![[Pasted image 20240128135334.png]]
	 4. Checking fifth element of array with elements before it and inserting it in proper position. In this case 8 is inserted in position of 12![[Pasted image 20240128135343.png]]
	 5. Sorted array in ascending order. ![[Pasted image 20240128135351.png]]


### Selection Sort
- Selection sort is an algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list. 

**Algorithm**: 
- Step 1 − Set min to the first location.
- Step 2 − Search the minimum element in the array. 
- Step 3 – swap the first location with the minimum value in the array. 
- Step 4 – assign the second element as min. Step 5 − Repeat the process until we get a sorted array.

**Example**:

| 20 | 40 | 32 | 10 | 9 | <mark style="background: #FFB86CA6;">2</mark> |  |  |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 2 | 40 | 32 | 10 | <mark style="background: #FFB86CA6;">9</mark> | 20 |  |  |
| 2 | 9 | 32 | <mark style="background: #FFB86CA6;">10</mark> | 40 | 20 |  |  |
| 2 | 9 | 10 | 32 | 40 | <mark style="background: #FFB86CA6;">20</mark> |  |  |
| 2 | 9 | 10 | 20 | 40 | <mark style="background: #FFB86CA6;">32</mark> |  |  |
| 2 | 9 | 10 | 20 | 32 | 40 |  |  |

### Exchange Sort:

- The exchange sort is almost similar as the bubble sort. The exchange sort compares each element of an array and swap those elements that are not in their proper position, just like a bubble sort does. The only difference between the two sorting algorithms is the manner in which they compare the elements.

### Bubble Sort:

- Bubble Sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order. \

**Algorithm:**
- Step 1: The first element is compared with second and exchange element if first one is greater than second 
- Step 2: Similarly second element is compared with third and exchange element if second one is greater than third 
- Step 3: Repeat this so that at the end the largest value is in last place 
- Step 4: Likewise sorting is repeated for all elements
![[Pasted image 20240128141400.png]]


## Quick Sort:
 - Quick Sort is also one of the exchange sort. 
 - In a quick sort we take pivot element, then we place all the smaller elements are on one side of pivot, and greater elements are on other side of pivot. 
 - After partitioning we have pivot in the final position. After repeatedly partitioning, we get the sorted elements.

**Algorithm**:
- Step 1: Let the first element taken as pivot
- Step 2: Find lesser of pivot say i and greater of pivot say j.
- Step 3: If i is less than j then i and j elements are swapped. Repeat step 2
- Step 4: Repeat step 3 until i > j Now swap j and pivot 
- Step 5: Now the pivot element is final position. Repeat the above procedure for left and right side of pivot elements until all elements are sorted 
- Step 6: Stop

![[Pasted image 20240128143233.png]]
![[Pasted image 20240128143238.png]]
![[Pasted image 20240128143245.png]]
### Merge Sort:
- It divides input array into two halves, calls itself for the two halves and then sorted and merged that two halves. 


**Algorithm**:
- Step 1 − If it is only one element in the list then it is already sorted.
- Step 2 − Divide the list recursively into two halves till the size becomes one. 
- Step 3 − Once the size becomes 1, the merge process comes into action and starts merging with sorted array till the complete array is merged

![[Pasted image 20240128142720.png]]