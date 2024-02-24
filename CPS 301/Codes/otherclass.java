import java.util.Scanner;
public class otherclass{

	public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.println("What is the name of the most outstanding studetn");
    String name = input.nextLine();
    input.close();
    Name nameObj = new Name();
    nameObj.setName(name);
    nameObj.displayName();
	}
  

}


