import java.util.Scanner;
public class Averageinput{
    public static void main(String[] args) {
        System.out.println("Enter Number 1");
        Scanner nc = new Scanner(System.in);
        int num1 = nc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = nc.nextInt();
        double average = (num1+ num2) / 2; //Calculating average 
        System.out.printf("Average is:%f", average); //Printing the output
        nc.close();
    }
}