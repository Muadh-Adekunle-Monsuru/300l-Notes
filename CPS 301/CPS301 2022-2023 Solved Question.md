. What is the motivation behind modular organization of programs
		The motivation behind modular organization of programs is to enhance maintainability, reusability, and scalability of software. Breaking down a complex system into smaller, manageable modules helps in better understanding and maintenance of the code. Each module is designed to perform a specific task, making it easier to test, debug, and update without affecting the entire program. This modularity also promotes code reuse, as modules can be used in different parts of the program or in entirely different projects.
1. Discuss the two programming paradigms that you know and expatiate on the significance and drawbacks of both 
	**Procedural Programming (POP)**:
	 Procedural Programming is a programming paradigm that focuses on procedures, routines, or subroutines, where each is a self-contained and reusable block of code. It revolves around the concept of a step-by-step procedure or routine to solve a problem.
	**Advantages:**
	1. **Simplicity:** POP tends to be simpler and more straightforward. It follows a linear flow, making it easier to understand and implement for smaller programs.
	2. **Efficiency:** For certain tasks, procedural code can be more efficient, especially in situations where a linear execution model fits well.
	**Disadvantages:**
	1. **Limited Code Reusability:** Code is organized around procedures, and achieving high reusability can be challenging compared to OOP.
	2. **Difficulty in Managing Complexity:** As programs grow, it becomes harder to manage and maintain code due to a lack of modular organization.
	3. **Less Natural Modeling of Real-World Entities:** POP doesn't naturally lend itself to modeling real-world entities and their interactions, which can hinder the representation of complex systems.
	 **Object-Oriented Programming (OOP):**
	**Definition:** Object-Oriented Programming is a programming paradigm based on the concept of "objects," which encapsulate data and behavior. It emphasizes principles like encapsulation, inheritance, and polymorphism to model and represent real-world entities.
	**Advantages:**
	1. **Modularity and Reusability:** OOP allows code to be organized into reusable modules (classes and objects), promoting modularity and code reusability.
	2. **Encapsulation:** Encapsulation hides the internal state of objects and restricts access to their data, enhancing security and preventing unintended interference.
	3. **Inheritance:** Enables the creation of new classes based on existing ones, fostering code reuse and the creation of hierarchical structures.
	4. **Polymorphism:** Allows for a single interface to represent different types, providing flexibility and adaptability.
	**Disadvantages:**
	1. **Learning Curve:** OOP can have a steeper learning curve for beginners due to its complex concepts like inheritance, polymorphism, and encapsulation.
	2. **Performance Overhead:** In certain cases, OOP might introduce a performance overhead due to the dynamic nature of objects and the additional layers of abstraction.
	3. **Overuse of Inheritance:** Misuse of inheritance can lead to a complex and inflexible class hierarchy, making the code harder to understand and maintain.

1. Describe the following concepts/terms in programming with Java:
	1. Variable casting and conversion: 
		- **Casting:** Converting a variable from one type to another. For example, `(int) 3.14` casts a floating-point number to an integer.
		- **Conversion:** Changing the value of a variable to another type. For example, converting a string representation of a number to an actual numeric type. Integer.parseInt
	1. Java libraries: Collections of pre-built classes and methods that provide common functionality. Examples include the Java Standard Edition (SE) libraries, which cover fundamental tasks like input/output, data structures, and networking.
	2. Polymorphism: The ability of objects of different types to be treated as objects of a common type. In Java, this is achieved through method overloading (compile-time polymorphism) and method overriding (run-time polymorphism).
	3. Constructor:  A special method used to initialize objects when they are created. It has the same name as the class and is invoked using the new keyword.
	4. Access modifiers:  Keywords like public, private, and protected that determine the visibility and accessibility of classes, methods, and variables in Java.
2. Given each of the following tasks below, write declarations, statements or comments to accomplish them
	1. Declare variable to be of type integer, float and double
	```Java
	int age;
	float height;
	double weight;
	```
	1. Create a scanner that reads values from the standard input
	```java
	Scanner input = new Scanner(System.in);
	```
	1. Prompt the user to enter an integer
		```Java
		System.out.println("Enter an integer value");
		```
	1. Input an integer and assign the result to int variable assuming scanner variable input is used to read a value from the keyboard
		```Java
		int score = input.nextInt();
```
1. Write a java program that will accept the scores of ten students in CPS301 and print out the scores in ascending order. 
```Java
import java.util.Scanner;
public class scores{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double scores[] = new double[10];
		for(int i = 0; i<10; i++){
			System.out.println("What is your score");
			scores[i] = input.nextLine();
		}
			System.out.println("The scores are:");
		for(int i = 0; i<10; i++){
			System.out.println(scores[i]);
		}
	}
}
```
## Question 2
1. The major motivating factor in the invention of OOP is to remove some of the flaws encountered in the procedural approach. Explain:
	 The procedural approach had limitations in managing complexity as programs grew in size.
2. Create a non-executable class that has a private instance variable that can hold the names and matric number of a Student. Your class should contain methods to assign values to and retrieve values from the instance variable.
```Java
public class Student{
	String name;
	int matric_no;
	public static void setName(String n){
		name = n;	
	}
	public static void setMatric(int m){
		matric_no = m;	
	}
	public static getName(){
		return name;	
	}
	public static getMatric(){
		return matric_no;	
	}
}
```
1. Create an executable class that shows how the instance variables of the non-executable class in (b) can be manipulated by the methods of the class.
```Java
	public class program{
		public static void main(String args[]){
		Student yusuf = new Student();
		yusuf.setName("Yusuf"); //setting the name of the student	
		yusuf.setMatric(22344); //setting the matric number of the student
		
		}	
	}
```
1. Give an example of a Java statement to illustrate three (3) java control structure that you know
```Java
//Looping
	for(int i = 0; i<4 ; i++){
		switch(i){
			case 0:
				System.out.println("Case when i:"+ i );
				break;
			case 1:
				System.out.println("Case when i:"+ i );
				break;
			case 2:
				System.out.println("Case when i:"+ i );
				break;
			default:
				System.out.println("Case when i:"+ i );
				}
	}
	int age = 25;
	if(age<19){
		System.out.println("You are not eligible");
	}else{
		System.out.println("You are eligible");
	}
```
## Question 3
1. Consider the two dimensional array below
	![[Pasted image 20240205064841.png]]
	Write a java program to compute and print out the:
	(i) Average score per course.
```Java
public class program{
	public static void main(String args[]){
		String subject[] = {"CPS301","CPS303","CPS305","CPS307","CPS309"};	
		int score[][] = {{60,67,59,40,76},{79,69,60,37,58},{56,58,34,21,49}};
		double sum;
		double average;
		for(int i = 0; i<5;i++){
			sum = 0;
			for(int j = 0; j<3 ;j++){
				sum += score[j][i];	
			}
			average = sum/3;
			System.out.println("The average score for"+ subject[i] + "is" + average);
		}
	}
}
```
	(ii) Average score of each student
```Java
public class program{
	public static void main(String args[]){
		String student[] = {"Student1","Student2","Student3"};	
		int score[][] = {{60,67,59,40,76},{79,69,60,37,58},{56,58,34,21,49}};
		double sum;
		double average;
		for(int j = 0; j<3 ;j++){
			sum = 0;
			for(int i = 0; i<5;i++){
				sum += score[j][i];	
			}
			average = sum/5;
			System.out.println("The average score for"+ student[j] + "is" + average);
		}
	}
}
```
2. Consider the initial value of i to be 10; With cogent reasons, what would be the value of i, j, and k on executing the code snippet below:
```java
int i = 10;
int j = i++%5; //j is equal to 0, since 10%5 = 0; i is incremented after the operation, i = 11
int k = ++i%5; //k = 2, since i is incremented before the operation is performed i = 12, then 12%5 = 2 

final: i = 12, j = 0 , j = 2
```


## Question 4
1. Hassan Motors sells a car worth N3000000 to Dr. Jubril with a profit 1.5% of total purchase. Dr Jubril pays N200000 at the end of each month. The amount he owes at the end of each month is calculated thus:
	$AMOUNT = P + (1.5/100 * P) - N200000$
	Where P = the principal amount left to be paid.
	Write a Java program that will print the amount he owes each month and the number of months it will take him to pay all the debt.
```java
public class payment{
	public static void main(String args[]){
		double amountOwed,months;
		amountOwed = 30000000;
		month = 0;
		while(amountOwed > 0){
			amountOwed = amountOwed + (1.5/100 * amountOwed) - 2000000;
			System.out.printf("The amount left to pay after month %d is %f",month,amountOwed);
		}
		System.out.printf("It will take him %d months to pay all debt",month);
	}
}
```

2. Find the errors (if any) in each of the following Java code segments and explain how to correct them
```Java
//Question 1
	i = 0;
	while (i < 10)
	k++;
---
	i = 0;
	while(i<10){
		i++;
	}

//Question 2
	for (k = 0,k<=100, k=+5)  system.out.print(k);
---
	for(int k = 0; k<=100; k += 5){System.out.print(k)};

//Question 3
	array = new double [5];
---
	double array[] = new double[5];

//Question 4
	maximum = Math.max(a,b,Math.max(c,d))
---
	maximum = Math.max(a,Math.max(b,Math.max(c,d)));

//Question 5
	math.floor(8.5,9.2);
---
	Math.floor(8.5);
	Math.floor(9.2);
```

## Question 5
1. Differentiate between the following terms in JAVA:
	1. Class and Objects
		Class: A blueprint or template for creating objects. It defines the structure and behavior that its objects will have.
		**Object**: An instance of a class, representing a real-world entity. Objects have state (attributes) and behavior (methods).
	1. Libraries and API:
		- **Libraries:** Collections of pre-built code, such as Java libraries, that provide ready-to-use functions and classes.
		- **API (Application Programming Interface):** A set of rules and protocols that allow different software applications to communicate with each other. APIs often include libraries.
	1. Local variables and Instance variables: 
		**Local variables:** Declared inside a method or block and have limited scope. They exist only within the method or block where they are declared.
		**Instance variables:** Belong to an object and are declared within a class but outside any method. They exist as long as the object to which they belong exists.
	1. Constructor and Methods:	
		**Constructor**: Special method used for initializing objects when they are created. It has the same name as the class and is invoked using the new keyword.
		**Methods**: Functions or procedures within a class that perform specific tasks. They define the behavior of the class. Unlike constructors, methods can have different names. 
2. Perform the following tasks for an array called table:
	1. Declare and create the array as an integer array that has three rows and three columns. Assume that the array size is 5.
	```Java
	int table[][] = new int[3][3];
```
	1. Use a for statement to initialize each element of the array to the sum of its indices. assume that the integer variables x and y are declared as control = x + y; variables. 
```Java
	for(int x = 0; x <3 ; x++){
		for(int y = 0; y<3; y++){
			table[x][y] = x + y;
		}	
	}
```