package exception_handling;

import java.util.Scanner;

//3.	WAP to show unchecked exception and use multiple catch blocks.
public class Unchecked_Exception_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values for division");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			System.out.println("Division is-"+num1/num2);
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBound");
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			System.out.println("Arithamatic Exception");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Exception Occure");
			e.printStackTrace();
		}
		finally {
			System.out.println("End-of-program");
		}
	}

}
