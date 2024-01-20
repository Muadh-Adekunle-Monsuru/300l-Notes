The way to write arithmetic expression is called a notation.  An arithmetic expression can be written in three different but equivalent notation, that is without changing the essence or output of an expression. 


These notations are named as how they use operator in expression. 
These notations are the 
- Infix:
- Prefix (Polish)
- Postfix(Reverse-polish)

Infix expressions are written like $a - b + c$ *where* 


The way to write arithmetic expression is known as a **notation**. An arithmetic expression can be written in three different but equivalent notations, i.e., without changing the essence or output of an expression. These notations are −

- Infix Notation
- Prefix (Polish) Notation
- Postfix (Reverse-Polish) Notation

These notations are named as how they use operator in expression. We shall learn the same here in this chapter.

## Infix Notation

We write expression in **infix** notation, e.g. a - b + c, where operators are used **in**-between operands. It is easy for us humans to read, write, and speak in infix notation but the same does not go well with computing devices. An algorithm to process infix notation could be difficult and costly in terms of time and space consumption.

## Prefix Notation

In this notation, operator is **prefix**ed to operands, i.e. operator is written ahead of operands. For example, **+ab**. This is equivalent to its infix notation **a + b**. Prefix notation is also known as **Polish Notation**.

## Postfix Notation

This notation style is known as **Reversed Polish Notation**. In this notation style, the operator is **postfix**ed to the operands i.e., the operator is written after the operands. For example, **ab+**. This is equivalent to its infix notation **a + b**.

The following table briefly tries to show the difference in all three notations −

|Sr.No.|Infix Notation|Prefix Notation|Postfix Notation|
|---|---|---|---|
|1|a + b|+ a b|a b +|
|2|(a + b) ∗ c|∗ + a b c|a b + c ∗|
|3|a ∗ (b + c)|∗ a + b c|a b c + ∗|
|4|a / b + c / d|+ / a b / c d|a b / c d / +|
|5|(a + b) ∗ (c + d)|∗ + a b + c d|a b + c d + ∗|
|6|((a + b) ∗ c) - d|- ∗ + a b c d|a b + c ∗ d -|

## Parsing Expressions

As we have discussed, it is not a very efficient way to design an algorithm or program to parse infix notations. Instead, these infix notations are first converted into either postfix or prefix notations and then computed.

To parse any arithmetic expression, we need to take care of operator precedence and associativity also.

### Precedence

When an operand is in between two different operators, which operator will take the operand first, is decided by the precedence of an operator over others. For example −

![Operator Precendence](https://www.tutorialspoint.com/data_structures_algorithms/images/operator_precedence.jpg)

As multiplication operation has precedence over addition, b * c will be evaluated first. A table of operator precedence is provided later.