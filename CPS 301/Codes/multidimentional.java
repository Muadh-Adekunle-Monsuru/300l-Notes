public class multidimentional{
    public static void main(String args[]){
        int differentArray[][] = {{1,2,3},{4,5,6},{3},{4,5}};
        int firstArray[][] = {{1,2,3},{4,5,6},{3,2},{4,5}};
        displayMessage(firstArray);
    }

    public static void displayMessage(int theArray[][]){

        for(int i = 0 ; i<theArray.length; i++){
            for(int j = 0 ; j<theArray[i].length;j++){
                System.out.printf("%d \t",theArray[i][j]);
            }
            System.out.println("");
        }

    }
}