# Types of Data Structure
### Operations on Stack:
1. Initialize: Setting up or creating an empty stack.
		`Initialize(stackName)`: `Initialize(P)`
		or
		`Initialize(stackName,stackSize)`
		`Initialize(P,5)` once the maximum is reached no new elements can be added
1. Push: Adding an element to the top of the stack.
		`push(newElement,stackName)`
1. Pop: Removing the top element from the stack.
		`pop(stackName)`
1. isEmpty: Checking if the stack is empty. Return True or False
		`isEmpty(stackName)`
1. IsFull: Checking if the stack is full (reached its maximum capacity). Return True or False, Can only work on fixed size stacks 
		`isFull(stackName)`
#### Example:

| Action | Content of Stack after operation | Return-Value |
| ---- | ---- | ---- |
| Initialise(S) | empty |  |
| push(A,S) | A |  |
| push(B,S) | A, B |  |
| push(C,S) | A, B, C |  |
| pop(S) | A, B | C |
| push(D,S) | A, B, D |  |
| isEmpty(S) | False |  |
| pop(S) | A, B | D |

#### Practice
1. Initialize a stack P
2. Initialize a stack S of size 5
3. Perform the following operations
`push(M, S), push(N, S), pop(S), push(O, S), isEmpty(P), push(A, S), push(B, S), push(C, P), push(D, S), push(E, P), push(A, P), pop(S), push(B, S), pop(P), push(C, S), isFull(S), pop(S)`

### Operations on Queue
1. Initilize
		`Initialize(queueName)`
1. Add
		`Add(value,queueName)`
2. Remove
		`Initialize(value,queueNameS)`



Express this equation inform of an expression tree $-b+(n^2-4ac)^{1/2}$ 