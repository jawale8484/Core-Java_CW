package array;

import java.util.Scanner;

//2.	How to pass array as a parameter to method in java?

public class Paramater_array_2 {
	static int size;

	void m1(int a[]) {
		System.out.println("Entered array are-");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = sc.nextInt();

		int a[]=new int[size];
		System.out.println("Enter " + size + " Elements in array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}

		Paramater_array_2 ob = new Paramater_array_2();
		
			ob.m1(a);

		}
	}


