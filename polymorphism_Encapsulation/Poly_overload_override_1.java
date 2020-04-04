package polymorphism_Encapsulation;
//Q. Example for polymorphism   

class overload {
	void demo() {
		System.out.println("This is first method in parent class");
	}
	void demo(int a) {
		System.out.println("This is second Overloding method in parent class ");
	}

}

public class Poly_overload_override_1  extends overload{
	void demo() {
		System.out.println("This is Over-rided method in child class");
	}
public static void main(String[] args) {
	Poly_overload_override_1 ob=new Poly_overload_override_1();
		ob.demo();
		ob.demo(10);
}
}
