import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		// Initialize variables
		String name;
		int age;
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Hey, What is your name? ");
		name = userInput.nextLine();
		
		System.out.print("\nOk, " + name + " how old are you? ");
		age = userInput.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name);
		}
		
		if (age < 18) {
			System.out.println("You can't vote, " + name);
		}
		
		if (age < 25) {
			System.out.println("You can't rent a car, " + name);
		}
		
		if (age >= 25) {
			System.out.println("You can do anything that is legal, " + name);
		}
	}
}
