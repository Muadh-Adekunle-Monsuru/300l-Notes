## Question 1
1) Briefly discuss four (4) characteristics of an Object-Oriented Programming Language.
	- Encapsulation: This involves bundling data and methods that operate on the data into a single unit called a class. It hides the internal details of how an object operates from the outside world.
	- Inheritance: It allows a new class to inherit properties and behaviors from an existing class. This promotes code reuse and establishes a relationship between parent and child classes.
	- Polymorphism: This allows objects of different types to be treated as objects of a common type. It enables flexibility in coding and enhances code readability.
	- Abstraction: It involves simplifying complex systems by modeling classes based on the essential properties and behaviors they share, ignoring non-essential details.
1) What make a Visual Basic .Net an object oriented Programming Language 
	- Visual Basic .Net (VB.NET) is object-oriented because it supports the principles of encapsulation, inheritance, polymorphism, and abstraction.
	- It allows the creation of classes and objects, enabling developers to implement encapsulation by bundling data and methods together.
	- VB.NET supports inheritance, allowing developers to create new classes based on existing ones, promoting code reuse. 
	- Polymorphism is achievable in VB.NET through features like method overloading and interfaces.
	- Abstraction is facilitated by defining abstract classes and interfaces in VB.NET.
1) What are the components and services provided by Common Language runtime? 
	- **Common Type System (CTS):** Ensures that types written in different languages can interoperate, providing a common set of data types.
	- **Common Language Specification (CLS):** Defines a set of rules that language compilers must follow to ensure compatibility with other .NET languages.
	- **Garbage Collection:** Manages memory by automatically reclaiming unused objects, reducing memory leaks.
	- **Exception Handling:** Provides a unified way of handling exceptions across different languages using try-catch blocks.
	- **Security:** Implements code access security to control access to resources and ensure a secure execution environment.
1) Dot (.)Net programs are compiled into machine specific instruction in two steps. Describe the steps. 
	- **Intermediate Language (IL) Generation:** The source code is compiled into an intermediate language (IL), also known as Microsoft Intermediate Language (MSIL).
	- **Just-In-Time Compilation (JIT):** The IL code is compiled into machine-specific instructions at runtime by the Common Language Runtime (CLR). This ensures portability and allows for optimization based on the target machine architecture.
1) List three (3) types of application that can be developed in a VS environment.
	- **Windows Forms Applications:** Desktop applications with graphical user interfaces.
	- **Web Applications:** Applications designed to run on web browsers, utilizing technologies like ASP.NET.
	- **Console Applications:** Text-based applications that run in a command-line console.
1) Is VB.NET backward compatible with VB6? 
	- VB.NET is not fully backward compatible with VB6. While VB.NET retains some syntactic similarities, there are significant differences in language features and runtime behavior.
	- The transition from VB6 to VB.NET often requires modification and adaptation of code.
1)  Describe the function of these Keywords with appropriate example:
	- **DIM:** Used for declaring variables. Example: `Dim x As Integer = 10`
	- **CONST:** Used for declaring constants. Example: `Const PI As Double = 3.14159`
	- **Console.ReadKey():** Pauses execution until a key is pressed. Example: `Console.ReadKey()`
1) What is the function of Try...catch in VB Net programme and give a typical example? 
	- The `Try...Catch` block is used for exception handling in VB.NET. Code inside the `Try` block is monitored for exceptions, and if an exception occurs, it is caught and handled in the `Catch` block.
	- Example:
```vb
Try
    ' Code that may cause an exception
    Dim result As Integer = 10 / 0
Catch ex As Exception
    ' Handle the exception
    Console.WriteLine("An error occurred: " & ex.Message)
End Try

```   
- In this example, if a division by zero occurs, the exception is caught, and a message is displayed.
## Question 2
1) describe each of the following terms:
	1. **Menu Bar** - The Menu Bar contains drop-down menus that provide access to many commands in Visual Studio. For example - File menu, Edit menu, etc. It is located at the top of the Visual Studio window.
	2. **Toolbar -** The Toolbar provides quick access buttons for common commands and actions in Visual Studio like opening/saving files, building a project, debugging etc. It is located below the Menu Bar by default. Contains Icons that allows users to have quick access to various functionalities
	3. **Solution Explorer** - The Solution Explorer displays the structure and contents of your project, solution or code file currently open in Visual Studio. It shows all files, references, dependencies etc. in a tree format.
	4. **Property Window** - The Property Window allows you to view and modify configurable properties and settings of any file, control or object currently selected in the Visual Studio designer or editor. For example, changing properties of a Button or Textbox on a Windows Form.
2) Differentiate between the Do While......Loop and Do......Loop While statement.
	1. **Do While...Loop:**
		   - In the `Do While...Loop` statement, the loop condition is checked before the loop body is executed.
		   - The loop will continue executing as long as the specified condition is `True`.
		   - The condition is evaluated at the beginning of each iteration, and if it is `False` initially, the loop body will not execute at all.
	   Example:
	   ```vb
	   Do While x < 10
	       ' Loop body
	       x += 1
	   Loop
	   ```
	2. **Do...Loop While:**
	   - In the `Do...Loop While` statement, the loop body is executed at least once before checking the loop condition.
	   - The loop will continue executing as long as the specified condition is `True`.
	   - The condition is evaluated after the loop body, and if it is `False`, the loop will exit.
	   Example:
	   ```vb
	   Do
	       ' Loop body
	       x += 1
	   Loop While x < 10
	   ```

3) print the even integers from 1 to 100, using Do....Loop While and counter variable x. Assume the variable X has been declared but not initialized. Print only five integers per line. *Hint: use the calculation x mod 5. When the value of this is 0, print a carriage return; otherwise, print a tab character. Call Console. WriteLine to output the carriage return and call Console. Write(vbTab) to output the tab character.*  

```vb
Module Program
Sub main(args As String())
	Dim x as Integer
	Do 
	Console.Write(x)
	If(x Mod 5 = 0) Then
		Console.WriteLine()
	Else
		Console.Write(vbTab)
	End If	
	x += 2
	While(x<=100)
End Sub
End Module
```

## Question 3
1) Distinguish between a Function method and a subroutine method 
- **Function Method:**
    
    - Returns a value.
    - Typically used to perform a specific calculation or operation and return the result.
    - Defined using the `Function` keyword.
    - Example:
```vb
Function AddNumbers(a As Integer, b As Integer) As Integer
    Return a + b
End Function

```
       
- **Subroutine Method:**
    
    - Does not return a value (returns `void` in other languages).
    - Used for performing a series of actions without producing a result.
    - Defined using the `Sub` keyword.
    - Example:
```vb
Sub DisplayMessage(message As String)
    Console.WriteLine(message)
End Sub
```
1) Parameters in a method can be passed both value and by reference. Discuss.
	In VB.NET, parameters in a method can be passed both by value and by reference. 
	- When a parameter is passed by value, a copy of the parameter's value is passed to the method, and any changes made to the parameter within the method do not affect the original value of the parameter outside the method. 
	- When a parameter is passed by reference, a reference to the original variable is passed to the method, and any changes made to the parameter within the method affect the original value of the parameter outside the method

1) Write a console application in Visual Basic that prints elements in two-dimensional array whose elements are {{9,2,5,7,3},{4,1,9,3,8}} by row.
```vb
Module Module1
    Sub Main()
        Dim myArray(,) As Integer = {{9, 2, 5, 7, 3}, {4, 1, 9, 3, 8}}

        For i As Integer = 0 To 1
            For j As Integer = 0 To 4
                Console.Write(myArray(i, j) & " ")
            Next
            Console.WriteLine()
        Next

    End Sub
End Module

```
## Question 4
1) Using Microsoft Visual Studio.Net IDE, Describe the steps involve in create, compile and execute a simple application. 
- **Create:**
    1. Open Visual Studio.
    2. Click on "Create a new project."
    3. Choose the project template (e.g., Console Application).
    4. Set project details and click "Create."
- **Compile:**
    1. Write code in the editor.
    2. Click on the "Build" menu.
    3. Choose "Build Solution" to compile the code.
- **Execute:**
    1. Press F5 or click on "Start Debugging" to run the application.
    2. Alternatively, press Ctrl + F5 to start without debugging.
1) List ten 10 controls, and their functions in visual studio environment.

| Control         | Prefix     | Functions                               |
|-----------------|------------|-----------------------------------------|
| TextBox         | txt        | Input and display of text.              |
| Label           | lbl        | Displaying non-editable text.           |
| Button          | btn        | Triggering an action when clicked.      |
| CheckBox        | chk        | Representing binary choices.            |
| RadioButton     | rad        | Selecting mutually exclusive choices.   |
| ComboBox        | cmb        | Providing a dropdown list of items.     |
| ListBox         | lst        | Displaying a list of items.             |
| DataGridView    | dgv        | Displaying data in a tabular form.      |
| ProgressBar     | prg        | Showing the progress of an operation.   |
| ToolTip         | tt         | Providing additional information.      |


1) Write VB.Net program to compare the content of two strings and report if  they are the same or not 

```vb
Module Module1
    Sub Main()
        Dim str1 As String = "Hello"
        Dim str2 As String = "World"

        If String.Compare(str1, str2) = 0 Then
            Console.WriteLine("The strings are the same.")
        Else
            Console.WriteLine("The strings are different.")
        End If


    End Sub
End Module

```