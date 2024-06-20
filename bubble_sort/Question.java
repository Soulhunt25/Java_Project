package bubble_sort;

// solve using hash map in another class hashMap 

public class Question {

	static int[] countGreaterElements(int[] arr) {
		int[] count = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int countt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					countt++;
				}
			}
			count[i] = countt;
		}

		return count;
	}

	public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
 
        for (int i : countGreaterElements(arr)) {
            System.out.print(i + " ");
        }
    }
}
