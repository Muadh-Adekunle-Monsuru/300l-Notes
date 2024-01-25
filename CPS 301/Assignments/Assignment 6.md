
1. Quadratic formula
```Java
import java.util.Scanner;
public class quadratic{
public static main(String args[]){
	Scanner input = new Scanner(System.in);
	//declaring variable
	int a,b,c;
	double x1,x2,discriminant;
	//accepting user input for a
	System.out.println("Input a:");
	a = input.nextInt();
	//accepting user input for b
	System.out.println("Input b:");
	b = input.nextInt();
	//accepting user input for c
	System.out.println("Input c:");
	c = input.nextInt();
	input.close();
	//calculating the discriminat
	discriminant = Math.sqrt(Math.pow(b,2)-4*a*c);
	//if the discriminant is less than 0 then the equation has no real roots
	if(discriminant < 0){
		System.out.println("Complex Root");
	} else if(discriminant == 0 ){
	//if the discriminant is equal to 0 then the equation has only one roots
		System.out.println("Single Root:");
		x1 = (-b+discriminant)/2*(a);
		System.out.printf("Root 1: %f",x1);
	}
	else{
		System.out.println("Discrimant is less than 0 ");
		//Calculates root 1
		x1 = (-b+discriminant)/(2*(a));
		//Calculates root 2
		x2 = (-b-discriminant)/(2*(a));
		//Printing out the values
		System.out.printf("Root 1: %f",x1);
		System.out.printf("Root 2: %f",x2);
	}
	
}
}
```