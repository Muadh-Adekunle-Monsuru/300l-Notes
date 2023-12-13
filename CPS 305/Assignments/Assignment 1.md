
1. Mutex Lock 
	Mutex, short for "mutual exclusion," is a synchronization mechanism used in concurrent programming to ensure that only one thread or process can access a shared resource at a time. The idea is to prevent multiple threads from simultaneously executing critical sections of code that could lead to unpredictable behavior or data corruption.

	A mutex lock is a binary semaphore with two states: locked and unlocked. When a thread or process wants to access the shared resource, it must first acquire the mutex lock. If the lock is currently held by another thread, the requesting thread will be blocked until the lock becomes available. Once the thread has finished its critical section of code, it releases the mutex lock, allowing other threads to acquire it.

	Imagine a scenario where two threads are trying to update a shared counter. Without synchronization mechanisms like mutex locks, they might read the current value of the counter simultaneously, perform their calculations, and then write the results back. This could lead to a race condition where the final value of the counter is incorrect due to the interleaved execution of threads.

	Mutex locks help avoid such issues by ensuring that only one thread can access the critical section at a time. While it adds a level of synchronization, it's essential to use mutexes carefully to avoid potential deadlocks (where multiple threads are blocked because they are each waiting for the other to release a lock) and priority inversion (where a high-priority thread is blocked by a lower-priority thread holding a lock).
 
2. Read about conditions critical sections must satisfy:
	- **Mutual Exclusion:** Only one thread or process can access the critical section at a time.
	- **Progress:** If no thread or process is in the critical section, one of those waiting should be allowed in to prevent starvation.
	- **Bounded Waiting:** Limits the number of times a thread or process can request access to the critical section before being granted, preventing indefinite waiting.

4. Process synchronization techniques: Monitors
	Monitors are higher-level synchronization constructs that provide a way to encapsulate shared data and the procedures that operate on that data in a concurrent programming environment. A monitor consists of a set of procedures, along with shared data variables, all bundled together. The key feature of monitors is that they enforce mutual exclusion implicitly, making it easier to write safe concurrent programs.

	In a monitor, only one process or thread can be active within the monitor at any given time. If a process is executing a procedure inside the monitor, any other process attempting to enter the monitor will be blocked until the first process exits the monitor.

	Monitors typically provide two essential mechanisms for synchronization:

	1. **Mutex (Mutual Exclusion):** Monitors automatically enforce mutual exclusion, ensuring that only one process can execute a procedure within the monitor at a time.

	2. **Condition Variables:** These are used for signaling and waiting. Processes can signal each other to indicate that a certain condition has been met, and they can also wait for a condition to be true before proceeding. This helps in managing the order of execution and coordination between processes.

	The idea behind monitors is to simplify the process of writing concurrent programs by encapsulating synchronization mechanisms within the monitor itself. This reduces the likelihood of errors related to synchronization and makes the code more modular and easier to understand.

4. Deadlock, Starvation

	1. **Deadlock:**
		   Deadlock occurs when two or more processes are blocked indefinitely, each waiting for the other to release a resource.
	 
		 Imagine two processes, A and B. A holds a resource X and is waiting for resource Y, while B holds resource Y and is waiting for resource X. Both processes are stuck, and neither can proceed, leading to a deadlock.
	 
		Deadlocks typically occur when processes contend for multiple resources and each process holds one resource while waiting for another that is currently held by another process.
	
	2. **Starvation:**
	    Starvation happens when a process is unable to gain the required resources for a long time, preventing it from making progress.
	 
	    A scenario where there's a high-priority process and a low-priority process competing for a resource. If the resource is consistently allocated to the low-priority process, the high-priority process may starve, as it is never given the opportunity to proceed.
	 
	    Starvation often occurs when resource allocation policies favor certain processes over others, leading to some processes waiting indefinitely for the resources they need.
	 
	    Fairness in resource allocation is crucial to prevent starvation. Techniques like priority scheduling, where higher-priority processes are given precedence, can help ensure that all processes get a fair chance to execute.
