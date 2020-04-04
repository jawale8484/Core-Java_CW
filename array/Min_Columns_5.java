package array;
//5.	WAP to print minimum in columns.

//Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 12, 5, 2.

import java.util.Scanner;

public class Min_Columns_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter size  of array");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		
		
		System.out.println("Enter the elements in array-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Entered Elements in array are-");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	

	}
}
