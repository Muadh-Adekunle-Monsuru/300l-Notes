1. Input a list into an array, calculate the mean and the standard deviation. 

```java
public class assignment{
	public static void main(String args[]){
		int values[] = {55,56,57,66,67,76,77,86,87,97,98,99};
		double sum = 0;
		double mean,sd,variance;
		double varianceSum = 0;

		for(int i = 0; i < values.length; i++){
			sum += values[i];		
		}
		System.out.println("The sum of the values is: " + sum);
		mean = sum / values.length;
		System.out.println("The mean of the values is: " + mean);

	// Calculating the Variance
		for(int i = 0; i< values.length; i++){
			varianceSum += Math.pow((values[i] - mean),2);
		}

		variance = (varianceSum) / (values.length -1);
		System.out.println("The variance is: " + variance);
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
public class investment{
	public static void main(String args[]){
	String investorNames[] = new String[5];
	int captitals[] = new int[5];
	 
	for(int i = 1 ; i<6; i++)	
		System.out.println("What is the name of investor: " + i);
		Scanner input = new Scanner(System.in);
		investorNames[i] = input.nextLine();
		System.out.printf("%s 's capital is: ", investorName[i]);
		captitals[i] = input.nextLine();
			input.close();		
	}
	
}
```