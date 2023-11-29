Imports System
Imports System.Threading

Module Program
    Sub Main()
        Dim colors() As ConsoleColor = {ConsoleColor.Red, ConsoleColor.DarkYellow, ConsoleColor.Yellow, ConsoleColor.Green, ConsoleColor.Blue, ConsoleColor.DarkBlue, ConsoleColor.Magenta}
        Dim text As String = "Rainbow"

        While True
            For Each color In colors
                Console.ForegroundColor = color
                Console.WriteLine(text)
                Thread.Sleep(500)
            Next
        End While
    End Sub
End Module