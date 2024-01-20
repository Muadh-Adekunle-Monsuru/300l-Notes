It is a single variable that is used to store multiple values of the same data type. A group of like type variable that are referred to by a common name. Array of any type can be created and may have one or more dimensions. A specific element in an Array is accessed by its index, subscript. 

# One Dimensional
A one-dimensional array is a list of like type variables
Declaration of an array
```Java
	[datatype] [arrayname][] = new [datatype][numberofelements]
	int ages[] = new int[2];
```
Method 2
```Java
int score[] = {12,19,30};
```


Initialize an array:
```Java
	ages[0] = 12;
	ages[1] = 19;
```
 printing out the values
 ```Java
 System.out.println(ages[i]);
 //prints out 19
```

```Java
System.out.println("| Index | Values|");
for(i = 0; i < ages.length ; i++){
	System.out.println("| " + i + "    |" + ages[i]);
}
```