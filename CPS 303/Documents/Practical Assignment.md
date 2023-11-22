[21/11/23]
Monsuru Muadh Adekunle
FUO/22/0353
Question 1: **To calculate the area of a circle for given radius using console application**

```vb
Module Module1
    Sub Main()
        Dim r, area As Double

        Console.Write("Enter Radius:")
        r = Console.ReadLine()

        area = 3.14 * r * r

        Console.Write("Area of Circle:")
        Console.WriteLine(area)

        Console.ReadKey()
    End Sub
End Module

```

Question 2: **To calculate area of triangle using window application.** 

```vb
Public Class Form1
    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        End ' Not sure if this line is intended, as it currently just ends the Sub.
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim b, h, area As Double
        b = Val(TextBox1.Text)
        h = Val(TextBox2.Text)
        area = 0.5 * b * h
        TextBox3.Text = Str(area)
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox1.Focus()
    End Sub
End Class

```

Question 3: **To convert currency values using window application**.

```vb
Public Class Form
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim v, res, val1, val2 As Double

        If ComboBox1.SelectedItem = "Rupee" Then
            val1 = 1.0
        ElseIf ComboBox1.SelectedItem = "Dollar" Then
            val1 = 67.5
        ElseIf ComboBox1.SelectedItem = "Euro" Then
            val1 = 73
        End If

        If ComboBox2.SelectedItem = "Rupee" Then
            val2 = 1.0
        ElseIf ComboBox2.SelectedItem = "Dollar" Then
            val2 = 67.5
        ElseIf ComboBox2.SelectedItem = "Euro" Then
            val2 = 73
        End If

        v = Val(TextBox1.Text)
        res = v * val1 / val2
        TextBox2.Text = Str(res)
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox1.Focus()
    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        End ' Not sure if this line is intended, as it currently just ends the Sub.
    End Sub
End Class

```

Question 4: **SALARY CALCULATION USING WINDOW APPLICATION**

```vb
Public Class Form1
    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        End ' Not sure if this line is intended, as it currently just ends the Sub.
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""
        TextBox6.Text = ""
        TextBox7.Text = ""
        TextBox8.Text = ""
        TextBox9.Text = ""
        TextBox1.Focus()
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim bp, hr, cc, ta, gp, pf, lic, td, np As Double

        bp = Val(TextBox1.Text)
        hr = Val(TextBox2.Text)
        cc = Val(TextBox3.Text)
        pf = Val(TextBox6.Text)
        lic = Val(TextBox7.Text)
        ta = hr + cc
        gp = bp + ta
        td = pf + lic
        np = gp - td

        TextBox4.Text = Str(ta)
        TextBox5.Text = Str(gp)
        TextBox8.Text = Str(td)
        TextBox9.Text = Str(np)
    End Sub
End Class

```

Question 5: **RETREIVE IMAGES USING COMBOBOX AND BUTTON**

```vb
Public Class Form1
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Try
            Select Case ComboBox1.SelectedIndex
                Case 0
                    PictureBox1.Image = Image.FromFile("C:\Users\sbca177\Desktop\s1.jpg")
                Case 1
                    PictureBox1.Image = Image.FromFile("C:\Users\sbca177\Desktop\s2.jpg")
                Case 2
                    PictureBox1.Image = Image.FromFile("C:\Users\sbca177\Desktop\s3.jpg")
                Case 3
                    PictureBox1.Image = Image.FromFile("C:\Users\sbca177\Desktop\s4.jpg")
                Case 4
                    PictureBox1.Image = Image.FromFile("C:\Users\sbca177\Desktop\s5.jpg")
                Case Else
                    ' Handle unexpected index, e.g., display a default image or show an error message.
            End Select
        Catch ex As Exception
            ' Handle exceptions, e.g., display an error message or log the exception.
            MessageBox.Show("Error loading image: " & ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)
        End Try
    End Sub
End Class

```


Question 6: **SIMULATE A PAINT BRUSH APPLICATION**

```vb
Public Class Form1
    Dim mybrush
    Dim down As Boolean

    Private Sub PictureBox1_MouseDown(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles PictureBox1.MouseDown
        down = True
    End Sub

    Private Sub PictureBox1_MouseMove(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles PictureBox1.MouseMove
        If down = True Then
            PictureBox1.CreateGraphics.FillEllipse(mybrush, e.X, e.Y, 10, 10)
        End If
    End Sub

    Private Sub PictureBox1_MouseUp(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles PictureBox1.MouseUp
        down = False
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        mybrush = Brushes.Black
        down = False
    End Sub

    Private Sub Button2_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button2.Click
        mybrush = Brushes.Gray
    End Sub

    Private Sub Button3_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button3.Click
        mybrush = Brushes.Red
    End Sub

    Private Sub Button4_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button4.Click
        mybrush = Brushes.Blue
    End Sub

    Private Sub Button5_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button5.Click
        mybrush = Brushes.Yellow
    End Sub

    Private Sub PictureBox1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PictureBox1.Click
        ' This event handler is empty. You might consider removing it if not used.
    End Sub
End Class

```