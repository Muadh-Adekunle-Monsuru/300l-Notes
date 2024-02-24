import java.util.Scanner;
public class Scores{
    public static void main(String[] args){
        System.out.println("What is your score");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        input.close();

        switch (score){
            case score > 70:
                System.out.println("Your score is greater than 70");
                break;
            default:
                System.out.println("Your score is out of the range");
        }
    }
}