package array_questions;

import java.util.Scanner;

public class Q_3 {

	static int product(int[] arr) {
		int product = 1;

		for (int j : arr) {
			product *= j;
		}
		
		return product;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the element of array :-");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Product of all the element of array is  : " + product(arr));

		sc.close();
	}
}

