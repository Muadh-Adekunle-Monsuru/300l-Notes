https://learn.microsoft.com/en-us/dotnet/visual-basic/programming-guide/language-features/objects-and-classes/

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