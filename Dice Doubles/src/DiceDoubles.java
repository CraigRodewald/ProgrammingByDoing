import java.util.Random;

public class DiceDoubles {
	
	public static int randomNumber(){
		//Setup Random 
		Random rand = new Random();
		int randomNumber;
		
		randomNumber = rand.nextInt(6) + 1;
		
		return randomNumber;
	}
	public static void main(String[] args) {
		//Initialize variables
		int rollOne = 1;
		int rollTwo = 2;
		int total = 0;
		
		
		
		
		System.out.println("HERE COMES THE DICE!");
		
		while(rollOne != rollTwo){
			rollOne = randomNumber();
			rollTwo = randomNumber();
			
			total = rollOne + rollTwo;
			
			System.out.println("\nRoll #1: " + rollOne);
			System.out.println("Roll #2: " + rollTwo);
			System.out.println("The total is " + total);
			
			if (rollOne == rollTwo) {
				break;
			}
		}
	}
}
