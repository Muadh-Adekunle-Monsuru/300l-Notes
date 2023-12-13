1. Area of a circle using scanner
```Java

```
2. Quadratic formula
```Java
import System.utils.Scanner;
public class quadratic{
public static main(String args[]){
	Scanner input = new Scanner(System.in);
	int a,b,c;
	double x1,x2,discriminant;
	System.out.println("Input a:")
	a = input.nextInt();
	System.out.println("Input b:")
	b = input.nextInt();
	System.out.println("Input c:")
	c = input.nextInt();
	input.close();
	discriminant = Math.sqrt(Math.exp(b)-4*a*c);
	if(discriminant < 0){
		System.out.println("Complex Root");
	} else if(discriminant == 0 ){
		System.out.println("Single Root:");
		x1 = (-b+discriminant)/2*(a);
		System.out.printf("Root 1: %f",x1);
	}
	else{
		System.out.println("Discrimant is less than 0 ");
		x1 = (-b+discriminant)/2*(a);
		x2 = (-b-discriminant)/2*(a);
		System.out.printf("Root 1: %f",x1);
		System.out.printf("Root 2: %f",x2);
	}
	
}
}
```