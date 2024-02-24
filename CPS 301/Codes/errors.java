public class errors{
  public static void main(String[] args){
    int[] score ={1,2,3,4,5,6,7,8,9,10};
	int total = 0;
	  int i;
	for(i=0;i<10;i++){
		if(score[i] % 2 == 0 ){
			System.out.println(score[i]);
			total += score[i];	
		}	
	}
  }
}

