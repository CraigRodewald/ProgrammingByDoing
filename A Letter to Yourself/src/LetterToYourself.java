
public class LetterToYourself {

	public static void main(String[] args) {
		//Initialize variables
		String symbolTop = "-";
		String symbolSide = "|";
		String symbolSpace = " ";
		String symbolCorner = "+";
		String stamp = "#### ";
		String addressLine1 = "Craig Rodewald";
		String addressLine2 = "18729 Beatrice St";
		String addressLine3 = "Clinton Township, MI 48036";
		
		System.out.print(symbolCorner);
		//This creates the top line of the letter
		for (int i = 0; i < 60; i++) {
			System.out.print(symbolTop);
		}
		
		System.out.print(symbolCorner + "\n");
		
		for (int j = 0; j < 9; j++) {
			System.out.print(symbolSide);
			
			//This creates the stamp
			if (j < 3) {
				for (int k = 0; k < 60 - stamp.length(); k++) {
					System.out.print(symbolSpace);
				}
				System.out.print(stamp);
			}
			
			//This puts the address name in
			else if (j == 4) {
				for (int k = 0; k < 60 - (addressLine3.length()+4); k++) {
					System.out.print(symbolSpace);
				}
				
				System.out.print(addressLine1);
				
				for (int k = 0; k < (addressLine3.length()-addressLine1.length()) + 4; k++) {
					System.out.print(symbolSpace);
				}
			}
			
			//This puts the street address
			else if (j == 5) {
				for (int k = 0; k < 60 - (addressLine3.length()+4); k++) {
					System.out.print(symbolSpace);
				}
				
				System.out.print(addressLine2);
				
				for (int k = 0; k < (addressLine3.length()-addressLine2.length()) + 4; k++) {
					System.out.print(symbolSpace);
				}
			}
			
			//This puts the address city, state and zip
			else if (j == 6) {
				for (int k = 0; k < 60 - (addressLine3.length()+4); k++) {
					System.out.print(symbolSpace);
				}
				
				System.out.print(addressLine3);
				
				for (int k = 0; k < 4; k++) {
					System.out.print(symbolSpace);
				}
			}
			
			else {
				for (int k = 0; k < 60; k++) {
					System.out.print(symbolSpace);
				}
			}
			
			System.out.print(symbolSide + "\n");
		
		}
		//This creates the bottom line of the letter
		System.out.print(symbolCorner);
		
		for (int i = 0; i < 60; i++) {
			System.out.print(symbolTop);
		}
		
		System.out.print(symbolCorner);

	}

}
