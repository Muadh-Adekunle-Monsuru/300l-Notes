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
	2. Do while loop
	1. Do loop while
	2. Do until loop
	3. Do loop until 
	4. For Next
	5. Select ... case 


1. **Do Loop:**
   ```vb.net
   Dim counter As Integer = 1

   Do
       Console.WriteLine("Counter: " & counter)
       counter += 1
   Loop While counter <= 5
   ```

2. **For...Next:**
   ```vb.net
   For i As Integer = 1 To 5
       Console.WriteLine("Iteration: " & i)
   Next
   ```

3. **For Each...Next:**
   ```vb.net
   Dim numbers() As Integer = {1, 2, 3, 4, 5}

   For Each num In numbers
       Console.WriteLine("Number: " & num)
   Next
   ```

4. **While...End:**
   ```vb.net
   Dim condition As Boolean = True
   Dim count As Integer = 1

   While condition
       Console.WriteLine("Count: " & count)
       count += 1
       If count > 5 Then
           condition = False
       End If
   End While
   ```

5. **With...End With:**
   ```vb.net
   Dim person As New Person()
   With person
       .Name = "Alice"
       .Age = 25
   End With

   Console.WriteLine("Person: " & person.Name & ", Age: " & person.Age)

   ' Assuming there is a Person class defined with Name and Age properties.
   ```

6. **Nested Loops:**
   ```vb.net
   For i As Integer = 1 To 3
       For j As Integer = 1 To 3
           Console.WriteLine("i: " & i & ", j: " & j)
       Next
   Next
   ```

---
### Array

An array stores a fixed size sequential collection of data items of the same data types stored contiguously. 

Declaring an Array

```vb.net
	Dim MyArray() As Integer. 'one dimentional array' 
	Dim MyArray(,) As Integer. 'two dimentional array' 
	Dim MyArray(4) As Integer. 'one dimentional array lebght of 4' 

	Dim MyArray(4) As Integer = {1,2,3,4}
	MyArray(2) = 3
```


Declare and array called names and give it the names of your classmates
```vb.net
	Dim names(3) As String = {"Idris","Abayomi","Fernami"};
	
	Dim names() As String;
	names() = {"Abdulsalam","Ismail","Taofeeq"};
```

Two dimentional array of type integer

```vb.net
Dim ages(5,4) As Integer = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
```

---
## Classes

The main difference between classes and modules is that classes can be instantiated as objects while standard modules cannot.

An _object_ is a combination of code and data that can be treated as a unit. An object can be a piece of an application, like a control or a form. An entire application can also be an object.

Each object in Visual Basic is defined by a _class_. A class describes the variables, properties, procedures, and events of an object. Objects are instances of classes; you can create as many objects as you need once you have defined a class.

To understand the relationship between an object and its class, think of cookie cutters and cookies. The cookie cutter is the class. It defines the characteristics of each cookie, for example size and shape. The class is used to create objects. The objects are the cookies.

---
Sure, let's delve into the concepts of classes, modules, and methods in VB.NET with detailed examples.

### 1. **Classes in VB.NET:**
A class is a blueprint for creating objects. It defines a data structure along with the methods that can be applied to that structure. Here's a simple example of a class:

```vb
Public Class Person
    ' Fields (variables)
    Public FirstName As String
    Public LastName As String

    ' Constructor
    Public Sub New(first As String, last As String)
        FirstName = first
        LastName = last
    End Sub

    ' Method
    Public Function GetFullName() As String
        Return FirstName & " " & LastName
    End Function
End Class
```

In this example:
- `Person` is a class that has two fields (`FirstName` and `LastName`).
- There's a constructor (`New`) that initializes the object when it is created.
- There's a method (`GetFullName`) that returns a concatenated full name.

### 2. **Modules in VB.NET:**
A module is a container for code, similar to a class. However, a module cannot be instantiated; it's primarily used to organize and group related code. Here's an example:

```vb
Module MathOperations
    Public Function Add(x As Integer, y As Integer) As Integer
        Return x + y
    End Function

    Public Function Subtract(x As Integer, y As Integer) As Integer
        Return x - y
    End Function
End Module
```

In this example:
- `MathOperations` is a module that contains two functions (`Add` and `Subtract`).

### 3. **Creating Objects and Using Variables in a Class:**
Now, let's create objects of the `Person` class and use them:

```vb
Dim person1 As New Person("John", "Doe")
Dim person2 As New Person("Jane", "Smith")

Console.WriteLine(person1.FirstName)  ' Output: John
Console.WriteLine(person2.GetFullName())  ' Output: Jane Smith
```

Here, `person1` and `person2` are instances of the `Person` class. You can access their fields (`FirstName`, `LastName`) and call methods (`GetFullName()`).

### 4. **Using Parameters and Arguments:**
Let's modify the `Add` method in the `MathOperations` module to use parameters:

```vb
Module MathOperations
    Public Function Add(x As Integer, y As Integer) As Integer
        Return x + y
    End Function

    ' Modified Add method with parameters
    Public Function AddWithMessage(x As Integer, y As Integer, message As String) As Integer
        Console.WriteLine(message)
        Return x + y
    End Function
End Module
```

Now, you can call the modified method with parameters:

```vb
Dim result As Integer = MathOperations.AddWithMessage(3, 4, "Adding numbers:")
' Output: Adding numbers:
' Result: 7
Console.WriteLine("Result: " & result)
```

### 5. **Initializing Objects and Calling Methods:**
Let's create a new class with an object initialization example:

```vb
Public Class Car
    Public Make As String
    Public Model As String

    Public Sub New(make As String, model As String)
        Me.Make = make
        Me.Model = model
    End Sub

    Public Sub DisplayInfo()
        Console.WriteLine($"Car: {Make} {Model}")
    End Sub
End Class
```

Now, create an object and call a method:

```vb
Dim myCar As New Car("Toyota", "Camry")
myCar.DisplayInfo()  ' Output: Car: Toyota Camry
```

This example shows how to create an object of the `Car` class, initialize it using the constructor, and then call the `DisplayInfo` method.

These examples cover creating classes, modules, different types of methods, using variables in a class, and using parameters and arguments in VB.NET. You can apply these concepts to build more complex and modular applications.


---
In VB.NET, `ByVal` and `ByRef` are keywords used when passing arguments to a procedure (such as a function or a subroutine). They determine how the argument is passed to the procedure and whether changes to the parameter inside the procedure affect the original value passed.

1. **ByVal (By Value):**
   - When you pass an argument by value, a copy of the actual value is passed to the procedure.
   - Changes made to the parameter inside the procedure do not affect the original value outside the procedure.
   - `ByVal` is the default parameter passing mechanism in VB.NET.

   Example:

   ```vb
   Sub IncrementByValue(ByVal x As Integer)
       x = x + 1
       Console.WriteLine($"Inside the procedure: {x}")
   End Sub

   Dim num As Integer = 5
   IncrementByValue(num)
   Console.WriteLine($"Outside the procedure: {num}")
   ```

   Output:
   ```
   Inside the procedure: 6
   Outside the procedure: 5
   ```

   In this example, the change made to `x` inside the procedure does not affect the original value of `num` outside the procedure.

2. **ByRef (By Reference):**
   - When you pass an argument by reference, the actual memory address of the variable is passed to the procedure.
   - Changes made to the parameter inside the procedure affect the original value outside the procedure.
   - You explicitly use `ByRef` to indicate that you want to pass the argument by reference.

   Example:

   ```vb
   Sub IncrementByReference(ByRef x As Integer)
       x = x + 1
       Console.WriteLine($"Inside the procedure: {x}")
   End Sub

   Dim num As Integer = 5
   IncrementByReference(num)
   Console.WriteLine($"Outside the procedure: {num}")
   ```

   Output:
   ```
   Inside the procedure: 6
   Outside the procedure: 6
   ```

   In this example, the change made to `x` inside the procedure affects the original value of `num` outside the procedure because it is passed by reference.

**Summary:**
- Use `ByVal` if you want to pass a copy of the value, and changes inside the procedure should not affect the original value.
- Use `ByRef` if you want changes inside the procedure to be reflected in the original value outside the procedure.


---
There are three ways to call a method:
1. using methods name by itself to call another method of the same class or method
```vb.net
add(num1,num2)
```
2. using a variable that contains a reference to an object, followed by . And then the method name to call a method of the reference object. Openequation.subt(num1,num2)
3. Using a class or the module name and . tho call a shared method of a class . e.g. claaname.subt(num1,num2)

Arguments can be passed to parameters in two ways:
1. Pass by value: when argument is passed by value, the program makes a copy of the argument's values. And passes the copy to the method. Any changes to the called method copy do no affect the original copy of the variable in the caller method.  
---

The main difference between classes and modules is that classes can be instantiated as objects while standard modules cannot.

An _object_ is a combination of code and data that can be treated as a unit. An object can be a piece of an application, like a control or a form. An entire application can also be an object.

Each object in Visual Basic is defined by a _class_. A class describes the variables, properties, procedures, and events of an object. Objects are instances of classes; you can create as many objects as you need once you have defined a class.

To understand the relationship between an object and its class, think of cookie cutters and cookies. The cookie cutter is the class. It defines the characteristics of each cookie, for example size and shape. The class is used to create objects. The objects are the cookies.

---
Sure, let's delve into the concepts of classes, modules, and methods in VB.NET with detailed examples.

### 1. **Classes in VB.NET:**
A class is a blueprint for creating objects. It defines a data structure along with the methods that can be applied to that structure. Here's a simple example of a class:

```vb
Public Class Person
    ' Fields (variables)
    Public FirstName As String
    Public LastName As String

    ' Constructor
    Public Sub New(first As String, last As String)
        FirstName = first
        LastName = last
    End Sub

    ' Method
    Public Function GetFullName() As String
        Return FirstName & " " & LastName
    End Function
End Class
```

In this example:
- `Person` is a class that has two fields (`FirstName` and `LastName`).
- There's a constructor (`New`) that initializes the object when it is created.
- There's a method (`GetFullName`) that returns a concatenated full name.

### 2. **Modules in VB.NET:**
A module is a container for code, similar to a class. However, a module cannot be instantiated; it's primarily used to organize and group related code. Here's an example:

```vb
Module MathOperations
    Public Function Add(x As Integer, y As Integer) As Integer
        Return x + y
    End Function

    Public Function Subtract(x As Integer, y As Integer) As Integer
        Return x - y
    End Function
End Module
```

In this example:
- `MathOperations` is a module that contains two functions (`Add` and `Subtract`).

### 3. **Creating Objects and Using Variables in a Class:**
Now, let's create objects of the `Person` class and use them:

```vb
Dim person1 As New Person("John", "Doe")
Dim person2 As New Person("Jane", "Smith")

Console.WriteLine(person1.FirstName)  ' Output: John
Console.WriteLine(person2.GetFullName())  ' Output: Jane Smith
```

Here, `person1` and `person2` are instances of the `Person` class. You can access their fields (`FirstName`, `LastName`) and call methods (`GetFullName()`).

### 4. **Using Parameters and Arguments:**
Let's modify the `Add` method in the `MathOperations` module to use parameters:

```vb
Module MathOperations
    Public Function Add(x As Integer, y As Integer) As Integer
        Return x + y
    End Function

    ' Modified Add method with parameters
    Public Function AddWithMessage(x As Integer, y As Integer, message As String) As Integer
        Console.WriteLine(message)
        Return x + y
    End Function
End Module
```

Now, you can call the modified method with parameters:

```vb
Dim result As Integer = MathOperations.AddWithMessage(3, 4, "Adding numbers:")
' Output: Adding numbers:
' Result: 7
Console.WriteLine("Result: " & result)
```

### 5. **Initializing Objects and Calling Methods:**
Let's create a new class with an object initialization example:

```vb
Public Class Car
    Public Make As String
    Public Model As String

    Public Sub New(make As String, model As String)
        Me.Make = make
        Me.Model = model
    End Sub

    Public Sub DisplayInfo()
        Console.WriteLine($"Car: {Make} {Model}")
    End Sub
End Class
```

Now, create an object and call a method:

```vb
Dim myCar As New Car("Toyota", "Camry")
myCar.DisplayInfo()  ' Output: Car: Toyota Camry
```

This example shows how to create an object of the `Car` class, initialize it using the constructor, and then call the `DisplayInfo` method.

These examples cover creating classes, modules, different types of methods, using variables in a class, and using parameters and arguments in VB.NET. You can apply these concepts to build more complex and modular applications.


---
In VB.NET, `ByVal` and `ByRef` are keywords used when passing arguments to a procedure (such as a function or a subroutine). They determine how the argument is passed to the procedure and whether changes to the parameter inside the procedure affect the original value passed.

1. **ByVal (By Value):**
   - When you pass an argument by value, a copy of the actual value is passed to the procedure.
   - Changes made to the parameter inside the procedure do not affect the original value outside the procedure.
   - `ByVal` is the default parameter passing mechanism in VB.NET.

   Example:

   ```vb
   Sub IncrementByValue(ByVal x As Integer)
       x = x + 1
       Console.WriteLine($"Inside the procedure: {x}")
   End Sub

   Dim num As Integer = 5
   IncrementByValue(num)
   Console.WriteLine($"Outside the procedure: {num}")
   ```

   Output:
   ```
   Inside the procedure: 6
   Outside the procedure: 5
   ```

   In this example, the change made to `x` inside the procedure does not affect the original value of `num` outside the procedure.

2. **ByRef (By Reference):**
   - When you pass an argument by reference, the actual memory address of the variable is passed to the procedure.
   - Changes made to the parameter inside the procedure affect the original value outside the procedure.
   - You explicitly use `ByRef` to indicate that you want to pass the argument by reference.

   Example:

   ```vb
   Sub IncrementByReference(ByRef x As Integer)
       x = x + 1
       Console.WriteLine($"Inside the procedure: {x}")
   End Sub

   Dim num As Integer = 5
   IncrementByReference(num)
   Console.WriteLine($"Outside the procedure: {num}")
   ```

   Output:
   ```
   Inside the procedure: 6
   Outside the procedure: 6
   ```

   In this example, the change made to `x` inside the procedure affects the original value of `num` outside the procedure because it is passed by reference.

**Summary:**
- Use `ByVal` if you want to pass a copy of the value, and changes inside the procedure should not affect the original value.
- Use `ByRef` if you want changes inside the procedure to be reflected in the original value outside the procedure.


---
There are three ways to call a method:
1. using methods name by itself to call another method of the same class or method
```vb.net
add(num1,num2)
```
2. using a variable that contains a reference to an object, followed by . And then the method name to call a method of the reference object. Openequation.subt(num1,num2)
3. Using a class or the module name and . tho call a shared method of a class . e.g. claaname.subt(num1,num2)

Arguments can be passed to parameters in two ways:
1. Pass by value: when argument is passed by value, the program makes a copy of the argument's values. And passes the copy to the method. Any changes to the called method copy do no affect the original copy of the variable in the caller method.  
2. Pass by reference: any modification that occurs the the arguments, changes the actual value of the argument variable

---
## Error Handling

In VB.NET, error handling is a crucial aspect of writing robust and reliable code. VB.NET provides a structured way to handle errors using `Try...Catch...Finally` blocks. Here's an overview of error handling in VB.NET:

### Try...Catch...Finally Blocks:

The `Try...Catch...Finally` structure is used to handle exceptions (errors) that may occur during the execution of code. The basic syntax is as follows:

```vb
Try
    ' Code that may cause an exception
Catch ex As Exception
    ' Code to handle the exception
Finally
    ' Code that will always be executed, whether an exception occurs or not
End Try
```

#### Example:

```vb
Sub Example()
    Try
        Dim result As Integer = 10 / 0 ' This will cause a System.DivideByZeroException
        Console.WriteLine(result)
    Catch ex As DivideByZeroException
        Console.WriteLine("Error: Cannot divide by zero.")
    Catch ex As Exception
        Console.WriteLine($"An unexpected error occurred: {ex.Message}")
    Finally
        Console.WriteLine("This block will always be executed.")
    End Try
End Sub
```

In this example:
- The `Try` block contains the code that might raise an exception.
- The `Catch` blocks handle specific types of exceptions. The first `Catch` block catches a `DivideByZeroException`, and the second `Catch` block catches any other exception.
- The `Finally` block contains code that will always be executed, whether an exception occurs or not.

### Throwing Exceptions:

You can use the `Throw` statement to explicitly throw an exception. This can be useful when you want to signal an error condition in your code.

```vb
Sub Example()
    Try
        Throw New ApplicationException("This is a custom exception.")
    Catch ex As ApplicationException
        Console.WriteLine($"Custom Exception: {ex.Message}")
    Catch ex As Exception
        Console.WriteLine($"An unexpected error occurred: {ex.Message}")
    End Try
End Sub
```

### Exception Properties:

When an exception occurs, you can access information about the exception through the `Exception` object. For example:

```vb
Try
    ' Code that may cause an exception
Catch ex As Exception
    Console.WriteLine($"Exception Type: {ex.GetType().Name}")
    Console.WriteLine($"Exception Message: {ex.Message}")
    ' Additional exception properties can be accessed
Finally
    ' Code that will always be executed, whether an exception occurs or not
End Try
```

### Custom Exceptions:

You can create your own custom exceptions by defining a class that inherits from `Exception`:

```vb
Public Class CustomException
    Inherits Exception

    Public Sub New(message As String)
        MyBase.New(message)
    End Sub
End Class

Sub Example()
    Try
        Throw New CustomException("This is a custom exception.")
    Catch ex As CustomException
        Console.WriteLine($"Custom Exception: {ex.Message}")
    Catch ex As Exception
        Console.WriteLine($"An unexpected error occurred: {ex.Message}")
    End Try
End Sub
```

This allows you to create more meaningful exceptions that are specific to your application.

### Conclusion:

Effective error handling is essential for building robust and maintainable applications. The `Try...Catch...Finally` structure provides a way to handle exceptions gracefully and to take appropriate actions in case of errors. It's important to handle exceptions at the appropriate level in your application and to provide meaningful error messages to aid in debugging and troubleshooting.


--- 

## Compiler Directives
Compiler directives give instructions to compiler to preprocess the information before actual compilation starts. All these directives begin with # and only white space characters may appear before a directives on a line. These directives are not statements. The compiler directives used to help in conditional compilation. 