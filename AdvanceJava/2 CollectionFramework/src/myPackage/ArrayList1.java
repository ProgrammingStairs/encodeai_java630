package myPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
//		List list = new ArrayList();
		ArrayList list = new ArrayList();
		list.add(200);
		list.add(45.56);
		list.add(true);
		list.add('n');
		list.add("Hello");
		
		System.out.println("Elements : "+list);
	}
}

