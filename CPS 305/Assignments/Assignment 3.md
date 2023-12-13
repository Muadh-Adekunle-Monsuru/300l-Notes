**1. Modelling Deadlock: Give examples of situations where deadlock occur.  model the process holding a resource and another resource that is requesting it hence causing a deadlock.** 

Deadlock is a state in a computer system where two or more processes cannot proceed because each is waiting for the other to release a resource. I'll provide a simple example to illustrate a deadlock scenario involving two processes and two resources.

Let's consider two processes, P1 and P2, and two resources, R1 and R2.

```plaintext
Processes:     P1                    P2
Resources:  R1      R2          R1      R2
```

1. **Initial State:**
   - P1 holds R1 and is requesting R2.
   - P2 holds R2 and is requesting R1.

```plaintext
Processes:     P1                    P2
Resources:  R1*     R2*         R1*     R2*
```

2. **Step 1: P1 Acquires R1**
   - P1 has acquired R1.

```plaintext
Processes:     P1                    P2
Resources:  R1*     R2          R1*     R2*
```

3. **Step 2: P2 Acquires R2**
   - P2 has acquired R2.

```plaintext
Processes:     P1                    P2
Resources:  R1*     R2*         R1*     R2*
```

Now, both processes are holding one resource and waiting for the other one, creating a circular wait condition. P1 is waiting for R2, which is held by P2, and P2 is waiting for R1, which is held by P1. This situation leads to a deadlock since neither process can proceed.


**2. Read and understand banker's algorithm which is used for deadlock avoidance**
The Banker's Algorithm is a deadlock avoidance algorithm used in operating systems to prevent the occurrence of deadlocks. It was developed by Edsger Dijkstra. The algorithm is based on the idea of simulating the allocation of resources and checking whether the system would enter into a safe state.

Here are the key components and steps of the Banker's Algorithm:

### Components:

1. **Available Resources (A):**
   - The total number of resources of each type that are available in the system.

2. **Maximum Demand Matrix (Max):**
   - A matrix that defines the maximum demand of each process. It indicates the maximum number of resources of each type that a process may need.

3. **Allocation Matrix (Allocation):**
   - A matrix that represents the number of resources of each type currently allocated to each process.

4. **Need Matrix (Need):**
   - A matrix that represents the remaining resource needs of each process. It is calculated as the difference between the maximum demand and the resources currently allocated.

### Steps:

1. **Initialize:**
   - Initialize the Available Resources (A), Maximum Demand Matrix (Max), Allocation Matrix (Allocation), and Need Matrix (Need).

2. **Request Resources:**
   - When a process requests resources, the system checks if the request can be granted without leading to an unsafe state.

3. **Check if Request is Safe:**
   - If the request can be granted, the system temporarily allocates the resources and checks if the resulting state is safe. If the state is safe, the resources are allocated; otherwise, the request is denied.

4. **Release Resources:**
   - When a process releases resources, the system updates the Available Resources and the Allocation Matrix.

### Safety Algorithm:

The safety algorithm is used to check whether a system is in a safe state or not. 
If all processes are marked as finished, the system is in a safe state. Otherwise, it is unsafe.

If the system is in a safe state, the requested resources are allocated; otherwise, the request is denied to avoid a potential deadlock.

The Banker's Algorithm ensures that the system never enters an unsafe state, and it avoids deadlock by carefully managing resource allocations.

**3. Algorithm for deadlock avoidance and deadlock recovery** 

1. **Algorithms for Deadlock Avoidance:**

   a. **Banker's Algorithm:**
      - The Banker's algorithm is a deadlock avoidance algorithm that was developed by Edsger Dijkstra. It is used in a multi-process system where each process must declare the maximum number of resources it may need, as well as the maximum number of resources the system can allocate.
      - The algorithm checks whether allocating a resource to a process would leave the system in a safe state (i.e., there is a sequence of allocations and deallocations that can be performed without leading to a deadlock).

   b. **Wait-Die and Wound-Wait Schemes:**
      - These are deadlock avoidance techniques used in database systems with transactions.
      - **Wait-Die:**
         - Older transactions wait for younger transactions to release locks. If a younger transaction requests a lock held by an older transaction, it is forced to wait (or die if the older transaction has committed).
      - **Wound-Wait:**
         - Older transactions wound (force to abort) younger transactions if they request a lock held by an older transaction.

   c. **Resource Allocation Graph (RAG):**
      - The Resource Allocation Graph is a graphical representation used for deadlock avoidance in resource allocation systems. Nodes represent processes and resources, and edges represent resource requests and allocations.

2. **Algorithms for Deadlock Recovery:**

   a. **Process Termination:**
      - One simple way to recover from a deadlock is to terminate one or more processes. The freed resources can then be allocated to the remaining processes.
      - The challenge is to select a process for termination in a way that minimizes the overall impact on the system.

   b. **Resource Preemption:**
      - This involves preempting resources from one or more processes to resolve a deadlock.
      - The system may forcibly take back resources from a process and allocate them to another to break the circular wait condition.
      - Care must be taken to ensure that the preempted process can recover gracefully.

   c. **Rollback and Compensation:**
      - In the context of database systems, transactions that are part of a deadlock can be rolled back to a certain checkpoint, and their effects compensated.
      - This involves undoing the changes made by the transaction up to the last consistent state.

   d. **Killing Deadlock Resolution (KDR):**
      - This approach involves killing one or more processes involved in the deadlock.
      - The selection of processes to be killed should be done carefully to minimize the impact on the system.
