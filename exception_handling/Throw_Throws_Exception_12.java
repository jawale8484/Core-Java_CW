package exception_handling;

import java.io.IOException;

//12.	WAP to show the usage of throw and throws for unchecked exception
public class Throw_Throws_Exception_12 {
	
	void m() throws ArithmeticException{
		System.out.println(10/0);
	}
	void a() {
		throw new ArithmeticException("invalid input");
	}
	
	public static void main(String[] args) {
		Throw_Throws_Exception_12 ob=new Throw_Throws_Exception_12();
		ob.m();
		ob.a();
	}

}
