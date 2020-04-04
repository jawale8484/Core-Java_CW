package class_work.programs;

import java.util.Scanner;

public class Vovel {
public static void main(String[] args) {

	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Alphabate-");
	char ch=sc.next().charAt(0);

	switch(ch)
	{
	case 'a':
		System.out.println("It is vovel");
		break;
	
	case 'e':
		System.out.println("It is vovel");
		break;
	case 'i':
		System.out.println("It is vovel");
		break;
	case 'o':
		System.out.println("It is vovle");
		break;
	case'u':
		System.out.println("It is vovle");
		break;
		
	default:
		System.out.println("It is consonant");
		
	}
	
}
	}
