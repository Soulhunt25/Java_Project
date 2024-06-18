package arraylist_;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(al.size());
		
		al.add(2, 56);
		al.remove(2);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		for (Iterator<Integer> iterator = al.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
	}
}

// size() : Return the size of arrayList
// get(index) : Return the value of particular index
// remove(value) : Remove the value form ArrayList
// add(index, value) : Insert the value at a particular index of arrayList