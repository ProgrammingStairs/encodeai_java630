package myPackage;

import java.util.LinkedList;

public class LinkedList1{
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.addLast(500);
		list.add(3444);
		list.addFirst(200);
		list.add(300);
		list.add(400);
		list.add(600);		
		System.out.println("Elements : "+list);
	}
}