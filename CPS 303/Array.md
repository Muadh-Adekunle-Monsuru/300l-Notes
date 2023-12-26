An array stores a fixed size sequential collection of data items of the same data types stored contiguously. 

Declaring an Array

```vb.net
	Dim MyArray() As Integer. 'one dimentional array' 
	Dim MyArray(,) As Integer. 'two dimentional array' 
	Dim MyArray(4) As Integer. 'one dimentional array lebght of 4' 

	Dim MyArray(4) As Integer = {1,2,3,4}
	MyArray(2) = 3
```


Declare and array called names and give it the names of your classmates
```vb.net
	Dim names(3) As String = {"Idris","Abayomi","Fernami"};
	
	Dim names() As String;
	names() = {"Abdulsalam","Ismail","Taofeeq"};
```

Two dimentional array of type integer

```vb.net

Dim ages(5,4) As Integer = {{1,2,3,4,5},{4,5,6,7}};
```