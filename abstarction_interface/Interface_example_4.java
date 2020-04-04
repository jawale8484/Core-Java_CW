package abstarction_interface;
//4.	Explain the concept of interfaces with an example

interface I1 {
	void m1();
}

interface I2 {
   void m2();
   default void m3() {
	   System.out.println("Default m3 method in interface I2");
   }
   static void m4() {
	System.out.println("Private m4 method in interface I2");
}
}

public class Interface_example_4 implements I1,I2{

	@Override
	public void m2() {
		System.out.println("This is m2 method in interface I2");
	}

	@Override
	public void m1() {
		System.out.println("This is m1 method in interface I1 ");
		
	}
	
public static void main(String[] args) {
	Interface_example_4 ob=new Interface_example_4();
	ob.m1();
	ob.m2();
	ob.m3();
	I2.m4();
}
}
