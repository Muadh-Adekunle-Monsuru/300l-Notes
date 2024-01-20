### Classes and Methods in VB.NET:

#### 1. Creating Classes:
```vb.net
' Define a simple class
Public Class MyClassExample
    ' Class members (fields)
    Public Property MyProperty As String

    ' Constructor
    Public Sub New()
        MyProperty = "Default Value"
    End Sub

    ' Methods
    Public Sub DisplayMessage()
        Console.WriteLine($"Message from MyClassExample: {MyProperty}")
    End Sub
End Class
```

#### 2. Types of Methods (Function and Subroutine):

##### Function:
```vb.net
Public Class FunctionExample
    Public Function AddNumbers(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
        Return num1 + num2
    End Function
End Class
```

##### Subroutine:
```vb.net
Public Class SubroutineExample
    Public Sub DisplayMessage(ByVal message As String)
        Console.WriteLine($"Message from SubroutineExample: {message}")
    End Sub
End Class
```

#### 3. Referencing Methods:
##### Creating Instances:
```vb.net
Dim myClassInstance As New MyClassExample()
Dim functionInstance As New FunctionExample()
Dim subroutineInstance As New SubroutineExample()
```

##### Accessing Methods:
```vb.net
' Accessing methods from MyClassExample
myClassInstance.DisplayMessage()

' Accessing methods from FunctionExample
Dim result As Integer = functionInstance.AddNumbers(5, 7)
Console.WriteLine($"Result from FunctionExample: {result}")

' Accessing methods from SubroutineExample
subroutineInstance.DisplayMessage("Hello, VB.NET!")
```

#### 4. Syntax Examples:

##### Class and Method Invocation:
```vb.net
' Creating an instance of MyClassExample
Dim myInstance As New MyClassExample()

' Accessing property and method
myInstance.MyProperty = "New Value"
myInstance.DisplayMessage()
```

##### Function Invocation:
```vb.net
' Creating an instance of FunctionExample
Dim funcInstance As New FunctionExample()

' Invoking the function
Dim sumResult As Integer = funcInstance.AddNumbers(10, 15)
Console.WriteLine($"Sum Result: {sumResult}")
```

##### Subroutine Invocation:
```vb.net
' Creating an instance of SubroutineExample
Dim subInstance As New SubroutineExample()

' Invoking the subroutine
subInstance.DisplayMessage("Greetings from VB.NET!")
```

These examples cover the basics of creating classes and methods in VB.NET, along with how to reference and use them.