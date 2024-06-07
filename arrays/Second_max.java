package arrays;

import java.util.Scanner;

public class Second_max {
	
	static int max(int arr[]) {
		
		int max_1 = Integer.MIN_VALUE;
		int max_2 = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max_1) {
				max_2 = max_1;
				max_1 = arr[i];
			}
			
			else if(max_2 > arr[i] && arr[i] != max_1) {
				max_2 = arr[i];
			}
		}
		
		return max_2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the values of array.");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second maximum value of array is : " + max(arr));
		
		sc.close();
	}
}
