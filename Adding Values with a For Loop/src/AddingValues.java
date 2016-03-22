import java.util.Scanner;

public class AddingValues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		int sum = 0;
		
		System.out.print("Number: ");
		number = scan.nextInt();
		System.out.println();
		
		for (int i = 1; i < number+1; i++) {
			System.out.print(i + " ");
			sum = sum + i;
		}
		
		System.out.println("\nThe sum is " + sum);
		
		scan.close();
	}
}
