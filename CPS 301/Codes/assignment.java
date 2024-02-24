public class assignment{
	public static void main(String args[]){
		int values[] = {55,56,57,66,67,76,77,86,87,97,98,99};
		double sum = 0;
		double mean,sd,variance;
		double varianceSum = 0;

		for(int i = 0; i < values.length; i++){
			sum += values[i];		
		}
		System.out.println("The sum of the values is: " + sum);
		mean = sum / values.length;
		System.out.println("The mean of the values is: " + mean);

	// Calculating the Variance
		for(int i = 0; i< values.length; i++){
			varianceSum += Math.pow((values[i] - mean),2);
		}

		variance = (varianceSum) / (values.length -1);
		System.out.println("The variance is: " + variance);
		sd = Math.sqrt(variance);
		System.out.println("The standard deviation is: " + sd);
	}
}