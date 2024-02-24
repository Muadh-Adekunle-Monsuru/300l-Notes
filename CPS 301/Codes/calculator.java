public class calculator{
	public static void main(String args[]){
		int num1 = 300, num2 =40;
		int  sum,difference, division, product, modulo;
		sum = num1 + num2;
		difference = num1 - num2;
		division = num1 / num2;
		product = num1 * num2;
		modulo = num1 % num2;
		System.out.println("Addition:"+ sum);
		System.out.println("Subtraction:" + difference );
		System.out.println("Multiplication:" + product);
		System.out.println("Division:" + division);
		System.out.println("Modulo:" + modulo );
	}
}