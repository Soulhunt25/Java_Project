package arrays;

public class Mid_of_array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int low = 0;
		int high = arr.length - 1;
		
		int a = (high+low) / 2;
		int b = (low + (high - low)) / 2;
		
		System.out.println(a);
		
	}
}
