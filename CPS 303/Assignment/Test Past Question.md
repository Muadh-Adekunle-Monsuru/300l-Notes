1. Briefly discuss 4 characteristics of an object-oriented programming language
2. What makes VB.NET an object oriented language
3. What are the components and services provided by common language runtime
4. What is the effect of Try....Catch in VB.Net program and give a typical example
5. Is VB.NET backward compatible with VB6
6. Using VS, describe the steps involved in creating, compiling and executing a program application
7. Write a vb.net program to compare if the content of two strings is the same
8. List 10 controls and their functions in a visual studio environment
9. In tabular form, specify the prefix for the naming and functions of each of the following controls. a) TextBox b) Label c) Button d) CheckBox
10. Differentiate between the Do While .... Loop and Do.....Loop While statement
11.  Write a VB.Net program that counts even integers from 1 to 100, using any repetition statement and counter variable x. Assume the variable x has been declared but not initialized. Print only five integers per line. (Hint: use the calculation x mod 5. When the value of this is 0, print a carriage return; otherwise, print a tab character. Call Console.WriteLine to output the carriage return and call Console.Write(vbTab) to output the tab character]
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
	x+=2
	Loop
End Sub
End Module
```