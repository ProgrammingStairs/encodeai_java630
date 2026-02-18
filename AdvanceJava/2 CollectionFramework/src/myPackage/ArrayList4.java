package myPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();	
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(null);
		list1.add(400);
		
		ArrayList<Integer> list2 = new ArrayList<>();	
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(null);
		list2.add(600);
		
		//list1.addAll(list2);
//		list1.removeAll(list2);
		list1.retainAll(list2);
		System.out.println("addAll : "+list1);
		
	}
}

