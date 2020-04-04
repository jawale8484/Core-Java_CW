package exception_handling;

import java.util.Scanner;

/*
2.	WAP to demonstrate runtime stack mechanism
using Arithmetic Exception and handle it using try catch.*/
public class Exception_2 {
	Scanner sc=new Scanner(System.in);
	void show() {
		try {
		System.out.println("Enter two values for division");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Division-"+num1/num2);
		}catch(Exception e){
			System.out.println("Invalid input");
		}
	}
	
public static void main(String[] args) {
	Exception_2 ob=new Exception_2();
	ob.show();
}
}
