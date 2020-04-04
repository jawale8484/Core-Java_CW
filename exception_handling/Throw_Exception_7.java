package exception_handling;
//7.	WAP to throw exception to check if still finally should get executed

import java.util.Scanner;

public class Throw_Exception_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new ArithmeticException("Age Out Of Bound");
		}else {
			System.out.println("You are eligible---");
		}
		
		/*
		 * finally { System.out.println(); }   finally are not work in throw exception
		 */
	}
}
