Infix and postfix are two notations used to represent mathematical expressions.

1. **Infix Notation:**
   - In infix notation, operators are written between their operands. This is the standard way mathematical expressions are usually written.
   - Examples of infix expressions:
     - \(2 + 3\)
     - \(a \times (b + c)\)
     - \(x^2 + 3x - 5\)

2. **Postfix Notation (also known as Reverse Polish Notation - RPN):**
   - In postfix notation, the operators are written after their operands. There are no parentheses needed in postfix notation as the order of operations is determined solely by the position of the operators.
   - To convert an infix expression to postfix, you can use a stack data structure and follow the rules of the shunting yard algorithm.
   - Examples of postfix expressions:
     - \(2\ 3 +\) (equivalent to \(2 + 3\))
     - $(a\ b\ c + \times) \text{is equivalent to} (a \times (b + c)))$
     - $(x\ 2\ ^\ 3\ x\ 3\ \times\ -\ 5\ -) (\text{equivalent to} (x^2 + 3x - 5))$

Here's a brief example of how the conversion from infix to postfix works:

**Infix:** \(a + b \times c\)

**Postfix:** \(a\ b\ c \times +\)

In the postfix expression, the multiplication is performed first because it comes after its operands \(b\) and \(c\), and then the addition is performed with the result and the operand \(a\).



In computer science and mathematics, a prefix expression is a mathematical notation in which every operator follows all of its operands. It is also known as Polish notation, named after the mathematician Jan Łukasiewicz, who introduced this notation.

In a prefix expression:

1. The operator comes before its operands.
2. There are no parentheses needed to indicate the order of operations because the position of the operator determines the order.

For example, the infix expression \(2 + 3\) would be written in prefix notation as \(+ 2 3\).

Here's an example using the infix expression \(5 \times (3 + 2) + 6 \times 4\):

**Infix:** \(5 \times (3 + 2) + 6 \times 4\)

**Prefix:** \(+ \times 5 + 3 2 \times 6 4\)

In the prefix expression, the multiplication is performed first because it comes right after its operands \(5\) and \(+\) (the result of \(3 + 2\)). Then, the two additions are performed, one with the result of the first multiplication and the other with the result of \(6 \times 4\).

Prefix notation is commonly used in computer science, especially in the context of expression evaluation algorithms. It's often used with stack-based algorithms for parsing and evaluating mathematical expressions.



---
#### Example 1
```
5 * 3 + 2 +6 * 4
```
1. Multiply 5 and 3; storing the result in A
2. Adding 2 to A; saving the result in A
3. Multiply 6 by 4; storing the result in B
4. Add B to A; storing the result in A

### Postfix [[Infix Vs PostFix vs Prefix]]

1. Multiply 5 and 3; storing the result in A
   - $(A = 5 \times 3)$
   - Postfix: $(5\ 3 \times)$

2. Add 2 to A; saving the result in A
   - \(A = A + 2\)
   - Postfix: \(5\ 3 \times\ 2 +\)

3. Multiply 6 by 4; storing the result in B
   - \(B = 6 \times 4\)
   - Postfix: \(5\ 3 \times\ 2 +\ 6\ 4 \times\)

4. Add B to A; storing the result in A
   - \(A = A + B\)
   - **Postfix:** $(5\ 3 \times\ 2 +\ 6\ 4 \times +)$
---
#### Example 2
Convert the infix 
```
a + (b * c)
```
answer
```
a b c * + 
```
---
```
a*b + c*d
```
answer
```
a b * c d * +
```

