import java.util.Scanner;

public class AreaCalculator {
	public static void menu(String[] menuItem)
	{
		for (int i = 0; i < menuItem.length; i++) 
		{
			System.out.println(menuItem[i]);
		}
	}
	
	public static void border(String border)
	{
		for (int i = 0; i < 15; i++) {
			System.out.print(border);
		}
		System.out.println("\n");
	}
	
	public static int getSelection()
	{
		int selection = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		while(selection == 0 || selection > 5)
		{
			System.out.print("Which shape: ");
			selection = userInput.nextInt();
			System.out.println("");
			
			if (selection == 0 || selection > 5)
			{
				System.out.println("Please select a number between 1 and 5");
			}
		}
		return selection;
		
	}
	
	public static int getBase()
	{
		int base;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Base: ");
		base = userInput.nextInt();
		
		return base;
	}
	
	public static int getHeight()
	{
		int height;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Height: ");
		height = userInput.nextInt();
		
		return height;
	}
	
	public static int getLength()
	{
		int length;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Length: ");
		length = userInput.nextInt();
		
		return length;
	}
	
	public static int getWidth()
	{
		int width;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Width: ");
		width = userInput.nextInt();
		
		return width;
	}
	
	public static int getSide()
	{
		int side;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Side: ");
		side = userInput.nextInt();
		
		return side;
	}
	
	public static int getRadius()
	{
		int radius;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Radius: ");
		radius = userInput.nextInt();
		
		return radius;
	}
	
	public static double area_triangle(int base, int height)
	{
		double area = (.5)* (base) * (height);
		
		return area;
	}
	
	public static int area_rectangle(int length, int width)
	{
		int area = length * width;
		
		return area;
	}
	
	public static int area_square(int side)
	{
		int area = side * side;
		
		return area;
	}
	
	public static double area_circle(int radius)
	{
		double area = Math.PI * (radius * radius);
		
		return area;
	}
	
	public static void displayAreaDouble(double area)
	{
		System.out.println("The area is " + area + "\n");
	}
	
	public static void displayAreaIntegar(int area)
	{
		System.out.println("The area is " + area + "\n");
	}
	
	public static void main(String[] args)
	{
		String borderDesign = "-=";
		String[] menuList = new String[] {"1) Triangle", "2) Rectangle", "3) Square", "4) Circle", "5) Quit"};
		int areaInt;
		double areaDouble;
		int menuSelection = 0;
		
		System.out.println("Shape Area Calculator version 0.1 (c) 2016 Craig Rodewald, Inc.");
		
		while(menuSelection != 5){
			border(borderDesign);
			menu(menuList);
			menuSelection = getSelection();
			
			switch (menuSelection) {
			case 1:
				int base = getBase();
				int height = getHeight();
				System.out.println("");
				areaDouble = area_triangle(base, height);
				displayAreaDouble(areaDouble);
				break;
				
			case 2:
				int length = getLength();
				int width = getWidth();
				System.out.println("");
				areaInt = area_rectangle(length, width);
				displayAreaIntegar(areaInt);
				break;
				
			case 3:
				int side = getSide();
				System.out.println("");
				areaInt = area_square(side);
				displayAreaIntegar(areaInt);
				break;
				
			case 4:
				int radius = getRadius();
				System.out.println("");
				areaDouble = area_circle(radius);
				displayAreaDouble(areaDouble);
				break;
	
			default:
				System.out.println("Goodbye");
				break;
			}
		}
	}
}
