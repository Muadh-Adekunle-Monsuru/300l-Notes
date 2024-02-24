import java.util.Scanner;
public class newinputs {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter Number 1;");
        num1 = input.nextInt();
        System.out.println("Enter Number 1;");
        num2 = input.nextInt();

        System.out.printf("Num 1: %d and Num 2: %d", num1, num2);
    }
}
