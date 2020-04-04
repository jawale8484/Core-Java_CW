package string;

import java.lang.*;
import java.util.Scanner;

//3.	Write a Java program to concatenate two strings.
public class Concatinat_String_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1="HEllo";
		String s2=" Java";
		System.out.println("After concatenate \n"+s1.concat(s2));
		
		System.out.println("Enter first string");
		String fr=sc.nextLine();
		System.out.println("Enter second string");
		String se=sc.nextLine();
		
		System.out.println("After concatenate \n"+fr.concat(se));
	
	}
}
