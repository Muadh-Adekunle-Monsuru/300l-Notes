27/11/23
### Monsuru Muadh Adekunle 
### FUO/22/0353


1. **Show that, if the wait() and signal() semaphore operations are not executed atomically, then mutual
exclusion may be violated.**
Defining the terms:
- Wait(): Operation that is performed on a semaphore which changes it from an unlocked state to a locked state
- Signal(): Operation that is performed on a semaphore which changes it from a locked state to an unlocked state
- Atomic Process: A process that executes without interruption of any other process 

Example: 
- Suppose that two processes, P1 and P2, share a critical section protected by a binary semaphore S, initialized to 1.
- Suppose also that P1 executes wait(S) and enters the critical section, 
- while P2 is waiting for S to become available. 
- Now, if the signal(S) operation of P1 is not atomic, then it may be interrupted by a context switch before it increments the value of S.
- In that case, P2 may execute wait(S) and find that S is still 0, so it will also enter the critical section, violating mutual exclusion. 
- Therefore, the wait() and signal() operations must be executed atomically to ensure mutual exclusion.

In other words:
- P1 executes wait(S), which decrements S to 0 and allows P1 to enter the critical section.
- Before P1 finishes the critical section, P2 also executes wait(S). However, since the operation is not atomic, P2 does not check the value of S before decrementing it. Therefore, S becomes -1 and P2 also enters the critical section.
- Now, both P1 and P2 are in the critical section at the same time, which violates mutual exclusion.
- When P1 exits the critical section, it executes signal(S), which increments S to 0. Similarly, when P2 exits the critical section, it also executes signal(S), which increments S to 1. This means that the next process that executes wait(S) will be able to enter the critical section without waiting, even if another process is already in it.



2.  **Illustrate how a binary semaphore can be used to implement mutual exclusion among n processes.**

A binary semaphore is a type of semaphore that can only have two values: 0 or 1. It can be used to implement mutual exclusion among n processes by ensuring that only one process can enter a critical section at a time. 

To use a binary semaphore for mutual exclusion, we need to follow these steps:

- Initialize the semaphore to 1, indicating that the resource is available.
- Before entering the critical section, each process must perform a wait (or P) operation on the semaphore. This operation checks if the semaphore value is 1, and if so, decrements it to 0 and allows the process to proceed. Otherwise, if the semaphore value is 0, the process is blocked until the semaphore value becomes 1 again.
- After exiting the critical section, each process must perform a signal (or V) operation on the semaphore. This operation increments the semaphore value to 1 and wakes up one of the blocked processes, if any.


By using a binary semaphore, we can ensure that only one process can access the shared resource at a time, and thus prevent any race conditions or data inconsistency.


---

3.  **What is the meaning of the term busy waiting? What other kinds of waiting are there in an operating
system? Can busy waiting be avoided altogether? Give reasons for your answer.**

The term busy waiting means a process synchronization technique in which a process or a thread repeatedly checks for a condition to be satisfied before proceeding with its execution. For example, a process may wait for a lock or a resource to be available by constantly testing its value in a loop.

Other kinds of waiting in an operating system are:

- **Sleeping or blocked waiting**: This is when a process or a thread waits for a condition to be satisfied without consuming the processor. The process or thread is put into an inactive or suspended state until it is awakened by an event, such as a signal, a timer, or an I/O completion¹².
- **Yielding or cooperative waiting**: This is when a process or a thread voluntarily gives up the processor to allow other processes or threads to run. The process or thread may resume its execution later when the scheduler decides to allocate the processor to it again².

Busy waiting can be avoided altogether by using system calls or library functions that block the process or thread on an event, such as lock acquisition, timer changes, I/O availability, or signals. This way, the processor can be used for other tasks instead of wasting cycles on checking a condition that may not change for a long time. However, busy waiting may still be useful in some situations, such as:

- When the expected waiting time is very short and the overhead of context switching is high. In this case, busy waiting may be more efficient than blocking and resuming the process or thread.
- When the process or thread needs to respond to an event as quickly as possible and cannot afford to miss it. In this case, busy waiting may provide lower latency and higher responsiveness than blocking and waiting for an interrupt.
- When the operating system does not support blocking or signaling mechanisms, or when the process or thread is running on a single-processor system without preemption. In this case, busy waiting may be the only option to synchronize with other processes or threads.

