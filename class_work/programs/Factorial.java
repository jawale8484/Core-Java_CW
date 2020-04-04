package class_work.programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		for (int i = num; i >1; i--) {
			fact=fact*i;
		}
		System.out.println("factorial is:-"+fact);
		
		
		}

}
 