```vb

Imports System.Data.SQLite

Public Class Form1
    Dim connectionString As String = "Data Source=libraryinfo.SQlite;Version=3;"

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim matricNo As String = matric_no.Text
        Dim firstName As String = first_name.Text
        Dim lastName As String = last_name.Text
        Dim department As String = departmentInput.Text
        Dim level As Integer = levelInput.Text
        Dim phoneNumber As String = phone_number.Text
        Dim email As String = emailInput.Text
        InsertValues(matricNo, firstName, lastName, department, level, phoneNumber, email)

    End Sub

    Private Sub InsertValues(matricNo As String, firstName As String, lastName As String, department As String, level As Integer, phoneNumber As String, email As String)
        Try
            Using connection As New SQLiteConnection(connectionString)
                connection.Open()

                ' Check if the table exists, create it if not
                Dim createTableQuery As String = "CREATE TABLE IF NOT EXISTS Students (matric_no VARCHAR(20) PRIMARY KEY, first_name VARCHAR(20), last_name VARCHAR(20), department VARCHAR(20), level INTEGER, phone_number VARCHAR(20),email VARCHAR(20));"
                Using createTableCommand As New SQLiteCommand(createTableQuery, connection)
                    createTableCommand.ExecuteNonQuery()
                End Using


                Dim insertQuery As String = "INSERT INTO Students (matric_no,first_name,last_name,department,level,phone_number,email) VALUES (@matric_no,@first_name,@last_name,@department,@level,@phone_number,@email);"
                Using insertCommand As New SQLiteCommand(insertQuery, connection)
                    insertCommand.Parameters.AddWithValue("@matric_no", matricNo)
                    insertCommand.Parameters.AddWithValue("@first_name", firstName)
                    insertCommand.Parameters.AddWithValue("@last_name", lastName)
                    insertCommand.Parameters.AddWithValue("@department", department)
                    insertCommand.Parameters.AddWithValue("@level", level)
                    insertCommand.Parameters.AddWithValue("@phone_number", phoneNumber)
                    insertCommand.Parameters.AddWithValue("@email", email)
                    insertCommand.ExecuteNonQuery()
                End Using
            End Using

            MessageBox.Show("Data updated successfully.", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information)
        Catch ex As Exception
            MessageBox.Show($"An error occurred: {ex.Message}", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)

        End Try
    End Sub
End Class

```