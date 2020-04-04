package class_work.programs;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	double base,exponatial,ans;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter base");
	base=sc.nextInt();
	System.out.println("Enter exponatial");
	exponatial=sc.nextInt();
	
	ans=Math.pow(base,exponatial);
	System.out.println("power is"+ans);
}
}
