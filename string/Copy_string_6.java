package string;

import java.util.Scanner;

public class Copy_string_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First string");
		String fr=sc.nextLine();
		
		String s=fr.intern();
		System.out.println("Coppy in another string");
		System.out.println("After coppy "+s);
		
		System.out.println("Enter second string");
		String se=sc.nextLine();
		
		String ne=se;
		System.out.println(ne);
		 
	}

}
