import java.util.Scanner;
public class areacircle{
    public static void main(String args[]){
        System.out.println("What is the radius:");
        Scanner nc = new Scanner(System.in);
        double radius = nc.nextDouble(); 
        double area = Math.pow(radius,2);
        double answer = Math.sqrt(radius);
        System.out.println("The square root is:"+ answer);
        // System.out.printf("The area for the radiuse %f is: %f",radius,area);

    }
}