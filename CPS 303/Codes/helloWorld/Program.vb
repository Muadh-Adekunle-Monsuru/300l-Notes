Imports System

'Module Program'
'Sub Main(args As String())'
'Console.WriteLine("Hello World!")'
'End Sub'
'End Module'


'Public Class Rectangle '
'Private length As Double'
'Private width As Double '
'Public Sub AcceptDetails()'
'length = 4.5'
'width = 3.5'
'End Sub'
'Public Sub Display()'
'Console.WriteLine("Length: {0}", length)'
'Console.Write("Width: {0}", width)'
'End Sub'
'    Shared Sub Main()'
'Dim r As New Rectangle'
'r.AcceptDetails()'
'r.Display()'
'Console.ReadLine()'
'End Sub'
'End Class'
'Module variableData'
'Sub Main()'
'Dim a As Short'
'Dim b As Integer'
'Dim c As Double'
'b = 20'
'c = a + b'
'Console.Write("a = ")'
'a = Console.ReadLine'
'Console.WriteLine()'
'Console.WriteLine("a is {0}", a)'
'Console.WriteLine("a = {0},b={1}, c= {2}", a, b, c)
'Console.ReadLine()
'End Sub
'End Module


Module Module1
    Sub Main()
        Console.WriteLine("First line")
        Console.ReadKey()
        Console.ForegroundColor = ConsoleColor.Red
        Console.WriteLine("But then the color changes to red")
        Console.ReadKey()
        Console.BackgroundColor = ConsoleColor.White
        Console.Writeline("The background changes to white")
        Console.ReadKey()
        Console.ResetColor()
        Console.WriteLine("We can reset it")
        Console.ReadKey()
        Console.ForegroundColor = ConsoleColor.Yellow
        Console.BackgroundColor = ConsoleColor.Yellow
        Console.WriteLine("THe order is important")
        Console.ReadKey()
        Console.ForegroundColor = ConsoleColor.White
        Console.WriteLine("Another Color")
        Console.ReadKey()
    End Sub
End Module