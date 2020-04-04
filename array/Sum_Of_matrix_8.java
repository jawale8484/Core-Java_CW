package array;

import java.util.*;

//8.	WAP to sum two matrices.

public class Sum_Of_matrix_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row & coloum size");
		int row = sc.nextInt();
		int col = sc.nextInt();

		// array declaration....

		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int arr3[][] = new int[row][col];

		// first array

		System.out.println("Enter element in first array-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements in first  array are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr1[i][j] + " ");
			}

			System.out.println();
		}

		// second array....
		
		System.out.println();

		System.out.println("Enter elements second in array-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j] = sc.nextInt();

			}
		}
		System.out.println("Elements in second array are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr2[i][j] + " ");
			}

			System.out.println();
		}
		 
		// Third array....
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println();
		System.out.println("Addition of Elements in array are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr3[i][j] + " ");
			}

			System.out.println();
		}
		
	}

}
