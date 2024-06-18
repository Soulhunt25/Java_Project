package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_example {
	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		
		L1.offer(1);
		L1.offer(2);
		L1.offer(3);
		L1.offer(4);
		L1.offer(5);
		L1.offer(6);
		L1.offer(7);
		L1.offer(8);
		L1.offer(9);
		L1.offer(10);
		
		int sum = 0;
		
		for (Iterator<Integer> iterator = L1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			sum += integer;
		}
		
		System.out.println("Sum of all the element of list is : " + sum);
		
		System.out.println(L1);
		
		L1.remove(4);
		
		System.out.println();
		
		System.out.println(L1);
		
		System.out.println();
		
		System.out.println(L1.indexOf(2));
	}
}
