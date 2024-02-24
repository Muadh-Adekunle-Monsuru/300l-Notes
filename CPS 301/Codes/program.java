public class program{
	public static void main(String args[]){
		String subject[] = {"CPS301","CPS303","CPS305","CPS307","CPS309"};	
		int score[][] = {{60,67,59,40,76},{79,69,60,37,58},{56,58,34,21,49}};
		double sum;
		double average;
		for(int i = 0; i<6;i++){
			sum = 0;
			for(int j = 0; j<3 ;j++){
				sum += score[j][i];	
			}
			average = sum/3;
			System.out.println("The average score for"+ subject[i] + "is" + average);
		}
	}
}