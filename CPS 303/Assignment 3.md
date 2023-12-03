1. Read about 
- loop continuation statement
- Counter control variable
- sentinel 

1. **Loop Continuation Statement:**
   - A loop continuation statement is used to control the flow of a loop by either continuing with the next iteration or exiting the loop prematurely based on a certain condition.
   - In VB.NET, the `Continue` statement is commonly used for this purpose. It allows you to skip the rest of the loop body and move on to the next iteration.

   Example:
   ```vb.net
   For i As Integer = 1 To 10
       If i = 5 Then
           Continue For ' Skips the rest of the loop body for i=5
       End If
       ' Loop body code here
   Next
   ```

2. **Counter Control Variable:**
   - The counter control variable is a variable used to control the number of iterations in a loop.
   - It is often employed as a loop index or counter that is incremented or decremented during each iteration to determine when the loop should start or stop.
   - In a `For` loop in VB.NET, the counter control variable is defined within the loop statement and automatically incremented or decremented.

   Example:
   ```vb.net
   For i As Integer = 1 To 5
       ' Loop body code here
   Next
   ```
   Here, `i` is the counter control variable.

3. **Sentinel:**
   - A sentinel in programming, particularly with loops, is a special value used to signal the end of input or a condition that determines when to terminate the loop.
   - Sentinels are often employed in loops where the exact number of iterations is not known beforehand, and the loop should continue until a specific condition is met.

   Example:
   ```vb.net
   Dim userInput As String = ""
   
   Do While userInput <> "exit"
       Console.Write("Enter a value (type 'exit' to end): ")
       userInput = Console.ReadLine()
       ' Loop body code here
   Loop
   ```
   Here, "exit" is the sentinel value. The loop continues until the user enters "exit."
   
2. Write syntax and give approprite example, printing the first power of three greater than 100. Once the power of three is greater than 100 then it stops loop

	1. While statement
	2. Do while loop 
	3. Do until loop
	4. Do loop until 
	5. For Next
	6. Select ... case

1. **While Statement:**
   ```vb.net
   While condition
       ' Code to be executed while the condition is true
   End While
   ```
```vb.net
  Dim condition As Boolean = True
  Dim power As Integer = 3
  Dim i As Integer = 1
  While condition
      power = 3 ^ i
      i += 1
      If (power > 100) Then
          condition = False
      Else
          Console.WriteLine("Power:" & power)
      End If
  End While
```
2. **Do While Loop:**
   
   ```vb.net
   Do While condition
       ' Code to be executed while the condition is true
   Loop
   ```
```vb.net
Dim condition As Boolean = True
Dim power As Integer = 3
Dim i As Integer = 1
Do While condition
    power = 3 ^ i
    i += 1
    If (power > 100) Then
        condition = False
    Else
        Console.WriteLine(power)
    End If
Loop
```
3. **Do Until Loop:**
   
   ```vb.net
   Do Until condition
       ' Code to be executed until the condition is true
   Loop 
   
Dim condition As Boolean = False
 Dim power As Integer = 3
 Dim i As Integer = 1
 Do Until condition
     power = 3 ^ i
     i += 1
     If (power > 100) Then
         condition = True
     Else
         Console.WriteLine(power)
     End If
 Loop
   ```

4. **Do Loop Until:**
   
   ```vb.net
   Do
       ' Code to be executed at least once
   Loop Until condition
   
Dim condition As Boolean = False
Dim power As Integer = 3
Dim i As Integer = 1
Do
    power = 3 ^ i
    i += 1
    If (power > 100) Then
        condition = True
    Else
        Console.WriteLine(power)
    End If
Loop Until condition
   ```

5. **For Next Loop:**
   
   ```vb.net
   For counter As Integer = startValue To endValue Step stepValue
       ' Code to be executed in each iteration
   Next
   
        For i As Integer = 1 To 4 Step 1
            power = 3 ^ i
            Console.WriteLine(power)
        Next
   ```

6. **Select Case:**
   
   ```vb.net
   Select Case expression
       Case value1
           ' Code to be executed if expression equals value1
       Case value2
           ' Code to be executed if expression equals value2
       ' ...
       Case Else
           ' Code to be executed if none of the above cases are true
   End Select


        For i As Integer = 1 To 4 Step 1
            Select Case i
                Case 1
                    power = 3 ^ 1
                    Console.WriteLine(power)
                Case 2
                    power = 3 ^ 2
                    Console.WriteLine(power)
                Case 3
                    power = 3 ^ 3
                    Console.WriteLine(power)
                Case 4
                    power = 3 ^ 4
                    Console.WriteLine(power)
                Case Else
                    Console.WriteLine(power)
                    End
            End Select
        Next
   ```

