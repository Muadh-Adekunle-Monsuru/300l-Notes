import java.util.Scanner;
public class investment{
	public static void main(String args[]){
	String investorNames[] = new String[5];
    double amount[] = new double[5];
	double captitals[] = new double[5];
    int duration[] = new int[5];
    Scanner input = new Scanner(System.in);
	for( int i = 0 ; i<5; i++)	
		{System.out.println("What is the name of investor: " + (i+1));
		investorNames[i] = input.nextLine();
		System.out.println("Investment capital: ");
		captitals[i] = input.nextInt();
        input.nextLine();
        System.out.println("Duration of investment: ");
        duration[i] = input.nextInt();
        input.nextLine();
        amount[i] = captitals[i] * Math.pow((1.15),duration[i]) ; 
	}
		input.close();		

        System.out.println("Investor \t Captial \t Duration \t | \t Amount");
    for(int j = 0; j<5; j++){
        System.out.printf("%s      \t %f \t %d \t | \t %f",investorNames[j], captitals[j], duration[j], amount[j]);
        System.out.println("");
    }
    }
}