package arrays;

import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr the row size : ");
		int rows = sc.nextInt();
		
		System.out.print("Enetr the column size : ");
		int cols = sc.nextInt();
		
		// Creation of 2D array
		
		int[][] arr = new int[rows][cols];
		
		// Enter the elements in array
		
		System.out.println("Enetr the element in array.");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// Display
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
