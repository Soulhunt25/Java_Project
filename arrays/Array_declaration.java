package arrays;

import java.util.Scanner;

public class Array_declaration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the element at position : ");
			arr[i] = sc.nextInt();
		}
		
		for(int v : arr) {
			System.out.print(v + " ");
		}
		
		sc.close();
	}
}