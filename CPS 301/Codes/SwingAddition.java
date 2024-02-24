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