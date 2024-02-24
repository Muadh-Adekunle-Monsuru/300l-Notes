public class Name{
	private String goodStudent;
	public void setName(String name){
		goodStudent = name;
	}
	public String getName(){
		return goodStudent;
	}
	public void displayName(){
		System.out.printf("The name of the most outstanding student is: %s",getName());	
	}
}