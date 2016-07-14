
public class Square implements Shape{

	private double side;
	
	//default constructor
	public Square(){
		side = 1;
	}
	
	public Square(double side){
		this.side = side;
	}
	
	//override method
	public double getPerimeter() {
		return 4 * (side); 
	}

	//override method
	public double getArea() {
		return side * side;
	}
}
