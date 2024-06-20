package bubble_sort;

public class Bubble_sort_example {
	
	static int[] bubble_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	static boolean search(int[] arr, int key) {
		for(int i : arr) {
			if(i == key) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {9,8,7,5,6,4,5,5,4,2,6,1,2,3};
		
		int key = 6;
		
		int[] sorted_arr = bubble_sort(arr);
		
		System.out.println(search(sorted_arr, key) ? "element found" : "element not found");
	}
}
