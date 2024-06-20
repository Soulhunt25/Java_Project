package set_s;

import java.util.TreeSet;

public class Tree_set {
	static void tree_set() {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		int[] arr = {1,6,2,1,3,2,5};
		
		for(int i : arr) {
			tr.add(i);
		}
		System.out.println(tr);
	}
	
	public static void main(String[] args) {
		tree_set();
	}
}

