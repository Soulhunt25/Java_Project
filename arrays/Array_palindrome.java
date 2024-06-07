package arrays;

public class Array_palindrome {
	
	static boolean palindrome_Arr(int arr[], int size) {
		int i = 0;
		int j = size - 1;
		
		while(i <= j) {
			if(arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,4,3,2,1};
		
		System.out.println(palindrome_Arr(arr,arr.length) ? "Array is palindrome" : "Array is not palindrome");
	}
}
