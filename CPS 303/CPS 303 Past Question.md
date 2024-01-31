1. **State whether each of the following is true or false. If false, state why.**

| Question | True/False | Justification |
| ---- | ---- | ---- |
| a)The title bar of the IDE displays the IDE's mode. | True | Design, Code |
| b)Both Form and Labels have a title bar.<br> | False | Labels do not have a title bar, they are instead used as descriptive names for form control  |
| c)The toolbar contains icons that represent controls that can be drag and drop onto a Form. | True |  |
| d)VB.Net is backward compatible with VB 6. | False | Different Underlying architecture.<br>Changes in syntax |
| e)The Variable of type Char cannot be converted to type Integer. | False | ```<br>Dim integerValue As Integer = Char.GetNumericValue(numericChar)<br>``` |
| f)Control property can be modified only by writing code. | False | The properties tab can be used to modify control properties |
| g)Visual Basic file use the extension .vxls. | False | It is saved as .vb |
2. **Fill the following blank in each of the following statements**. 
	1. Method can be declared in <mark style="background: #FFB86CA6;">class</mark> and <mark style="background: #FFB86CA6;">modules</mark> 
	2. The<mark style="background: #FFB86CA6;"> solution explorer</mark> window allows you to browse solution file.
	3. Visual Basic Console Application begins execution at <mark style="background: #FFB86CA6;"> Main() </mark>method.
	4. Class <mark style="background: #FFB86CA6;">DialogResult/MessageBox</mark> contains methods for displaying dialogs.
	5. A Method is invoked with a (n) <mark style="background: #FFB86CA6;">method call</mark>. 
	6. The technique of <mark style="background: #FFB86CA6;">drag and drop</mark> allows you to create GUIs without code.
	7. <mark style="background: #FFB86CA6;">Sub</mark> and <mark style="background: #FFB86CA6;">functions</mark> are two type of methods in VB.Net.
	8. A variable known only within the method in which it is declared is cleared is called a (n) <mark style="background: #FFB86CA6;">Local variable</mark>
	9. The <mark style="background: #FFB86CA6;">scope</mark> of a variable is the portion of the program in which the variable can be referenced without qualification.
	10. Keywords Public and Private are <mark style="background: #FFB86CA6;">access modifiers </mark>
	11. A[n]  <mark style="background: #FFB86CA6;">tooltip</mark> appears when the mouse pointer hover an icon.
	12. Keyword  <mark style="background: #FFB86CA6;">Sub</mark> indicates that a method will perform a task but will not return any value. 
	13. In a For...Next statement, incremental occurs <mark style="background: #FFB86CA6;">after</mark> the body of the statement is performed. 
	14. In a Do......Loop while repetition statement, the body of the loop is executed <mark style="background: #FFB86CA6;">at least once / while the condition is true</mark>
	15. The expression following the keyword Select Case is called <mark style="background: #FFB86CA6;">test expression</mark>
	16. The properties in the properties window can be sorted <mark style="background: #FFB86CA6;">alphabetically</mark>  or <mark style="background: #FFB86CA6;">categorically</mark>

3. **Dot (.)Net Programs are compiled into machine specific instruction in two steps. Describe the steps**
	1. **Compilation to Microsoft Intermediate Language (MSIL**): 
		- The source code written in .NET languages like C#, VB.NET etc. is compiled into an intermediate language called the Microsoft Intermediate Language (MSIL) by a .NET compiler. 
		- MSIL is independent of any specific machine architecture or operating system. It is meant to be executed by a .NET runtime.
	2. **Just-In-Time (JIT) Compilation:**
		- When a .NET program is executed, the MSIL code is compiled again by a Just-In-Time (JIT) compiler into native machine code. 
		- The JIT compiler is specific to the underlying CPU and OS. It translates the MSIL into native machine language that can be directly executed by the CPU.
		- This on-demand compilation by JIT provides portability as well as performance optimization based on the target machine.
	So in summary, .NET programs are first compiled into platform-agnostic MSIL, and then JIT compiled into platform-specific machine code at runtime for execution. This two-step compilation provides both portability and performance.
	
4. **Using Do Until Loop repetition statement, write a program that calculate the first power of three larger than 100**
```vb
Module Program 
	Sub Main(args As String())
		Dim condition As Boolean = False
		Dim i As Integer = 1
		Dim power As Integer
		Do Until condition
			power = 3 ^ i 
			If(power>100) Then
				condition = True
			Else
				Console.WriteLine(power)
				i+=1
			End If
		Loop	
	End Sub
End Module
```
---

Section B
1.  **Briefly describe each of the following terms**:
	1. **Menu Bar** - The Menu Bar contains drop-down menus that provide access to many commands in Visual Studio. For example - File menu, Edit menu, etc. It is located at the top of the Visual Studio window.
	2. **Toolbar -** The Toolbar provides quick access buttons for common commands and actions in Visual Studio like opening/saving files, building a project, debugging etc. It is located below the Menu Bar by default. Contains Icons that allows users to have quick access to various functionanlities
	3. **Solution Explorer** - The Solution Explorer displays the structure and contents of your project, solution or code file currently open in Visual Studio. It shows all files, references, dependencies etc. in a tree format.
	4. **Property Window** - The Property Window allows you to view and modify configurable properties and settings of any file, control or object currently selected in the Visual Studio designer or editor. For example, changing properties of a Button or Textbox on a Windows Form.
	5. **Toolbox**: Contains tools that user drag and drop to create user interfaces. Tools are grouped into general
	6. Error Pane: At the bottom of the window, shows the error that occurs during the execution of the program 
		1. Output: 

2. Differentiate between the Do While......Loop and Do.....Loop While Statement. 
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

3. Write a VB.Net program that counts integers from 1 to 100, using any repetition statement and counter variable x. Assume the variable x has been declared but not initialized. Print only five integers per line. (Hint: use the calculation x mod 5. When the value of this is 0, print a carriage return; otherwise, print a tab character. Call Console.WriteLine to output the carriage return and call Console.Write(vbTab) to output the tab character]
```vb
Module Program
Sub Main(args As String())
	Dim x as Integer
	Do While (x<=100)
	Console.Write(x)
	If(x Mod 5 > 0) Then 
		Console.Write(vbTab)
	Else
		Console.WriteLine()
	End If
	x+=1
	Loop
End Sub
End Module
```


4. In a tabular form, list 5 controls use in Visual Basic programming with their prefix and uses.
	
	| Control      | Prefix     | Uses                                                |
	|--------------|------------|------------------------------------------------------|
	| **Button**   | `btn`      | Represents a clickable button for user interaction.  |
	| **TextBox**  | `txt`      | Provides a box for user text input or display.       |
	| **Label**    | `lbl`      | Displays static text or labels for other controls.   |
	| **ComboBox** | `cbo`      | Combines a text box with a drop-down list of options.|
	| **DataGridView** | `dgv` | Displays and allows manipulation of tabular data.    |

5. Write a console application in Visual Basic that print elements in two dimensional array whose elements are {(1, 2, 3) , (7, 8, 9)} by row.
```vb
Module Program
	Sub Main(args As String())
		Dim array(,) As Integer
		array= {{1,2,3},{7,8,9}}
		Dim i,j As Integer
		Do While i < 2
			j = 0
			Do While j < 3
				Console.Write(array(i,j))
				Console.Write(vbTab)
				j+=1
			Loop
			Console.WriteLine()
			i+=1
		Loop
	End Sub
End Module 
```

6. List the six (5) string manipulating methods in VB.Net and their syntax.
	You can create string object using one of the following methods: 
1. By assigning a string literal to a String variable 
```vb
Dim hello As String = "Hello World"
```
2. By using a String class constructor
```vb
Dim hello As New String(New Char(){"H","e","l","l","o"}) 
```
3. By using the string concatenation operator + 
```vb
Dim first As String = "Hello" 
Dim second As String = "World" 
Dim fullName As String = first + second
Console.WriteLine(fullName)
```

4. By retrieving a property or calling a method that returns a string 
```vb
Dim todayDate As String = DateTime.Now.ToShortDateString()
Console.WriteLine(todayDate)
```
	
5. By calling a formatting method to convert a value or object to its string representation
```vb
Dim myInteger As Integer = 15
Dim stringInt As String = myInteger.ToString()
Console.WriteLine(stringInt)
```

7. Explain term exception in VB.
In Visual Basic (VB), an exception refers to an abnormal or unexpected event that occurs during the execution of a program and disrupts the normal flow of its instructions. Exceptions are often caused by errors or exceptional conditions that were not anticipated or handled by the developer in the code.

8.  Write a window application in VB that sum element of an array whose elements are [1,2,3,4,5,6,7,8,9,10]
```vb
Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim numbers() As Integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        ' Calculate the sum
        Dim sum As Integer
        Dim i As Integer
        Do While i < numbers.Length
            sum += numbers(i)
            i += 1
        Loop

        ' Display the result
        MessageBox.Show("The sum of the array elements is: " & sum.ToString(), "Sum Calculations")
    End Sub
End Class

```
9. **Explain five [5] features that make .NET a wonderful platform for developing modern applications.**
		- Boolean Conditions: Allows programmers to make decisions in their code based on true/false values.
		- Automatic Garbage collection: Frees up memory that is not being being used by the program. Without the programmer having to explicity do so
		- Standard Library: Provides a set or pre-written code that programmers can use in their applications
		- Delegate events management: Allows programmers to create and handle events in their applications enabling them to develop more responsive and interactive user interfaces. 
		- Conditional Compilation: allows programmers to compile their code differently depending on the target environment
		- Simple multithreading: allows programmers to write multithreaded applications that can take advantage of multiple cores. 
1. **Briefly discuss four characteristics of an Object-Oriented Programming Languages.**
	- Abstraction
	- Polymorphism
	- Encapsulation
	- Inheritance
2. Write a Visual Basic *statement* to accomplish each of the following:
	1. **Sum the odd integers between 1 and 99 using a while statement. Assume that the variables sum and count have been declared as an integer.**
	```vb
	Dim sum As Integer
	Dim count As Integer
	While count < 100
		If count Mod 2 = 1 Then
			sum += count
		End If
		count += 1
	End While
	Console.WriteLine("sum: " & sum)
	```
	2. **Sum the squares of even integer between 1 and 15 using a Do While........loop repetition statement. Assume that the integer variables sum and count have been declared and initialized to 0 and 2, respectively.**
	```vb
	Dim sum As Integer
	Dim count As Integer = 1
	Do While count < 15 
		If count Mod 2 = 0 Then
			sum += count ^ 2	
		End If
		count +=1
	Loop
		Console.WriteLine(sum)
	```

	3. **Print the numbers from 20 to 1 to the MessageBox using a Do until...........loop and Integer counter Variable counterlndex. Assume that the variable counter index is initialized to 20.**

```vb
Dim condtion As Boolean = False
Dim counterIndex As Integer = 20

Do Until condtion
	MessageBox.Show(counterIndex)
	If counterIndex < 1  Then 
		condtion = True
	End If
	counterIndex -=1
Loop
```