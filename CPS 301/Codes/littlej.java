import java.util.Scanner;
public class littlej{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age");
		int number = input.nextInt();
		System.out.println(number);
		input.close();


		System.out.println("Hello World");
		int i;
		for(i=0;i<=10;i++){
			System.out.println(i);
		}
	}

}
