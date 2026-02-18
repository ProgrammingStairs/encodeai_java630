package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();	
		System.out.println(list1.isEmpty());

		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(350);
		list1.add(400);

		// method-1
		//System.out.println("Elements : "+list1);
		
		// method-2
		/*
		Iterator<Integer> itr = list1.iterator();
//		System.out.println(list1.iterator().getClass().getName());
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		*/
		
		// method-3
//		for(Iterator<Integer> itr = list1.iterator();itr.hasNext();)
//		{
//			System.out.print(itr.next()+"\t");
//		}
		
		// method-4
//		for(Integer element : list1) {
//			System.out.print(element+"\t");
//		}

		// method-5
//		for(int element : list1) {
//			System.out.print(element+"\t");
//		}

		// method-6
		
		ListIterator<Integer> itr = list1.listIterator();
		System.out.println("Forward direction : ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println("\nBackward direction : ");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+"\t");
		}
		
		System.out.println("\n"+list1.isEmpty());

	}
}

