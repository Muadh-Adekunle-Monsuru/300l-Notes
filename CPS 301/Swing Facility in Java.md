In Java, Swing is a graphical user interface (GUI) toolkit that is part of the Java Foundation Classes (JFC). Swing provides a set of components and tools for building desktop applications with rich graphical user interfaces. It is a part of the Java Standard Edition (Java SE) library.

Swing provides a wide range of GUI components, such as buttons, text fields, labels, lists, tables, and more. It also includes layout managers for arranging these components in a user interface. Swing is built on top of the Abstract Window Toolkit (AWT), and it provides more advanced and customizable components compared to AWT.

to import all packages under swing:
```Java
import javax.swing.*;
```


Here's a simple example of using Swing to create a basic graphical application:

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExample {

    public static void main(String[] args) {
        // Create a JFrame (the main window)
        JFrame frame = new JFrame("Swing Example");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add the button to the panel
        panel.add(button);

        // Set the content pane of the frame to the panel
        frame.setContentPane(panel);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

In this example, we create a simple Swing application with a JFrame, a JPanel, and a JButton. The `JFrame` represents the main window, the `JPanel` is used to hold components, and the `JButton` is a clickable button. This is just a basic example, and Swing provides a wide range of components and features for building more complex GUI applications.

Swing applications typically use an event-driven programming model, where actions such as button clicks trigger specific event handlers. Event listeners can be attached to Swing components to respond to user interactions.

Note that while Swing has been widely used in the past for building desktop applications, JavaFX has become the preferred choice for Java GUI development in more recent years. JavaFX provides a more modern and feature-rich framework for building graphical user interfaces.

---
## Addition of Numbers Using Swing

```Java
import javax.swing.*;
public class SwingAddition{
	public static void main(String args[]){
	//declare variable
	String firstNumber, secondNumber;
	int num1,num2,sum;
	//Displays a dialog box to show the message "Enter the first number"
	firstNumber=JOptionPane.showInputDialog("Enter the first number");
	secondNumber=JOptionPane.showInputDialog("Enter the second number");
    num1 = Integer.parseInt(firstNumber);
    num2 = Integer.parseInt(secondNumber);
    sum = num1 + num2;
    System.out.println(sum);
    JOptionPane.showMessageDialog(null,"The sum is:"+ sum,"Result",JOptionPane.PLAIN_MESSAGE);
    System.exit(0);
	}
}
```


`JOptionPane.showMessageDialog`: has 4 parameters serpated by commas, 
```Java
JOptionPane.showMessageDialog(null,[user's output],[titleofmessage] ,[typeoficon])
null: It tells the application where to position the dialog box: it should appear in the center of the computer screen. 

user's output: "The sum of 2 numbers" + sum
title: title of dialog box: "Result"
type of icon: JOptionPane.PLAIN_MESSAGE 
```

JOptionPane is a subclass of the swing class which has many methods underneath, its purpose is to draw an input text box. And any data captured by it is a string meaning it needs to be parsed. 