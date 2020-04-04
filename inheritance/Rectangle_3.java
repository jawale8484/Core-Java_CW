package inheritance;
import java.io.*;


class Rectangle_3 {
	double length;
	double breadth;

	Rectangle_3(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	void area() {
		double area = length * breadth;
		System.out.println("Area of rectangle-" + area);
		System.out.println();
	}
	void perimeter() {
		double per = length + breadth;
		System.out.println("Perimeter of square-" + per);
	}
}
class Square extends Rectangle_3 {

	Square(double side) {
		super(side, side);
	}
	public static void main(String[] args) {
		Square s = new Square(15);
		s.area();
		s.perimeter();
	}
}
