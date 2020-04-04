package methods;

/*4.	Create a class to print the area of a square and a rectangle.
The class has two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters which are 
length and breadth respectively while the other method for
printing area of square has one parameter which is side of square.*/

   class Area{
	void square(int side1) {
		int area=side1*side1;
		System.out.println("Area os Squarq"+area);
		
	}
	void square(float length,float breadth) {
	float area=length*breadth;
	System.out.println("Area of rectangle"+area);
	
}}

public  class Square_rectangle_4 {
	public static void main (String[] args) {
		Area a=new Area();
		a.square(15);
		a.square(15.155f , 10.556f);
	}

}
