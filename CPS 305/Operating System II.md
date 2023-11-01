1/11/2023
## Process Synchronization

It is the coordination of execution of multiple processes in a multiprocessing system to ensure that they access shared resources in a controlled and predictable manner. The aim of process synchronization is to resolve issues that are associated with concurrent execution of program. Such as race condition, dead lock e.t.c. 

Process synchronization is also to ensure multiple processes access shared resources without interfering with each other and to prevent possibility of inconsistent data due to concurrent access. 
To achieve this, various synchronization techniques such as:
- semaphores, 
- monitor 
- critical sections 

Process synchronization is an important aspect of modern operating system and it plays a crucial role in ensuring the correct and efficient functioning of multiprocessing systems. 

On the bases of synchronization processes are categorized, as:
- Independent Processes: Means the execution of one process does not affect the execution of other process
- Cooperative Processes: Means the process can affect or be affected by other processes execution in the system. Hence process synchronization problems is prone to occur.

## Issues with PS

- Race Condition
	 this situation occurs when several threads or process access and manipulate the same data concurrently and where the outcome of the execution depends on the particular order in which the access takes place.
	  For all the processes to ascertain their outputs, they must create a condition called race condition. It is situation that may occur inside a critical section. This happens when the result of multiple process or threads that executes in a critical section differ according to the order in which they execute.
	 E.g Processes P1 and P2 which share a common variable (shared =10) both processes are present in queue and waiting for their turn to be executed. Suppose process P1 first come under execution and the CPU store a common variable between them in a local variable (x=10) and increment it by 1 (x=11) after then when the processor read line sleep then P2 starts executing and store the shared variable in its own local variable (y=10) the the variable is decreased by 1 (y=9) then P2 is put to bed. Then P1 wakes back up and is dispatched by the processor. When P1 under execution P1 now stores its own local variable in the shared variable (shared =11). P2 also now moves its local variable into the shared variable. Shared now becomes (shared =9).
	 
Critical section: All solution in the critical section must satisfy  mutual exclusion, progress, bounded waiting

**- Benefits of process synchronization include:**
    - Avoiding race conditions
    - prevent inconsistent data 
    - Improving performance and efficiency
    - Reducing deadlock and starvation
    - Support efficient and effective use of shared resources

Disadvantage
- Add more overhead to system
- Leads to permanent degradation of the system
- Increases complexity of the system 
- It can cause deadlock if not implemented properly 