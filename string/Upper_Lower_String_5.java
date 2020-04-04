package string;

import java.util.Scanner;

//5.	Write a Java program to convert lowercase string to uppercase.
public class Upper_Lower_String_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter String in Uppercase");
		String up=sc.nextLine();
		
		System.out.println("In lOwerCase- "+up.toLowerCase());
		
		System.out.println("Enter String in Lowercase");
		String lo=sc.nextLine();
		
		System.out.println("In UpperCase- "+lo.toUpperCase());
	
	}

}
