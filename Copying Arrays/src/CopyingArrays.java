import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int number;
		
		for (int i = 0; i < array1.length; i++) {
			number = 1 + r.nextInt(100);
			array1[i] = number;
		}
		
		array2 = array1;
		
		array1[array1.length -1] = -7;
		
		System.out.print("Array 1: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("");
		System.out.print("Array 2: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
