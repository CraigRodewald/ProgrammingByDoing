import java.util.Scanner;

public class CountingWhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message;
		int times = 0;
		int index = 0;
		int numbers = 10;
		
		System.out.println("Type in a message and I'll display it several times.");
		
		System.out.print("\nMessage: ");
		message = scan.nextLine();
		
		System.out.print("\nHow many times? ");
		times = scan.nextInt();
		
		while(index < times){
			System.out.println(numbers + ". " + message);
			numbers = numbers + 10;
			index++;
		}
	}
}
