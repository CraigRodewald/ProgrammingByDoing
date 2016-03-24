import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int userInput = 0;
		int randomNumber;
		int counter = 1;
		
		randomNumber = rand.nextInt(10) + 1;
		//System.out.println(randomNumber);
		
		System.out.println("I have chosen a number between 1  and 10.  Try and guess it.");
		
		while(userInput != randomNumber){
			System.out.print("Your guess: ");
			userInput = scan.nextInt();
			if (userInput == randomNumber) {
				System.out.println("You're a good guesser.");
				System.out.println("It only took you " + counter + " tries.");
				break;
			}
			else{
				System.out.println("That is incoorect.  Guess again.");
				counter++;
			}
		
		}
		scan.close();}
}
