package myPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();	
		System.out.println("List Size : "+list.size());
		System.out.println("Elements: "+list);
		
		list.add(100);
		
		Integer i1 = new Integer(200);
		list.add(i1);
		
		Integer i2 = 300;
		list.add(i2);
		
		list.add(new Integer(400));
		
		list.add(Integer.valueOf(500));
		
		int i3 = Integer.parseInt("600");
		Integer element = i3;
		list.add(element);

		list.add(Integer.parseInt("700"));
		list.add(3, 1000);
		list.set(4, 2000);
		System.out.println("List Size : "+list.size());
		System.out.println("Elements: "+list);
	}
}

