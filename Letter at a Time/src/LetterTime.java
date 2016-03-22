import java.util.Scanner;

public class LetterTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userMessage;
		int length;
		
		System.out.print("What is your message? ");
		userMessage = scan.nextLine();
		
		length = userMessage.length();
		System.out.println("\nYour message is " + length + " characters long.");
		System.out.println("The first character is at position 0 and is '" + userMessage.charAt(0) + "'");
		System.out.println("The last character is at position " + (length-1) + " and is '" + userMessage.charAt(length-1) + "'");
		
		System.out.println("\nHere are all the characters, one at a time:\n");
		
		for (int i = 0; i < length; i++) {
			System.out.println(i + " - '" + userMessage.charAt(i) + "'");
		}
	}
}
