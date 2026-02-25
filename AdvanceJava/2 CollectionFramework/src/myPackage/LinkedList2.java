package myPackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2{
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.offer(100);
		list.offerLast(500);
		list.offer(3444);
		list.offerFirst(200);
		list.add(300);
		list.add(400);
		list.add(600);		
//		System.out.println("Elements : "+list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print("\t"+itr.next());
		}
		
		System.out.println("Minimum element : "+Collections.min(list));
		System.out.println("Maximum element : "+Collections.max(list));
		
		Collections.sort(list);
		System.out.println("Sorted elements : "+list);
		
		Collections.shuffle(list);
		System.out.println("Shuffle elements : "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse elements : "+list);
	}
}