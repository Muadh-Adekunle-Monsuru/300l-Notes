8/11/23
### Semaphores
Semaphore is a signaling mechanism  and a thread or a process that is waiting on a semaphore can be signaled by another thread or process. A semaphore uses two atomic operations, which is wait and signal for process synchronization. It is an integer variable which can be accessed only through the two operations <mark style="background: #FFB8EBA6;">wait</mark> and <mark style="background: #FFB8EBA6;">signal</mark>

**Wait Operation:**

- When a process or thread wants to access a shared resource, it performs a "wait" operation on the semaphore.
- If the semaphore is in the unlocked state (0), the process is allowed to proceed, and the semaphore is then set to the locked state (1).
- If the semaphore is in the locked state (1), the process is made to wait until the semaphore becomes unlocked.

**Signal Operation:**

- When a process or thread is done using the shared resource, it performs a "signal" operation on the semaphore.
- This operation releases the resource and sets the semaphore back to the unlocked state (0).
- If there are other processes or threads waiting for the resource, one of them can proceed.

Semaphores can be classified into two main types:
1. **Binary Semaphore** 
2. **Counting Semaphore** 

	- **Binary Semaphore:** can only be either 0 or 1, they are also know as <mark style="background: #FFB86CA6;">mutex lock</mark> as the lock can provide mutual exclusion. All the process can share the same mutex semaphore initialized to one then other process has to wait until the lock becomes 0. New process that enters then changes the mutex semaphore back to 1 and starts its critical section when the critical section is completed, it can reset the value back to 0 and some other processes can enter the critical section. 


	- **Counting Semaphore:** can have any value and is not restricted to a certain domain. This value can be used to control access to resources that has a limitation on the number of simultaneous accesses. The semaphore can be initialized to the number of instances of the resources. Whenever a process wants the use the resources it checks if the number of remaining instances is more than zero.  Then the process can enter the critical section and decrease the number of the counting semaphore by one. After the process is over with the use of the instance of the resources, it can then leave the critical section by adding 1 to the number of available instance of resources.  


### Advantages of Semaphores:
- Ensures mutual exclusion which ensures no race condition
- Avoids inconsistency of data. 
- Prevent deadlock and starvation
- Allows efficient and effective management of resources. 

### Disadvantages of semaphores:
- If semaphore is not well managed it can lead to deadlock
- Overuse of semaphore can lead to a complex or hard to maintain code
- Overhead on systems
- Can be difficult to debug if synchronization issues occur
- It is not suitable for all synchronization problems (i.e more than one)

