package class_work.programs;

import java.util.Scanner;

public class Sum_of_digit {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter digit");
	int num=sc.nextInt();
	
	for (int i = num; i >=1; i--) {
		sum=sum+i;

	}
	System.out.println("sum is"+sum);
}
}
