public class Array{
    public static void main(String args[]){
        int ages[] = {12,13,14,15,16,17,18,20,34,55,72,22};
        System.out.println("|\t Index \t | \tValues \t|");
        System.out.println("|\t ----- \t | \t----- \t|");
        for(int i = 0; i < ages.length ; i++){
	        System.out.println("|\t" + i + "\t | \t" + ages[i]+ "\t|" );
        }
    }
}

