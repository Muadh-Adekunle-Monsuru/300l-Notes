Advantages of Variable Sized Partitioning
- Flexible
- Reduces memory wastage
- Reduces internal fragmentation
Disadvantage of variable sized partitioning
- Required overhead of maintaining memory table
- Increase in external fragmentation
- Complex to execute

Advantages of logical and physical address separation
- Security: Logical address provides a level of abstraction that enhances system security by restricting direct access to physical memory
- Flexibility: Logical address allows the operating system to use different memory management techniques, such as paging and segmentation, without affecting the program's view. 

Advantages of process synchronization:
- Reduces starvation and deadlock
- Reduces inconsistent data
- Reduces race condition
- increases system efficency 

Pros of Paging:
- memory allocation is easier
- No external fragmenation in the physical memory 
- clear separation between user and system view of memory usage

Cons of Paging:
- OS must keep page table per process
- Internal fragmentation could exists
- additional overhead of context switching