import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String name = user.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the geometry calculator");
		System.out.println("Press enter to continue...");
		user.nextLine();
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measure of the base: ");
		String baseStr = user.nextLine();
		System.out.print("\nPlease enter the measure of the height:  ");
		String heightStr = user.nextLine();
		double base = Double.parseDouble(baseStr);
		double height = Double.parseDouble(heightStr);
		System.out.print("\nPlease enter the unit of measure:  ");
		String unit = user.nextLine();
		double area = 0.5*(base*height);
		System.out.println("The area of the triangle is " + area + " " + unit + "^2");
		System.out.println("Press enter to continue...");
		user.nextLine();
		
		
		
		System.out.println("VOLUME OF A RECTANGULAR PRISM");
		System.out.print("Please enter the measure of the height:  ");
		String pHeightStr = user.nextLine();
		System.out.print("\nPlease enter the measure of the length:  ");
		String pLengthStr = user.nextLine();
		System.out.print("\nPlease enter the measure of the width:  ");
		String pWidthStr = user.nextLine();
		double pLength = Double.parseDouble(pLengthStr);
		double pHeight = Double.parseDouble(pHeightStr);
		double pWidth = Double.parseDouble(pWidthStr);
		System.out.print("\nPlease enter the unit of measure:  ");
		String pUnit = user.nextLine();
		double volume = pLength*pHeight*pWidth;
		System.out.println("The volume of the prism is " + volume + " " + pUnit + "^3");
		System.out.println("Press enter to continue...");
		user.nextLine();
		
		
		
		System.out.println("QUADRATIC FORMULA");
		System.out.print("Please enter A:  ");
		String strA = user.nextLine();
		System.out.print("\nPlease enter B:  ");
		String strB = user.nextLine();
		System.out.print("\nPlease enter C:  ");
		String strC = user.nextLine();
		double A = Double.parseDouble(strA);
		double B = Double.parseDouble(strB);
		double C = Double.parseDouble(strC);
		double square = B*B;
		double multi = 4*A*C;
		double sqrt = Math.sqrt(square - multi);
		double numerator = -B + sqrt;
		double fin1 = numerator / (2*A);
		double num2 = -B - sqrt;
		double fin2 = num2 / (2*A);
		System.out.print("X = " + fin1 + " or " + fin2);
		
		
		
		
	}

}
