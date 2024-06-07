package arrays;

import java.util.Scanner;

public class Linear_Search {

	
	
	static boolean Search(int[] arr, int a) {
		for (int i : arr) {
			if (i == a) return true;
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the element : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element you want to find : ");
		int a = sc.nextInt();

		System.out.println(Search(arr, a) ? "Element found" : "Element not found");

		sc.close();
	}
}
