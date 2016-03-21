import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// Initialize variables
		String answerString;
		int answerInt;
		int score = 0;
		int question = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Are you ready for a quiz? (y or n) ");
		answerString = userInput.nextLine();
		
		if (answerString.toLowerCase() == "y") {
			System.out.println("Okay, here it comes!");
		}
		else {
			System.out.println("Okay, here it comes anyway!");
		}
		
		//Question 1
		System.out.println("\nQ1) What is the capital of Alaska? ");
		System.out.println("\t1) Melbourne");
		System.out.println("\t2) Anchorage");
		System.out.println("\t3) Juneau");
		System.out.println("\n");
		answerInt = userInput.nextInt();
		question++;
		
		if (answerInt == 3) {
			System.out.println("\nThat's right!\n");
			score++;
		}
		else {
			System.out.println("\nThat is incorrect  :(\n");
		}
		
		//Question 2
		System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int? ");
		System.out.println("\t1) yes");
		System.out.println("\t2) no");
		System.out.println("\n");
		answerInt = userInput.nextInt();
		question++;
		
		if (answerInt == 2) {
			System.out.println("\nThat's right!\n");
			score++;
		}
		else {
			System.out.println("\nSorry, \"cat\" is a string.  ints can only store numbers.\n");
		}
		
		//Question 3
		System.out.println("\nQ3) What is the result of 9+6/3? ");
		System.out.println("\t1) 5");
		System.out.println("\t2) 11");
		System.out.println("\t3) 15/3");
		System.out.println("\n");
		answerInt = userInput.nextInt();
		question++;
		
		if (answerInt == 2) {
			System.out.println("\nThat's correct!\n");
			score++;
		}
		else {
			System.out.println("\nSorry, that is incorrect  :(\n");
		}
		
		System.out.println("Overall you got " + score + " out of " + question + " correct.");
		System.out.println("Thanks for plaing!");
	}
}
