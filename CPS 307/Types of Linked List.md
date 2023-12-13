Linked lists are data structures that consist of a sequence of nodes, where each node contains data and a reference (or link) to the next node in the sequence. 
1. Singly Linked List:

   In a singly linked list, each node contains data and a reference to the next node in the sequence. It forms a linear chain where the last node points to null, indicating the end of the list.

   Illustration:
   ```
   1 -> 2 -> 3 -> 4 -> 5 -> NULL
   ```

2. Doubly Linked List:

   A doubly linked list is similar to a singly linked list, but each node has two references: one to the next node and one to the previous node. This allows for easy traversal in both directions.

   Illustration:
   ```
   NULL <- 1 <-> 2 <-> 3 <-> 4 <-> 5 -> NULL
   ```

3. Circular Linked List:

   In a circular linked list, the last node points back to the first node, forming a closed loop. This type of list can be useful for applications like round-robin scheduling.

   Illustration:
   ```
   1 -> 2 -> 3 -> 4 -> 5
   ^                   |
   |-------------------|
   ```

4. Singly Linked List with a Tail Pointer:

   This is a variation of a singly linked list where an additional reference points to the last node (the tail). It makes appending to the end of the list more efficient.

   Illustration:
   ```
   1 -> 2 -> 3 -> 4 -> 5
   ^                   |
   |-------------------|
   ```

5. Doubly Linked List with a Tail Pointer:

   Similar to a doubly linked list, this type has a tail pointer to the last node for efficient append operations at the end.

   Illustration:
   ```
   NULL <- 1 <-> 2 <-> 3 <-> 4 <-> 5
   |                              |
   |------------------------------|
   ```

6. Skip List:

   A skip list is a data structure that combines multiple linked lists, allowing for faster search operations. It has multiple levels of linked lists, with each level containing a subset of elements.

   Illustration (Simplified):
   ```
   Level 3:   3
   Level 2:   1 ----> 3
   Level 1:   1 ----> 2 ----> 3
   ```

7. Self-adjusting List:

   A self-adjusting list is a type of linked list where frequently accessed elements are moved to the front of the list to improve access times.

   Illustration:
   ```
   Most Recently Accessed <--> ... <--> Least Recently Accessed
   ```

These are some common types of linked lists. Each has its own advantages and use cases, depending on the specific requirements of the application.