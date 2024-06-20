package set_s;

import java.util.*;

public class Hash_Set_Example {
	
	static void hash_set() {
		HashSet<Integer> hs = new HashSet<Integer>();
		int[] arr = {1,2,1,3,2,5};
		
		for(int i : arr) {
			hs.add(i);
		}
		System.out.println(hs);
	}
	
	public static void main(String[] args) {
		hash_set();
	}
}
