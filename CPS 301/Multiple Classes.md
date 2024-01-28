A large program entails having more classes. 

The main program is the program with the main class, it is the executable class. 

```java
// main class
public class AlternateClass {
		// other class saved in another file called AlternateClass
    public void displayMessage() {
        System.out.println("This is from a new class");
    }
    
    public static void main(String[] args) {
        // Create an instance of AlternateClass
        AlternateClass printMessage = new AlternateClass();
        // Call the displayMessage method on the instance
        printMessage.displayMessage();
    }
}

```

## Method With Parameter:
A parameter is extra information needed by the program to run. 
```java
// main class
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your friends name");
		String name = input.nextLine();
		input.close();
        // Create an instance of AlternateClass
        AlternateClass printMessage = new AlternateClass();
        // Call the displayMessage method on the instance
        printMessage.displayMessage(name);
    }
}

// other class should be saved in another file
public class AlternateClass {
    public void displayMessage(String name) {
        System.out.println("My best friends name is: "+ name);
    }
}

```

A variable declared as private means it is private to that particular class. It cant be used outside that class. 


Methods to set the name, set the name,  and display the name;

```Java

import java.util.Scanner;

public class Name{
	private String goodStudent;
	public void setName(String name){
		goodStudent = name;
	}
	public String getName(){
		return goodStudent;
	}
	public void displayName(){
		System.out.println("The name of the most outstanding student is: %s",getName());	
	}	

	public static void main(String[] args){
	    Scanner input  = new Scanner(System.in);
	    System.out.println("What is the name of the most outstanding studetn");
	    String name = input.nextLine();
	    input.close();
	    Name nameObj = new Name();
	    nameObj.setName(name);
	    nameObj.displayName();
		}
	}
//New file called Name.java

}
```


---

# Constructor
A constructor is a special type of method that is used to initialize the object, it is invoked at the time of object creation. It is used to construct the values of the object. 

**Rules for creating a constructor:**
- Constructor must has the same name as its class name
- No explicit `return` type

**Type of Constructors:**
- Default Constructor: No arguments `public newClass(){ }`
- Parameterized Constructor:  parameter and its type `public newClass(int y, String name){ }`

The constructor is a special method called automatically when an object is created with the `[new]` keyword.  Each class must have a constructor. If we do not define one, the compiler will create a default so called **empty constructor** automatically.

```java 
public class MyClass {
  /**
  * MyClass Empty Constructor
  */
  public MyClass() {
  }
}
```

```Java
public class Student{
	int matric_No;
	String name;

	//Constructor
	public Student(int m, String n){
		 matric_No = m;
		 name = n;	
	}
	public void displayMessage(){
		System.out.println("The matric number:" + matric_No + "The name: " + name);	
	}
	public static void main(String args[]){
		Student Ade = new Student(22555,"Adekola");
		//System.out.println("My name is: " + Ade.name + "My Age is: " + Ade.Matric_no);
		Ade.displayMessage();
	}
}
```
