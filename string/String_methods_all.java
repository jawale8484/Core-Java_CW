package string;

import java.util.Scanner;

//4.	Write a Java program to compare two strings.
public class String_methods_all {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		
		System.out.println("\n After compare using campare-"+s1.compareTo(s2));
		System.out.println("---------------------------");
		
		System.out.println("\n After compare using equls-"+s1.equals(s2));
		System.out.println("---------------------------");
		
		//...if using equal 
		if(s1.equals(s2)) {
			System.out.println(s1+" \n -String are Equals- "+s2);
		}else {
			System.out.println(s1+" \n -String not equals- "+s2);
		}
		System.out.println("---------------------------");
		
		//using equals ignore case
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println(s1+" Equals using ignorne quals case "+s2);
		}else {
			System.out.println(s1+" NOt equals using equals ignor case "+s2);
		}
		
		System.out.println("---------------------------");
		
		//literal...
		String sr1="vaibhav";
		String sr2="jawale";
		
		System.out.println("\n using literal ==");
		if(sr1==sr2) {
		
			System.out.println(sr1+" String are Equals "+sr2);
		}else {
			System.out.println(sr1+" Strinr are not equals "+sr2);
		}
		
	}
}
