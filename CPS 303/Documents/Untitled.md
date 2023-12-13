1. Write a program to ask the user what 24+9 is. Say “Excellent” if they get it right.
```vb.net
Imports System
Module Program 
	Sub Main(args As String())
	Dim userInput As Integer 
	Console.WriteLine("What is 24+9")
	userInput = Int(Console.ReadLine())
		If userInput = 33
			Console.WriteLine("Excellent")	
		Else
			Console.WriteLine("Wrong Answer")
		End If
	End Sub
End Module
```

2. Write a program to ask the user for two numbers. Compare the first with the second and then print out one of three messages. Either the numbers are equal, the first is bigger, or the second is bigger. You will need more than one IF to solve this one

```vb.net
Imports System
Module Program
	Sub main(args As String())
		Dim num1, num2 As Integer
		Console.WriteLine("input number 1:")
		num1 = Int(Console.ReadLine())
		Console.WriteLine("input number 2:")
		num2 = Int(Console.ReadLine())

		If (num1 = num2) Then
			Console.WriteLine("They are equal ")
		Else If(num1>num2)
			Console.WriteLine(num1 & " is greater than " & num2)
		Else
			Console.WriteLine(num2 & " is greater than " & num1)
		End If
	End Sub
End Module
```

3. Write a program which asks the user to enter their password. If they enter the word “PASSWORD” then display the message “Welcome to the treasure”, otherwise display a message which says “go away, it’s all mine”.

```vb.net
Imports System
Module Program
	Sub main(args As String())	
		Console.WriteLine("What is your password")

	Dim passcode As String = String(Console.ReadLine())
	If passcode = "PASSWORD" Then
		Console.WriteLine("Welcome to the treasure")
	Else
		Console.WriteLine("Go away, its all mine")
	End Sub

End Module
```