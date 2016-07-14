import java.util.Scanner;


public class AreaUsingInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		//Rectangle
		Shape s1 = new Rectangle();
		System.out.println("Details of Rectangle");
		System.out.println();
		System.out.println("With default values of length and breadth: 1 cm and 1 cm");
		System.out.println("Area of Rectangle: " + s1.getArea() + " cm2"); 
		System.out.println("Perimeter of Rectangle: " + s1.getPerimeter() + " cm");
		System.out.println();
		System.out.println("With user specified values");
		System.out.println("Enter Length: ");
		x = sc.nextDouble();
		System.out.println("Enter Breadth: ");
		y = sc.nextDouble();
		s1 = new Rectangle(x, y);
		System.out.println("Area of Rectangle: " + s1.getArea() + " cm2"); 
		System.out.println("Perimeter of Rectangle: " + s1.getPerimeter() + " cm");
		System.out.println();
		
		//Square
		Shape s2 = new Square();
		System.out.println("Details of Square");
		System.out.println();
		System.out.println("With default value of side: 1 cm");
		System.out.println("Area of Square: " + s2.getArea() + " cm2"); 
		System.out.println("Perimeter of Square: " + s2.getPerimeter() + " cm");
		System.out.println();
		System.out.println("With user specified values");
		System.out.println("Enter Side: ");
		x = sc.nextDouble();
		s2 = new Square(x);
		System.out.println("Area of Square: " + s2.getArea() + " cm2"); 
		System.out.println("Perimeter of Square: " + s2.getPerimeter() + " cm");
		System.out.println();
		
		//Circle
		Shape s3 = new Circle();
		System.out.println("Details of Circle");
		System.out.println();
		System.out.println("With default value of radius: 1");
		System.out.println("Area of Circle: " + s3.getArea()); 
		System.out.println("Perimeter of Circle: " + s3.getPerimeter());
		System.out.println();
		System.out.println("With user specified values");
		System.out.println("Enter Radius: ");
		x = sc.nextDouble();
		s3 = new Circle(x);
		System.out.println("Area of Circle: " + s3.getArea()); 
		System.out.println("Perimeter of Circle: " + s3.getPerimeter());
		System.out.println();
		
		
	}

}
