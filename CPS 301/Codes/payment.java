public class payment{
public static void main(String args[]){
double amountOwed,month;
amountOwed = 3000000;
month = 0;
while(amountOwed > 0){
amountOwed = amountOwed + (1.5/100 * amountOwed) - 2000000;
month++;
System.out.println("The amount left to pay is"+amountOwed+"after month" +month);
}
System.out.println("It will take him"+month+" months to complete the payment");
}
}
