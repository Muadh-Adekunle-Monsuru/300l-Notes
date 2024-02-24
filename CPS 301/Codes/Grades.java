import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("What is your grade");
        //String grade = input.nextLine();
        //input.close();
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("Your score is above 70 ");
                break;
            case "B":
                System.out.println("Your score is between 60 and 70");
                break;
            case "C":
                System.out.println("Your score is between 50 and 60");
                break;
            case "D":
                System.out.println("Your score is between 45 and 50");
                break;
            case "E":
                System.out.println("Your score is between 40 and 45");
                break;
            case "F":
                System.out.println("Your score is ");
                break;
            default:
                System.out.println("Your grade is not listed:");
        }
    }

}
