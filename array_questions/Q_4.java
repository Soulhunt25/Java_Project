package array_questions;

import java.util.Scanner;

public class Q_4 {

	static int difference(int[] arr) {
		int difference = 0;
		int sum_1 = 0;
		int sum_2 = 0;

		for (int j : arr) {
			if(j % 2 == 0) {
				sum_1 += j;
			}
			else {
				sum_2 += j;
			}
		}
		
		if(sum_1 > sum_2) difference = sum_1 - sum_2;
		
		else difference = sum_2 - sum_1;
		
		return difference;
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

		System.out.print("Difference of sum of even elements and odd elements of array is  : " + difference(arr));

		sc.close();
	}
}