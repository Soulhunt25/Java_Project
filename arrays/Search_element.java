package arrays;

// linear search algorithm
// time complexity O(n)
// space complexity O(1)

public class Search_element {
	
	static boolean search(int[] arr, int key) {
		for(int i : arr) {
			if(i == key) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,4,2,7,3};
		
		int key = 5; // return false
//		int key = 2; // return true
		
		System.out.println(search(arr,key) ? "true" : "false");
		
	}
}
