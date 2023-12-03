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

---
29/11/23
## Deadlock
1. **Deadlock:**
A set of processes are said to be in a deadlock state if every process in the set is waiting for an event that can only be caused by some other processes in the same set. For every resource a process will make request resuse and release the resource. 

## Conditions for deadlock to occur:
Condition for a deadlock to occur, if and only if the following four conditions hold simultaneously in a system:
- **Mutual Exclusion:** Only one process at a time can use a resource
- **Hold and Wait :** A processing holding at least one resource is waiting to acquire another resource held by any other resources
- **No preemption:** A resource can be released voluntarily by processes that are holding them.
- **Circular Waiting:** Their exists a set of waiting processes, {P0,P1,P2 .... Pn} such that P0 is waiting for a resource held by P1 and P1 is waiting for a resource held by P2 ..... till Pn-1 is waiting for a resource held by Pn and Pn is waiting for resources held by P0

### Situations deadlock can occur
- Database
- Dedicated device allocation
- Multiple device allocation
- Spooling
- Network
- Shared Disk
- Making request for file

#### Ways of Handling a deadlock
1. **Deadlock Prevention:** Ensure system never enters deadlock, by not allowing any of the four conditions to occur.
	1. **Mutual exclusion**: Must hold for non-sharable resources.
	2. **Hold and wait**: Protocol must ensure hold and wait never occurs, each process must request for all the resources needed to execute and the resources is gotten before starting execution.  
	3. **No Preemption**: If a process that is holding some resource and requested a resource and that request is not granted then the process must release that resource it is currently holding. 
	4. **Circular Waiting**: Rule here is to ensure that circular waiting does not occur by imposing linear ordering of resources, and each process can only request in an increasing order of priority. The process must release previously held resources when new resource is requested. 

2. **Deadlock Avoidance:** Can recover from deadlock if system enters the deadlock
3. **Deadlock detection and recovery:** System can ignore the problem and prevent deadlock occurrence. Information about resource allocation to processes must be kept and known to the system. Information about outstanding resources that has not been allocated must also be kept. An algorithm is needed which detects when the system has entered a deadlock state. The algorithm then redirects the resources allocated so that the resources are in a safe state. 




   Deadlock: A processing holding at least one resource is waiting to acquire another resource held by any other resources occurs when two or more processes are blocked indefinitely, each waiting for the other to release a resource.
	 
 Imagine two processes, A and B. A holds a resource X and is waiting for resource Y, while B holds resource Y and is waiting for resource X. Both processes are stuck, and neither can proceed, leading to a deadlock.
	 
Deadlocks typically occur when processes contend for multiple resources and each process holds one resource while waiting for another that is currently held by another process.
	