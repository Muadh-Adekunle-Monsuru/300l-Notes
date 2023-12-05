10/11/23

<mark style="background: #ABF7F7A6;"> "What is structured programming"</mark>


Breaks a program into different logical sections called modules, in such a way to minimize the complexity of the programs. It is also called modular programming. It's essence is to reduce the complexity of the program.

It makes debugging a program easier, as the lines of code is shortened. 

---
17/11/23
## Characteristic of Structured Program Modules
- A structured program module must have a label or a name.
- Each program module must perform only one specific task.
- It must be able to complete that task before continuing.
- The program should have one entry point and exit point  (Pipeline Structure)
- Must be independent, from other modules. 

## Ways of Designing Computer Program (Assignment)
- Top-down Approach
- Bottom-up Approach 

## Criteria of Judging a Computer Program
- **Solvability:** Does it solve the problem efficiently 
- **Workability:** Ability to accommodate and handle errors. So that the program works under any and all conditions. 
- **Sufficient Information:** Is the program well documented, both internally and externally. 
- **Logically Written**: Is the program broken down into small modules each module handling a different logic. 


---
# Paradigms of Structured Programming

Structured programming is categorized into two main paradigms:

## Procedural/Process Oriented Programming (POP)
In POP, the programming approach involves writing a sequence of instructions for the computer to follow. These instructions are organized into groups, often referred to as functions. The problem is viewed as a sequence of tasks, and functions are created to accomplish these tasks.

The primary <mark style="background: #FFB86CA6;">emphasis is on writing instructions</mark> to complete the task, with relatively less attention given to the data. Examples of POP languages include COBOL, FORTRAN, and C.

### Characteristics of POP
- Function-oriented
- Most functions share global data
- Data moves openly
- Functions transform data from one form to another

[[Functions.canvas|Functions]]

## Object Oriented Programming (OOP)
OOP is an approach that modularizes programs by creating memory areas for both data and methods, serving as templates for creating copies of such modules on demand. An object, in OOP, is a memory area that stores data and a set of operations to access that data.

The emphasis in OOP is on data, where programs are divided into classes, and data structures characterize the objects. Methods that operate on the data are tied to the object, enabling communication between objects. OOP promotes reusability.

### Key Concepts of OOP

- **Class:** A class serves as a template for an object.
- **Object:** An object is an instance of a class.
- **Variables:** Variables defined within a class are referred to as instance variables.
- Classes can have relationships with other classes.

## Benefits of OOP

- **Modularity:** Source code for an object can be written and maintained independently of other objects. Once created, an object can be easily passed around within the system.
- **Information Hiding:** Interaction occurs only through methods, keeping the internal implementation details hidden.
- **Code Reuse:** Existing objects can be utilized in a program.
- **Ease of Debugging & Pluggability:** Problematic objects can be replaced with different objects, facilitating debugging and modification.

---


---
*24/11/23*

Types of classes in Java
Executatble: class that will always give results. 
non-executable
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