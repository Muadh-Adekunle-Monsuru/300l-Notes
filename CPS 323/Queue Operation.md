Queue operation is an operation in abstract data structure that is similar to stacks , unlike stacks a queue open at both ends. One end is used to insert data (enqueue). And the other is used to remove data (dequeue). Queue operations follows first in first out methodology. That is, that data items stored first would be accessed first. 

Steps in Enqueue Operation:
1. Check if the queue is full 
2. If the queue is full produce <mark style="background: #ABF7F7A6;">overflow</mark> error and exit. 
3. If the queue is not full, use the rear point to the next empty space. 
4. Add the new data elements to the queue location, where the rear is pointing. 
5. Return success message

Basic steps in Dequeue Operation:
1. Check if the queue is empty
2. If the queue is empty produce <mark style="background: #ABF7F7A6;">underflow</mark> error and exit. 
3. If the queue is not empty access the data where the front is pointing
4. Use front pointer to point to the next available data element. 
5. Return success message. 