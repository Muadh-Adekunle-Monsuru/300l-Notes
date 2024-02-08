
1. Discuss the fundamental idea in Structured programming? 
	- Structured programming revolves around organizing a program into manageable, logical structures or modules. The primary goal is to enhance readability, maintainability, and efficiency by breaking down the code into smaller, comprehensible units. This approach minimizes complexity, making it easier to understand, debug, and modify code. Structured programming enforces clear control flow through constructs like loops and conditionals, promoting a systematic and disciplined design that contributes to the overall efficiency of software development.
1. Explain the following concepts with reference to Java Programming language:
	1. Modularity: 
		- In Java, modularity refers to the practice of breaking down a program into independent, reusable modules or components. This enhances maintainability and encourages the development of scalable applications. Java achieves modularity through features like packages, which organize related classes into logical units.
	1. public static void main (String args[]): 
			This line represents the entry point of a Java program. In Java, the `main` method serves as the starting point for execution. It must be declared as `public`: method is accessible from anywhere even outside the class it was defined, `static`: means it belongs to the class itself not individual objects of the class, and `void`: means it doesnt return any value, and it takes an array of strings (`String args[]`) as parameters. This method is where the program begins its execution and is crucial for running Java applications
	1. Classes 
			In Java, a class is a blueprint for creating objects. It defines the attributes (fields) and behaviors (methods) that the objects will have. Objects are instances of classes, and they encapsulate data and functionality. Classes provide a way to structure and model real-world entities in a program.
	1.  Constructor:
			A constructor in Java is a special method that gets invoked when an object is instantiated. It initializes the object's state by assigning values to its attributes. Constructors have the same name as the class and do not have a return type. They play a key role in creating objects with specific initializations.
	1. Array:
			Arrays in Java are used to store multiple values of the same type in a single variable. They provide a way to work with collections of data efficiently. Arrays are declared with a specified size and can hold elements of primitive types or objects. They offer a convenient means to manage and manipulate data in a structured manner.
			
1. Write a Java program to implement a simple calculator.
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

2. Java referred to as the 'Platform Independent Programming Language. What advantage does this have to the programmer?
	1. Java is often referred to as a 'Platform Independent Programming Language' because of its ability to run on any device or platform that has a Java Virtual Machine (JVM). This provides several advantages to programmers:
	- **Write Once, Run Anywhere (WORA):** Java code can be written on one platform and executed on any other platform with a compatible JVM. This eliminates the need to rewrite the code for each specific platform, saving time and effort.
	    
	- **Portability:** Java programs can be easily transferred between different systems without modification, as long as there's a JVM available for the target platform.
	    
	- **Consistency:** The consistent behavior across different platforms ensures that Java applications behave predictably, reducing the likelihood of platform-specific bugs.
	    
	- **Compatibility:** Java's platform independence fosters compatibility, making it easier to distribute and share software across a diverse range of devices and operating systems.
3. What do you understand by the following terms?
	1. Variable casting: Variable casting refers to the process of converting a variable from one data type to another. In Java, this can be done implicitly (automatic conversion) when there is no loss of information or explicitly (manual conversion) when there may be a loss of precision.
	2. Parameter: A parameter in Java is a variable that is passed to a method during a method call. Parameters are used to provide input to a method, allowing it to perform a specific action or computation based on the provided values.
	3. Encapsulation: Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts. It involves bundling the data (attributes) and methods (functions) that operate on the data into a single unit known as a class. Encapsulation helps in hiding the internal details of an object and protecting its integrity.
	4. Access modifiers: Access modifiers in Java determine the visibility and accessibility of classes, methods, and variables. There are four types of access modifiers:
		- `public`: Accessible from anywhere.
		- `protected`: Accessible within the same package or subclasses.
		- `default` (no modifier): Accessible only within the same package.
		- `private`: Accessible only within the same class.
	1. Java Libraries:   
		Java libraries are pre-written collections of classes and methods that provide reusable functionality to Java programs. These libraries simplify common programming tasks and allow developers to leverage existing code to enhance the efficiency of their applications.
1. Perform the following tasks for an array table:
	1. Declare and create the array that contains 5 elements
	```java
		int[] myArray = {1, 2, 3, 4, 5};
	```
	1. Print the array table showing the index and the value at each index of the array
	```java
	
	for (int i = 0; i < myArray.length; i++) {
	    System.out.println(i + "\t" + myArray[i]);
	}
	
	```
	1. Sum up the elements in the array and print the sum.
	```java
	int sum = 0 ;	
	for (int i = 0; i < myArray.length; i++) {
		sum += myArray[i];
	}
	System.out.println("Sum of elements: "+ sum);
	
	```
1. Discuss the two Structured programming paradigm that you know, and expatiate on the significant and the drawbacks of both differences.
1. Procedural Oriented Programming: 
	Significant Aspects:
	1. **Emphasis on Procedures/Functions:** POP focuses on writing a sequence of instructions or procedures that the computer must follow to accomplish a task. These procedures are typically organized into functions.
	1. **Global Data Sharing:** In POP, functions often share global data, meaning data is accessible throughout the program. This can simplify data sharing but may lead to potential issues with data integrity and security.
	1. **Data Transformation:** Functions in POP primarily transform data from one form to another, and the main emphasis is on writing instructions.
	Drawbacks:
	1. **Limited Reusability:** Code reusability is limited as functions are typically tied to specific tasks, making it challenging to reuse code in different contexts.
	2. **Complexity as Programs Grow:** As programs become larger and more complex, maintaining and understanding procedural code can become challenging.
	3. **Difficulty in Code Maintenance:** Global data sharing can lead to difficulties in maintaining and debugging code, as changes in one part of the program may affect other parts.
1. Object Oriented Programming:
	Significant Aspects:
	1. **Modularity through Objects:** OOP focuses on modularity through the creation of objects, which encapsulate data and methods that operate on the data. Objects are instances of classes.
	2. **Data and Methods Binding:** In OOP, data and methods that operate on the data are bound together in a class. This encapsulation ensures that the internal workings of an object are hidden, promoting information hiding and security.
	3. **Code Reusability:** OOP promotes code reusability through the concept of inheritance, where a class can inherit attributes and behaviors from another class.
	Drawbacks:
	1. **Learning Curve:** OOP can have a steeper learning curve for some programmers, especially those transitioning from procedural programming paradigms.
	2. **Overhead in Small Programs:** In small programs, the overhead of creating classes and objects might be considered excessive compared to the simplicity of procedural code.
	3. **Performance:** In certain situations, the overhead of managing objects and their interactions can result in slightly lower performance compared to procedural code.

1. Assuming you are among the team working on a project called Result Computation System, and you are given the task to fix the error in the code snippet given to you below.
	![[Pasted image 20240104174547.png]]
	1. Correct the errors and write out the corrected code snippets
	```Java
	int[] score = new int[10];
	int total = 0;
	int i;
	for(i=0;i<10;i++){
		if(score[i] % 2 == 0 ){
			total += score[i];	
		}	
	}
	```
	1. Summarize what the program is doing.
			- An array is declared 
			- Variables total and i are declared
			- For loop which runs 10 times
			- if statement checks if the current value of score is even
			- If even the score value is added to the total
	2. Suppose the following data were supplied to the program 65, 67, 68, 52, 64, 70, 63, 76, 52, 44, what will be the final output from the program?
			`68 + 52 + 64 +70 + 76 + 52 + 44 = 426`
			Output  = 426
	
9. "To see it right, set it right". Discuss this assertion with reference to good programming style.
	1. **Readability:**
	    - **See it Right:** Code should be readable and easily comprehensible. A programmer should be able to understand the code by simply looking at it.
	    - **Set it Right:** Setting it right involves writing code in a clear and organized manner. Proper indentation, meaningful variable/method names, and logical structure contribute to readability.
	2. **Maintainability:**
	    - **See it Right:** Understanding the code is essential for making modifications or fixing bugs. A programmer needs to "see" the logic and structure correctly.
	    - **Set it Right:** Setting it right means creating code that is modular and follows best practices. This includes using functions, classes, and organizing code in a way that facilitates easy maintenance.
		
	- **Meaningful Naming:** Use descriptive and meaningful names for variables, functions, and classes. This enhances understanding.
    
	- **Consistent Formatting:** Maintain a consistent and clear code formatting style. Proper indentation and alignment contribute to readability.
    
	- **Comments and Documentation:** Include comments to explain complex logic or any part of the code that might not be immediately obvious. Provide documentation for functions and classes.
    
	- **Modularity:** Break down code into modular components. Each function or class should have a single responsibility, making the codebase easier to understand and maintain.
    
	- **Avoiding Redundancy:** Eliminate redundant code and follow the DRY (Don't Repeat Yourself) principle. Reusable functions or constants should be defined.
1. A Fountain University staff bought a good worth N30000 from FUOCICS with a profit of 5% of the goods he bought. He pays N2000 at the end of each month. The amount he owes at the end of each month is calculated thus:
		AM = P+ (5 / 100 • P)2000
		where P = Principal amount left to be paid.
	1. Write a program that will print the amount he owes each month and the number of months it will take him to pay all the debt.
	2. Give the analysis of your program.
11. Differentiate between the following:
	1. Local variables and Instance variables:
		1. **Local Variables:**
		    - **Scope:** Limited to the block or method in which they are declared.
		    - **Lifetime:** Exists only as long as the method or block is executing.
		    - **Access:** Not accessible outside the method or block.
		2. **Instance Variables:**
		    - **Scope:** Belong to the instance of the class.
		    - **Lifetime:** Persists as long as the object of the class exists.
		    - **Access:** Accessible throughout the class. Each object has its own copy.
	1. Java and FORTRAN programming language
		1. **Java:**
		    - **Paradigm:** Object-oriented.
		    - **Memory Management:** Automatic (Garbage Collection).
		    - **Syntax:** C-based syntax.
		    - **Platform:** Platform-independent (compiled to bytecode).
		2. **FORTRAN:**
		    - **Paradigm:** Procedural.
		    - **Memory Management:** Manual (Programmer manages memory).
		    - **Syntax:** Fortran-specific syntax.
		    - **Platform:** Historically platform-dependent, though modern versions aim for portability.
	1. Constructor and Method
		**Constructors:**
		**Purpose:**
		- **Initialize objects:** Their primary purpose is to set the initial state of an object when it's created. They ensure that objects are created with valid and consistent values.
		**Invocation:**
		- **Implicitly called:** Constructors are automatically called when you create a new object using the `new` keyword. You don't explicitly call them like you do with methods.
		**Method**
		**Purpose:**
		- **Perform actions:** Methods are blocks of code that execute specific tasks or operations on objects. They define the behavior of objects and what they can do.
		**Invocation:**
		- **Explicitly called:** Methods are called explicitly using dot notation on an existing object (e.g., `objectName.methodName()`).
	1. No argument constructor and parameterized constructor
		1. **No Argument Constructor:**
		    - **Parameters:** Takes no parameters.
		    - **Example:**
		``` java
					public ClassName() {     // Constructor body }
		```
		2. **Parameterized Constructor:**
		    - **Parameters:** Takes one or more parameters.
		    - **Example:**
       ```java
       public ClassName(int parameter1, String parameter2) {     // Constructor body }
		``` 
1. Give an example of a Java statement to illustrate any three (3) of the control structure that you know.
```java
// Example of if statement
int x = 10;
if (x > 0) {
    System.out.println("x is positive");
} else {
    System.out.println("x is non-positive");
}

// Example of for loop
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

// Example of switch statement
char grade = 'A';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    default:
        System.out.println("Average or below");
}

```
4. Identify the incorrect variables in the following list of variables with reason
	1. -345
	2. &ABD
	3. Num1
	4. a-num
	5. a_num
	6. AB12
	7. AB12_
	8. C4_8
1. **&ABD:** This is not a valid variable name in Java. Variable names cannot start with an ampersand.
2. **a-num:** This is not a valid variable name in Java. Variable names cannot contain hyphens; use underscores instead.
3. Suppose the initial values of x,y, and z are 15, 3, and 15 respectively, what is the output 
```Java
for(int j = x; j>= 0 ; j -=5){
	System.out.println("j=" + j);
}
//Output
j = 15
j = 10
j = 5
j = 0

do{
	++x;
	Sytem.out.println("x="+x);
}while(x<z);

//Output
x = 16

```


