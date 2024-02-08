1. Input a list into an array, calculate the mean and the standard deviation. 

```java
public class Assignment {
    public static void main(String args[]) {
        // Array of values
        int values[] = {55, 56, 57, 66, 67, 76, 77, 86, 87, 97, 98, 99};
        
        // Variables for calculations
        double sum = 0;
        double mean, sd, variance;
        double varianceSum = 0;

        // Calculate the sum of values
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        
        // Print the sum of values
        System.out.println("The sum of the values is: " + sum);

        // Calculate the mean (average) of values
        mean = sum / values.length;
        System.out.println("The mean of the values is: " + mean);

        // Calculate the Variance
        for (int i = 0; i < values.length; i++) {
            // Sum of squared differences from the mean
            varianceSum += Math.pow((values[i] - mean), 2);
        }

        // Calculate the variance
        variance = (varianceSum) / (values.length - 1);
        System.out.println("The variance is: " + variance);

        // Calculate the standard deviation
        sd = Math.sqrt(variance);
        System.out.println("The standard deviation is: " + sd);
    }
}

```
2. Write  a program that calculates the amount of money in the future after investment. ROI(Return on investment) . 

$$ A = p (1 + R)^n$$
	initialize the number of investors. 
	
	A = Final amount
	p = principal capital
	r = rate, in percentage (15%)
	n = number of years


```Java
import java.util.Scanner;

public class Investment {
    public static void main(String args[]) {
        // Arrays to store investor information
        String investorNames[] = new String[5];
        double amount[] = new double[5];
        double capitals[] = new double[5];
        int duration[] = new int[5];

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Loop to gather information for 5 investors
        for (int i = 0; i < 5; i++) {
            System.out.println("What is the name of investor " + (i + 1) + ":");
            investorNames[i] = input.nextLine();
            
            System.out.println("Investment capital:");
            capitals[i] = input.nextInt();
            input.nextLine(); // Consume the newline character
            
            System.out.println("Duration of investment:");
            duration[i] = input.nextInt();
            input.nextLine(); // Consume the newline character
            
            // Calculate the amount based on the investment formula
            amount[i] = capitals[i] * Math.pow((1.15), duration[i]);
        }

        // Close the Scanner to avoid resource leakage
        input.close();

        // Displaying the information for each investor
        System.out.println("Investor \t Captial \t Duration \t | \t Amount");
        for (int j = 0; j < 5; j++) {
            System.out.printf("%s \t %.2f \t %d \t | \t %.2f", investorNames[j], capitals[j], duration[j], amount[j]);
            System.out.println("");
        }
    }
}

```