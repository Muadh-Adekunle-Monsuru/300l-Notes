import java.util.Scanner;

public class quadratic {
	public static void main(String[] args) {
		// declaring variable

		int a, b, c;
		Scanner input = new Scanner(System.in);
		double x1, x2, discriminant;
		// accepting user input for a
		System.out.println("What is a ");
		a = input.nextInt();
		System.out.println("What is b ");
		// accepting user input for b
		b = input.nextInt();
		// accepting user input for c
		System.out.println("What is c ");
		c = input.nextInt();
		input.close();
		// calculating the discriminat
		discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		System.out.println(discriminant);
		// if the discriminant is less than 0 then the equation has no real roots
		if (discriminant < 0) {
			System.out.println("Complex Roots");
		} else if (discriminant == 0) {
			// if the discriminant is equal to 0 then the equation has only one roots
			System.out.println("Single Roots");
			x1 = (-b + discriminant) / 2 * (a);
			System.out.printf("Root 1: %f", x1);
		} else {
			// Calculates root 1
			x1 = (-b + discriminant) / (2 * (a));
			// Printing out the values
			x2 = (-b - discriminant) / (2 * (a));
			// Printing out the values
			System.out.printf("Root 1: %f", x1);
			System.out.printf("Root 2: %f", x2);
		}
	}
}
