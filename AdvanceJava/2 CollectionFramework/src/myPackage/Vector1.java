package myPackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Vector1{
	public static void main(String args[]) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(100);
		vec.add(10);
		vec.add(300);
		vec.add(240);
		vec.add(8760);
		vec.add(23);
		
		System.out.println("Elements : ");
		Enumeration<Integer> em = vec.elements();
		while(em.hasMoreElements()) {
			System.out.print("\t"+em.nextElement());
		}
		System.out.println("Elements : ");
		
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext()) {
			System.out.print("\t"+itr.next());
		}
		
		System.out.println("Minimum element : "+Collections.min(vec));
		System.out.println("Maximum element : "+Collections.max(vec));
		
		Collections.sort(vec);
		System.out.println("Sorted elements : "+vec);
		
		Collections.shuffle(vec);
		System.out.println("Shuffle elements : "+vec);
		
		Collections.reverse(vec);
		System.out.println("Reverse elements : "+vec);
	}
}