package searching_methods;

public class Binary_Search {

	static int[] bubble_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	static boolean binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			
			int mid = (start + end) / 2;
			
			if (arr[mid] == key) {
				return true;
			}

			else if (key >= arr[mid]) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 9, 6, 4, 3, 5 };
		int key = 6;

		if (binarySearch(bubble_sort(arr), key)) {
			System.out.println("Element found");
		}
	}
}
