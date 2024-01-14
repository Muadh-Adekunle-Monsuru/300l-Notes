A large program entails having more classes. 

The main program is the program with the main class, it is the executable class. 

```java
// main class
public class MainClass {
    public static void main(String[] args) {
        // Create an instance of AlternateClass
        AlternateClass printMessage = new AlternateClass();
        // Call the displayMessage method on the instance
        printMessage.displayMessage();
    }
}

// other class saved in another file called AlternateClass
public class AlternateClass {
    public void displayMessage() {
        System.out.println("This is from a new class");
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
public class otherclass{

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
}
```