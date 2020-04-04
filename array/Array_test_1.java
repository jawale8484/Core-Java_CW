package array;

import java.util.Scanner;

//1.	Write a program to enter elements in array.

public class Array_test_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Entered alements in array are-");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}
}
