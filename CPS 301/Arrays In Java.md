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
printing out values by looping
```Java
System.out.println("| Index | Values|");
for(i = 0; i < ages.length ; i++){
	System.out.println("| " + i + "    |" + ages[i]);
}
```

## Multi-dimentional Array

```Java
(variableType) (variablename)[row][column] = new int[rowCount][columnCount] 
int multiarry[][] = new int [3][3];

//or

int multi_array[][] = {{1,2,5},{6,8,9},{10,20,30}}
```

|  | col1 | col2 | col3 |
| ---- | ---- | ---- | ---- |
| row1 | 1 | 2 | 5 |
| row2 | 6 | 8 | 9 |
| row3 | 10 | 20 | 30 |

### Looping through multi-dimentional arrays
```Java
public class multidimentional{
    public static void main(String args[]){
        int multiArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0 ; i<mulitArray.length; i++){
            for(int j = 0 ; j<3;j++){
                System.out.printf("%d \t",multiArray[i][j]);
            }
            System.out.println("");
        }
    }
}
```

```Java
public class multiArray{
	public static void main(String args[]){
		int array1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int array2[][] = {{10,20,30},{40,60},{70}};
		System.out.println("Printing the first Array");
		displayArray(array1);
		System.out.println("Printing the second Array");
		displayArray(array2);
		
	}

	public static void displayArray(int theArray[][]){
		for(int i = 0 ; i<theArray.length; i++){
            for(int j = 0 ; j<theArray[i].length;j++){
                System.out.printf("%d \t",theArray[i][j]);
            }
            System.out.println("");
        }
	}
}
```