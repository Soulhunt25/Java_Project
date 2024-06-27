package set_s;

import java.util.HashMap;

public class Hash_Map {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(0));
		hm.replace(3, 35);
		System.out.println(hm);
		hm.put(7,hm.getOrDefault(7, 0));
		System.out.println(hm);
		hm.getOrDefault(2, 0);
		System.out.println(hm);
	}
}
