
public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 0; i <= 13; i++) {
			if (i<1) {
				System.out.print("x  |\t");
			}
			if (i >= 1 && i <= 13) {
				System.out.print(i-1);
			}
			for (int j = 0; j < 9; j++) {
				if (i<1) {
					System.out.print(j+1 + "\t");
					//System.out.println("===+==========================================================");
				}
				//System.out.println("");
				
			}
		}

	}

}
