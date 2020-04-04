package abstarction_interface;

/*2.	Create an abstract class Machine with an implemented / concrete method 
rotate and an abstract method crush. Create a class Juicer which extends this
abstract class Machine and implements method crush. Now, add another method filter 
in the class Juicer. In main method,*/
//a.	Create an object of type Juicer and calls its crush, rotate and filter methods.
//b.	Create an object of type Juicer with reference variable of Machine (Machine m = new Juicer).
//Check the methods available to m.

abstract class machine_2 {
	void rotate() {
		System.out.println("THis is rotate method in abstract class");
	}

	abstract void crush();

}
abstract class mixer extends machine_2{
	void crush() {
		System.out.println("Crush method which is abstract class mixer");
	}
	void blend() {
		System.out.println("Blend method in Abstract class mixer");
	}
}

class Juicer extends machine_2 {

	@Override
	void crush() {
		System.out.println("This is abstract method crush ");

	}

	void filter() {
		System.out.println("This is filter method from juicer ");
	}

	public static void main(String[] args) {
		Juicer ob = new Juicer();
		ob.crush();
		ob.rotate();
		ob.filter();

		machine_2 m = new Juicer();
		m.crush();
		m.rotate();
		
		//mixer obm=new mixer();   // we cannot create object of abstract class
		
		
		

	}

}
