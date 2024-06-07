package arrays;

import java.util.Scanner;

public class Sum_array_elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int k = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the element : ");
			arr[i] = sc.nextInt();	
			k += arr[i]; 
		}
		
		System.out.println("Sum of all the elements of array is : " + k);
		
		sc.close();
	}
}
