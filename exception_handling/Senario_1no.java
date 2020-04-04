package exception_handling;

import java.util.Scanner;

public class Senario_1no {
	double division(int divident, int divisor) {
		if(divisor==0) {
			throw new ArithmeticException("Divisor Cannot be zero");			
		}else {
			double result=divident/divisor;
			return result;
		}    
	}
}
class Trowsdemo extends Senario_1no{
	public static void main(String[] args) {
		Trowsdemo ob=new Trowsdemo();
		double result = 0;
		try {
			 result=ob.division(15, 3); 
	//	 result=ob.division(15, 0);  //exception occur
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("the result is-"+result);
		}
	}
}
