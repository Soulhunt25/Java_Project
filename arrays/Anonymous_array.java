package arrays;

public class Anonymous_array {
	
	static int sum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(new int[] {1,2,3}));
	}
}
