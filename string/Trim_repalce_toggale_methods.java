package string;

import java.util.Scanner;

//9.	Write a Java program to trim trailing and lidding white space characters in a string

public class Trim_repalce_toggale_methods {
	Scanner sc = new Scanner(System.in);

	void m1trim() {

		System.out.println("Enter a string");
		String s = sc.nextLine();

		System.out.println(s);
		System.out.println(s.trim());

	}

	void removespace() {

		// 11. Write a Java program to remove all extra blank spaces from a given
		// string.
		System.out.println("Enter a sring");
		String s=sc.nextLine();
		
		System.out.println(s.replace(" ","@"));
			

	}
//	12.	Write a Java program to toggle case of each character of a string.
	void toggle() {
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		char[] ch=s.toCharArray();
		System.out.println("After toggale-");
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char) (ch[i]+32);
			}else
			{
				ch[i]=(char) (ch[i]-32);
			}
			System.out.print(ch[i]);
		}
		
		
	}

	public static void main(String[] args) {

		Trim_repalce_toggale_methods ob = new Trim_repalce_toggale_methods();
		//ob.m1trim();    // trim
		//ob.removespace();   //remove spaces
		ob.toggle();    //toggale method
	}

}
