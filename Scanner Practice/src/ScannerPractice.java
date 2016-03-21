import java.util.Scanner;

public class ScannerPractice 
{
	
	public static String getInput(Scanner userInput)
	{
		//Initialize variables
		String userText;

		System.out.print("Enter some kind of text or 'quit' to quit: ");
		userText = userInput.nextLine();
		
		return userText;
	}

	public static void main(String[] args)
	{
		//Initialize variables
		String textFromUser = "";
		Scanner userInput = new Scanner(System.in);
	
		do
		{
			textFromUser = getInput(userInput);

			System.out.println(textFromUser);
			
		} while (textFromUser != "quit");
		
		System.out.println("Goodbye");
		userInput.close();
	}

}
