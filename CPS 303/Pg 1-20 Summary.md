Certainly, here's the passage with proper formatting:

VB.NET is an object-oriented language implemented on the .NET Framework.

### Why is VB.NET widely used:
- Object and component oriented
- Easy to learn
- Structured language
- Produces efficient programs
- Part of the .Net framework
- Can be compiled on a variety of platforms

### Features of VB.NET
**Boolean Conditions** allow programmers to make decisions in their code based on true/false values.

**Automatic Garbage Collection** frees up memory that is no longer being used by the program, without the programmer having to explicitly do so.

**Standard Library** provides a set of pre-written code that programmers can use in their applications, saving them time and effort.

**Delegates and Events Management** allow programmers to create and handle events in their applications, enabling them to develop more responsive and interactive user interfaces.

**Conditional Compilation** allows programmers to compile their code differently depending on the target environment, such as Windows or Linux.

**Simple Multithreading** allows programmers to write multithreaded applications that can take advantage of multiple cores or processors.

### A VB.NET program consists of:
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

Classes or Modules generally would contain more than one procedure. Procedures contain the executable code, or in other words, they define the behavior of the class.
A procedure could be any of the following:
- Function
- Sub
- Operator

In Object-Oriented Programming methodology, a program consists of various objects that interact with each other by means of actions. The actions that an object may take are called methods. Objects of the same kind are said to have the same type or, more often, are said to be in the same class.

- **Object**: Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors - wagging, barking, eating, etc. An object is an instance of a class.
- **Class**: A class can be defined as a template/blueprint that describes the behaviors/states that object of its type support.
- **Methods**: A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated, and all the actions are executed.
- **Instant Variables**: Each object has its unique set of instant variables. An object's state is created by the values assigned to these instant variables.

Identifiers
An identifier is a name used to identify a class, variable, function, or any other user-defined item. The basic rules for naming classes in VB.Net are as follows:
- A name must begin with a letter that could be followed by a sequence of letters, digits 0 - 9, or underscore. The first character in an identifier cannot be a digit.
- It must not contain any embedded space or symbol like ? - +! @ # % ^ & * [ ] { } . ; : " ' / and \. However, an underscore _ can be used.
- It should not be a reserved keyword.


### Variable Declaration with `Dim` Statement

The `Dim` statement is used for variable declaration and storage allocation for one or more variables. It can be used at module, class, structure, procedure, or block level.

```vb
Dim StudentID As Integer
Dim StudentName As String
Dim Salary As Double 
Dim count1, count2 As Integer 
Dim status As Boolean
Dim exitButton As New System.Windows.Forms.Button
Dim lastTime, nextTime As Date
```

### Variable Assignment

You can assign values to variables after declaring them:

```vb
Dim pi As Double
pi = 3.14159
```

### lvalue and rvalue

In VB.Net, you have two kinds of expressions:

- **lvalue**: An expression that is an lvalue can appear as either the left-hand or right-hand side of an assignment.
- **rvalue**: An expression that is an rvalue can appear on the right-hand side but not the left-hand side of an assignment.

### Constants Declaration with `Const` Statement

Constants are declared using the `Const` statement, which is used at module, class, structure, procedure, or block level. It is used to replace literal values.

```vb
' The following statements declare constants.'
Const maxval As Long = 4999 
Public Const message As String = "HELLO" 
Private Const piValue As Double = 3.1415
```

### Enumerated Types with `Enum` Statement

Enumerated types are declared using the `Enum` statement. It defines the values of its members and can be used at the module, class, structure, procedure, or block level.

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

### Modifiers

Modifiers are keywords used with programming elements to specify how they behave or are accessed in the program. Examples of access modifiers include `Public`, `Private`, `Protected`, `Friend`, `Protected Friend`, etc., which indicate the access level of a programming element such as a variable, constant, enumeration, or class.

### Types of Statements

A statement is a complete instruction in Visual Basic programs and can include keywords, operators, variables, literal values, constants, and expressions. Statements can be categorized as:

- Declaration statements: These statements are used to name a variable, constant, or procedure and specify a data type.
- Executable statements: These statements initiate actions, such as calling a method or function, looping, branching through code blocks, or assigning values or expressions to variables or constants. In the last case, it's called an Assignment statement.