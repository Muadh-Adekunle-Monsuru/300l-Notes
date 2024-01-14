https://learn.microsoft.com/en-us/dotnet/visual-basic/programming-guide/language-features/objects-and-classes/

The main difference between classes and modules is that classes can be instantiated as objects while standard modules cannot.

An _object_ is a combination of code and data that can be treated as a unit. An object can be a piece of an application, like a control or a form. An entire application can also be an object.

Each object in Visual Basic is defined by a _class_. A class describes the variables, properties, procedures, and events of an object. Objects are instances of classes; you can create as many objects as you need once you have defined a class.

To understand the relationship between an object and its class, think of cookie cutters and cookies. The cookie cutter is the class. It defines the characteristics of each cookie, for example size and shape. The class is used to create objects. The objects are the cookies.

1. Define the class
```vb.net
Public Class Customer
	Public Property AccountNumber As Integer
End Class
```
2. Write a DIM statement to create a variable, which would be an instance of the class. Hence an Object
```vb.net
Dim nextCustomer As Customer = New Customer;
```
3. You can now access the memebers of the class 
```vb.net
nextCustomer.AccountNumber = lastAccountNumber + 1
```


```vb.net
Module Program
	Sub Main(args As String())
		Dim Person1 As New Person()
		Console.WriteLine(Person1.myName)

	End Sub
	Public Class Person
		Public myName As String = "Muadh"
	End Class
End Module
```


```vb
Imports System  
Module My_program  
    Sub Main()  
        Dim rect As Rectangle = New Rectangle() 'create an object  
        Dim rect2 As Rectangle = New Rectangle() 'create an object  
        Dim area, para As Integer  
  
        'rect specification  
        rect.setLength = (5)  
        rect.setBreadth= (6)  
  
        'rect2 specification  
        rect2.setLength = (5)  
        rect2.setBreadth = (10)  
  
        'Area of rectangle   
        area = rect.length * rect.Breadth  
        'area = rect.GetArea()  
        Console.WriteLine(" Area of Rectangle is {0}", area)  
  
        'Parameter of rectangle   
        'para = rect.GetParameter()  
         para = 2 (rect2.length + rect.Breadth)  
        Console.WriteLine(" Parameter of Rectangle is {0}", para)  
        Console.WriteLine(" Press any key to exit...")  
        Console.ReadKey()  
    End Sub  
    Public Class Rectangle  
        Public length As Integer  
        Public Breadth As Integer  
  
        Public Sub setLength(ByVal len As Integer)  
            length = len  
        End Sub  
  
        Public Sub setBreadth(ByVal bre As Integer)  
            Breadth = bre  
        End Sub  
        Public Function GetArea() As Integer  
            Return length * Breadth  
        End Function  
  
        Public Function GetParameter() As Integer  
            Return 2 * (length + Breadth)  
        End Function  
    End Class  
End Module  
```


```vb
Module mybox
   Class Box
      Public length As Double   ' Length of a box
      Public breadth As Double  ' Breadth of a box
      Public height As Double   ' Height of a box
   End Class
   Sub Main()
      Dim Box1 As Box = New Box()        ' Declare Box1 of type Box
      Dim Box2 As Box = New Box()        ' Declare Box2 of type Box
      Dim volume As Double = 0.0         ' Store the volume of a box here
      
      ' box 1 specification
      Box1.height = 5.0
      Box1.length = 6.0
      Box1.breadth = 7.0
      
      ' box 2 specification
      Box2.height = 10.0
      Box2.length = 12.0	
      Box2.breadth = 13.0
      
      'volume of box 1
      volume = Box1.height * Box1.length * Box1.breadth
      Console.WriteLine("Volume of Box1 : {0}", volume)
      
      'volume of box 2
      volume = Box2.height * Box2.length * Box2.breadth
      Console.WriteLine("Volume of Box2 : {0}", volume)
      Console.ReadKey()
   End Sub
End Module
```