package class_work.programs;

import java.util.Scanner;

public class Weak {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number-");
	int num=sc.nextInt();
	
	switch(num) {
	case 1:
		System.out.println("monday");
		break;
		
	case 2:
		System.out.println("Tuseday");
		break;
	case 3:
		System.out.println("Wensday");
		break;
	case 4:
		System.out.println("tursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
		
		default:
			System.out.println("enter valid input8");
	}
}
}
