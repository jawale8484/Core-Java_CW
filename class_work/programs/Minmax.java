package class_work.programs;

import java.util.Scanner;

public class Minmax {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter the two no,:-");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	if(num1>num2) {
		System.out.println("maximum number is-"+num1);
	}
	else if(num2>num1) {
		System.out.println("maximum number is-"+num2);
		
	}
	if(num1<num2) {
		System.out.println("minimum number is-"+num1);
	}
	else if(num2<num1) {
		System.out.println("minimun=m number is-"+num2);
	}
	
}
}
