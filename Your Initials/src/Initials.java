
public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String space = "    ";
		String[][] a = new String[][] {{" ", " " , "a" , " " , " "},
									   {" ", "a" , "" , "a" , " "},
									   {"a", " " , " " , " " , "a"},
									   {"a", "a" , "a" , "a" , "a"},
									   {"a", " " , " " , " " , "a"},
									   {"a", " " , " " , " " , "a"},
									   {"a", " " , " " , " " , "a"}};
									   
		String[][] c = new String[][] {{" ", "c" , "c" , "c" , " "},
									   {"c", " " , " " , " " , "c"},
									   {"c", " " , " " , " " , " "},
									   {"c", " " , " " , " " , " "},
									   {"c", " " , " " , " " , " "},
									   {"c", " " , " " , " " , "c"},
									   {" ", "c" , "c" , "c" , " "}};
									   
		String[][] r = new String[][] {{"r", "r" , "r" , "r" , " "},
									   {"r", " " , " " , " " , "r"},
									   {"r", " " , " " , " " , "r"},
									   {"r", "r" , "r" , "r" , " "},
									   {"r", " " , "r" , " " , " "},
									   {"r", " " , " " , "r" , " "},
									   {"r", " " , " " , " " , "r"}};
			
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(c[i][j]);
			}
			System.out.print(space);
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j]);
			}
			System.out.print(space);
			for (int j = 0; j < 5; j++) {
				System.out.print(r[i][j]);
			}
			System.out.println("\n");
		}

	}

}
