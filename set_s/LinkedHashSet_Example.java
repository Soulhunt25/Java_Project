package set_s;

import java.util.LinkedHashSet;

public class LinkedHashSet_Example {
	static void linked_hash_set() {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		int[] arr = {1,2,6,1,3,2,5};
		
		for(int i : arr) {
			lhs.add(i);
		}
		System.out.println(lhs);
	}
	
	public static void main(String[] args) {
		linked_hash_set();
	}
}

