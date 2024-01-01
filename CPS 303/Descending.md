```vb
Imports System

Module Program
    Sub Main(args As String())
        ' Prompt user for the number of lines
        Console.WriteLine("How many lines")
        Dim totalLines As Integer = Int(Console.ReadLine)

        ' Loop to print a pattern based on user input
        For currentLine = 1 To totalLines Step 1
            Dim numbersCount As Integer = 1
            Dim asterisksCount As Integer = totalLines - currentLine

            ' Print numbers in ascending order
            While (numbersCount <= currentLine)
                Console.Write(numbersCount)
                numbersCount += 1
            End While

            ' Print asterisks in descending order
            Do While asterisksCount > 0
                Console.Write("*")
                asterisksCount -= 1
            Loop

            ' Move to the next line for the next iteration
            Console.WriteLine("")
        Next
    End Sub
End Module


```