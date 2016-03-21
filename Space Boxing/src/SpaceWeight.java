import java.util.Scanner;

public class SpaceWeight {

	public static void main(String[] args) {
		// Initialize Variables
		double earthWeight;
		double planetWeight;
		double relativeGravity = 0;
		int menuSelection;
		
		// Initialize constants
		double venus = 0.78;
		double mars = 0.39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus = 1.05;
		double neptune = 1.23;
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter your current earth weight: ");
		earthWeight = userInput.nextDouble();
		
		// Show menu
		System.out.println("\nI have information for the following planets:");
		System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter");
		System.out.println("\t4. Saturn\t5. Uranus\t6. Neptune\n");
		
		// Get user menu selection
		System.out.print("Which planet are you visiting? ");
		menuSelection = userInput.nextInt();
		
		if (menuSelection == 1) {
			relativeGravity = venus;
		}
		else if (menuSelection == 2) {
			relativeGravity = mars;
		}
		else if (menuSelection == 3) {
			relativeGravity = jupiter;
		}
		else if (menuSelection == 4) {
			relativeGravity = saturn;
		}
		else if (menuSelection == 5) {
			relativeGravity = uranus;
		}
		else if (menuSelection == 6) {
			relativeGravity = neptune;
		}
		
		// Do math
		planetWeight = earthWeight * relativeGravity;
		
		// Output
		System.out.println("\nYour weight would be " + planetWeight + " pounds on that planet.");
	}

}
