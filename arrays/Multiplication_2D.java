package arrays;

import java.util.Scanner;

public class Multiplication_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of row of matrix_1 : ");
		int n = sc.nextInt();

		System.out.print("Enter the size of column of matrix_1 : ");
		int m = sc.nextInt();
		
		int[][] arr_1 = new int[n][m];
		System.out.println("Enter the elements of first matrix :-");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr_1[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter the size of row of matrix_2 : ");
		int a = sc.nextInt();

		System.out.print("Enter the size of column of matrix_2 : ");
		int b = sc.nextInt();
		
		int[][] arr_2 = new int[a][b];
		System.out.println("Enter the elements of first matrix :-");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr_2[i][j] = sc.nextInt();
			}
		}
		
		
		
		sc.close();
	}
}
