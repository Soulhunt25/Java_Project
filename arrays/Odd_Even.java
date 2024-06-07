package arrays;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int count_1 = 0;
		int count_2 = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the element at position : ");
			arr[i] = sc.nextInt();
			
			if(arr[i] % 2 == 0) {
				count_1++;
			}
			else {
				count_2++;
			}
		}
		
		System.out.println("No. of even element is : " + count_1);
		System.out.println("No. of odd element is : " + count_2);
		
		
		sc.close();
	}
}
