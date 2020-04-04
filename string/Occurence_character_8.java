package string;

import java.util.Scanner;

//8.	Write a Java program to find first occurrence of a character in a given string.
public class Occurence_character_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println("Enter a charcter");
		char c=sc.next().charAt(0);
		
		
		int count=1;
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]+" "+count);
					count++;		
		}	
		System.out.println("\n First occerance...in string");
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==c) {
				System.out.println(ch[i]+" "+i);
			}
		}
		
		
		
	}

}
