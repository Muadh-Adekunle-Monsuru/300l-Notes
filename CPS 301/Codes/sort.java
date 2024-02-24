import java.util.Scanner;
import java.util.Arrays;
public class sort{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
double scores[] = new double[10];
double sorted[] = new double[10];
for(int i = 0; i<10; i++){
System.out.println("What is your score");
scores[i] = input.nextDouble();
}
 Arrays.sort(scores);
System.out.println("The scores are:");
for(int i = 0; i<10; i++){
System.out.println(scores[i]);
}
}
}
