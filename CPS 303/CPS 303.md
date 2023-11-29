VB.NET is an <mark style="background: #ADCCFFA6;">object-oriented </mark>language implemented on the .NET Framework. 

VB.NET evolved from old basic but it is not backward compatible. 
##### Why is VB.NET widely used:
- Object and component oriented
- Easy to learn
- Structured language
- Produces efficient programs
- Part of the .Net framework
- Can be compiled on variety of platforms

##### Features of VB.NET
**Boolean Conditions** allow programmers to make decisions in their code based on true/false values.

**Automatic Garbage Collection** frees up memory that is no longer being used by the program, without the programmer having to explicitly do so.

**Standard Library** provides a set of pre-written code that programmers can use in their applications, saving them time and effort.

**Delegates and Events Management** allow programmers to create and handle events in their applications, enabling them to develop more responsive and interactive user interfaces.

**Conditional Compilation** allows programmers to compile their code differently depending on the target environment, such as Windows or Linux.

**Simple Multithreading** allows programmers to write multithreaded applications that can take advantage of multiple cores or processors.

Uses Versioning

Allows one to use multiple langauges to write a single program that works together. 

##### A VB.NET program consists of:
- Namespace declaration
- A class or module
- One or more procedures
- Variables
- The Main procedure
- Statements & Expressions
- Comment

```vb
Imports System 'Namespace'
Module Module1  'Module Declaration'
	'This program will display Hello World'
	 Sub Main() 
		 Console.WriteLine("Hello World") 
		 Console.ReadKey() 
	 End Sub 
 End Module
```

Classes or Modules generally would contain more than one procedure. <mark style="background: #FFF3A3A6;">Procedures contain the executable code</mark>, or in other words, they define the behavior of the class. 
A procedure could be any of the following: 
- Function 
- Sub 
- Operator

 In Object-Oriented Programming methodology, a program consists of various objects that interact with each other by means of actions. The actions that an object may take are called <mark style="background: #FFF3A3A6;">methods</mark>. Objects of the same kind are said to have the same type or, more often, are said to be in the same <mark style="background: #BBFABBA6;">class</mark>.

- **Object**: Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors - wagging, barking, eating, etc. An object is an instance of a class. 
- **Class**: A class can be defined as a template/blueprint that describes the behaviors/states that object of its type support. 
- **Methods**: A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed. 
- **Instant Variables**: Each object has its unique set of instant variables. An object's state is created by the values assigned to these instant variables


Identifiers 
<mark style="background: #D2B3FFA6;">An identifier is a name used to identify a class, variable, function, or any other user-defined item. The basic rules for naming classes in VB.Net are as follows: </mark>
- A name must begin with a letter that could be followed by a sequence of letters, digits 0 - 9 or underscore. The first character in an identifier cannot be a digit. 
- It must not contain any embedded space or symbol like ? - +! @ # % ^ & * [ ] { } . ; : " ' / and \. However, an underscore _ can be used. 
- It should not be a reserved keyword

---
The **Dim** statement is used for variable declaration and storage allocation for one or more variables. The Dim statement is used at module, class, structure, procedure or block level.

```vb
Dim StudentID As Integer
Dim StudentName As String
Dim Salary As Double 
Dim count1, count2 As Integer 
Dim status As Boolean
Dim exitButton As New System.Windows.Forms.Button
Dim lastTime, nextTime As Date
```

```vb
Dim pi As Double
pi = 3.14159
```

or 
```vb
Dim Num As Integer = 5
```
---
There are two kinds of expressions:
- **lvalue** : An expression that is an lvalue may appear as either the left-hand or right-hand side of an assignment. 
- **rvalue** : An expression that is an rvalue may appear on the right- but not left-hand side of an assignment
In VB.Net, constants are declared using the Const statement. The Const statement is used at module, class, structure, procedure, or block level for use in place of literal values.


```vb
' The following statements declare constants.'
Const maxval As Long = 4999 
Public Const message As String = "HELLO" 
Private Const piValue As Double = 3.1415
```
An enumerated type is declared using the Enum statement. The Enum statement declares an enumeration and defines the values of its members. The Enum statement can be used at the module, class, structure, procedure, or block level.

```vb
Enum enumerationname [ As datatype ]
	memberlist
End Enum
Enum Colors 
	red = 1
	orange = 2
	yellow = 3
	green = 4
	azure = 5
	blue = 6
	violet = 7
End Enum
```


MODIFIERS The modifiers are keywords added with any programming element to give some especial emphasis on how the programming element will behave or will be accessed in the program For example, the access modifiers: Public, Private, Protected, Friend, Protected Friend, etc., indicate the access level of a programming element like a variable, constant, enumeration or a class

A statement is a complete instruction in Visual Basic programs. It may contain keywords, operators, variables, literal values, constants and expressions. Statements could be categorized as: Declaration statements - these are the statements where you name a variable, constant, or procedure, and can also specify a data type. Executable statements - these are the statements, which initiate actions. These statements can call a method or function, loop or branch through blocks of code or assign values or expression to a variable or constant. In the last case, it is called an Assignment statement

---
14/11/23

<mark style="background: #FFB86CA6;">Variables are user defined storage locations. 
</mark>
Window application has design and code view
Console application only has code view

Keywords are reserved words specific to a programming language


---

## Operators
[[vb.net_quick_guide.pdf#page=24&selection=41,9,41,18|vb.net_quick_guide, page 24]]

#### Arithmetic Operators

1. Exponential
2. Uniary +/-
3. Multiplication **
4. / division
5. +
6. -
7. Mod
![[Pasted image 20231128113315.png]]
#### Comparison Operators:
Used to compare values of two variables. 
![[Pasted image 20231128113420.png]]



## Logical Operations
![[Pasted image 20231128113646.png]]

Assigment Operators


Control structures are used to define the flow of the computer program. 
### Types of control structure:
- Sequential Control Structure: Does the execution line by line, it doesnt branch anywhere
- Selection: Selection part of the code that will execute based on a condition. If the condition is true the section of code is executed. 
	- **Simple if:** 
	```vb.net
	IF(condtion) Then
		statement to execute
	End IF
```
	- **Simple If ... then .. else statement**
	```vb.net
	If(condition) then
		statement
	else
		alternate statement
	End If
```
	- Nested If ... Then ... else statement
	```vb.net
	If(condition) THen
		statement
	ElseIF (condition 2) Then
		statement
	Elseif (condition 3) Then
		statement
	Else
		statement
	End If
```
- Iteration/Repetition
	1. While statement
	 ```vb.net
	 While (condition)
		 statement
	End While
```
	2. Do while loop
		```vb.net
		Do While (conditon)
```
	1. Do loop while
	2. Do until loop
	3. Do loop until 
	4. For Next
	5. Select ... case 
