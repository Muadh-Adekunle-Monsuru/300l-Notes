## Writing Java Programs

starts with `class` or `public class` followed by `className`
then the `{ }` which begins and ends the scope of the class
declare and define all instance variables
declare a method, `public static void main(string args[])`
static: means that the method being defined applies to the class itself rather than to the objects of the class.
```Java
class [classname]
{
	instance variable 1;
	instance variable2;
	String name = 'Quardi' 

public static void main(string args[]){
			System.out.printLn("Welcome to Java class"+name) //prints on newline
					
}
}
```

---
2/12/23
## Data Types & Variables

**Data types in Java:**
- Byte
- Short
- Int
- Long
- Float
- Double
- Char
- Boolean

**Four groups:**
-  **Integers**
	- Byte
	- Short
	- Int
	- Long
 - **Floating Point**
	 - Float
	 - Doubt
- **Character** 
	- Char
- **Boolean**
	- Boolean

### Variable
A variable is a basic unit of storage used to hold data. 
Using a combination of `identifier`, `type` and `value [optional]` all braces has a scope which defined their visibility and their lifetime 

```Java
String ourClass = "CPS 301";
```


**Elementary Operators**
- *
- -
- +
- /
- %


Automatic Conversion
A automatic type conversion takes place in Java if one type of data is assigned to another type of variable, it happens if the following two conditions are met:
- The two types are compatible
- The destination type is larger than the source type

When the two conditions are met a widening conversion takes place. For example, the int type is always large enough to hold all valid byte types

general form
```Java
(target-type) value;
```
target-type specifies the desired type to convert the specified value to.

```Java
int a;
byte b;

b = (byte) a
```


```Java
byte b;
Integer i = 257;
Double d = 323.142

b = (Byte) i;
i = (Integer) d;
b = (Byte) d 
```

Implement a Calculator:
```Java
//Program to implement a simple calculator
public class calculator{
	public static void main(String args[]){
		Integer num1 = 300, num2 =40;
		Integer sum,difference, division, product, modulo;
		sum = num1 + num2;
		difference = num1 - num2;
		division = num1 / num2;
		product = num1 * num2;
		modulo = num1 % num2;
		System.out.println("Addition:"+ sum);
		System.out.println("Subtraction:" + difference );
		System.out.println("Multiplication:" + product);
		System.out.println("Division:" + division);
		System.out.println("Modulo:" + modulo );
	}
} 
```

---
## Scanner
used to accept inputs from users

It will take **string** input from the user
```Java
	  Scannner sc=new Scanner(System.in); //The variable that would hold the value that user is typing 
	  String name=sc.nextLine();
	  System.out.println(name);
```

It will take **integer** input from the user

```Java
	  Scannner sc=new Scanner(System.in);
	  int x=sc.nextInt();
	  System.out.println(x);
```

It will take **float** input from the user
```Java
	  Scannner sc=new Scanner(System.in);
	  int x=sc.nextFloat();
	  System.out.println(x);

```

It will take **double** input from the user
```Java
	  Scannner sc=new Scanner(System.in);
	  double x=sc.nextDouble();
	  System.out.println(x);
}
```
