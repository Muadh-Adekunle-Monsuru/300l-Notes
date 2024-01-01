Write a program To print Each elements Of a 5 by 2 array Then sum them all together


```vb
Imports System

Module Program
    Sub Main(args As String())
        Dim myArray(,) As Integer = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}
        Dim i, j As Integer
        i = 0
        Dim sum As Integer = 0
        Do While i <= 1
            j = 0
            Do While j <= 4
                Console.WriteLine("For i: " & i & " & j: " & j & " = " & myArray(i, j))
                sum += myArray(i, j)
                j += 1
            Loop
            i += 1
        Loop
        Console.WriteLine("The sum is:" & sum)

    End Sub
End Module


```