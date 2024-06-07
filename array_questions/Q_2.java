package array_questions;

import java.util.Scanner;

public class Q_2 {

	static int sum(int[] arr) {
		int sum = 0;

		for (int j : arr) {
			sum += j;
		}
		
		return sum;
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

		System.out.print("Sum of all the element of array is  : " + sum(arr));

		sc.close();
	}
}
