import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		// Declare variables
		
		String name;
		int age;
		double salary;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hello.  What is your name? ");
		name = userInput.nextLine();
		
		System.out.println("Hi, " + name + "!  How old are you?");
		age = userInput.nextInt();
		
		System.out.println("So you're " + age + ", eh?  That's not old at all!\nHow much do you make, " + name);
		salary = userInput.nextDouble();
		
		System.out.println(salary + "!  I hope that's per hour and not per year! LOL!");

	}

}
