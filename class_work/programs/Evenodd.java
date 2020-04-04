package class_work.programs;

import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) 
{   int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the nuber-");
	num=sc.nextInt();
	
	if(num%2==0) {
		System.out.println("number is even="+num);
		}
	else {
		
	System.out.println("number is odd-"+num);
	}
}
}
