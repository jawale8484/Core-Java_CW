package array;
// 7.	WAP to accept data in 2D array and print the data

import java.util.Scanner;

public class Array_2d_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the row & colum size");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		
		
		System.out.println("Enter the elements in array-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements in multidimentional array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
