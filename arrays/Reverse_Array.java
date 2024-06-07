package arrays;

import java.util.Scanner;

public class Reverse_Array {
	
	
	static int[] Swap_Arr(int arr[]) {
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println();
		

		return arr;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of aray : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array brfore reverse");
		
		for(int v : arr) {
			System.out.print(v + " ");
		}
		
		System.out.println("Array after reverse");
		
		for(int v : Swap_Arr(arr)) {
			System.out.print(v + " ");
		}
		
		sc.close();
	}
}
