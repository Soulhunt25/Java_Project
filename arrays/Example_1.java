package arrays;

public class Example_1 {
	
	static int[] reverseArr(int arr[], int size) {
		int i = 0;
		int j = size - 1;
		while(i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
//		for(int i = 0;i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : reverseArr(arr, arr.length)) {
			System.out.print(i + " ");
		}
		
		
	}
}
