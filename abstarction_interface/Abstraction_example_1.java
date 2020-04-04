package abstarction_interface;
//1.	Explain the concept of abstraction with a suitable example.
abstract class exampel{
	abstract void m1();
	void exam() {
		System.out.println("Method without abstract in abstract class");
		
	}
}
 
public class Abstraction_example_1 extends exampel{

	@Override
	void m1() {
		System.out.println("Abstarct method defination in extend class");
		System.out.println("--------------");
	}
	public static void main(String[] args) {
		
	Abstraction_example_1  ob=new Abstraction_example_1();
	ob.m1();
	ob.exam();
	
	}	

}
