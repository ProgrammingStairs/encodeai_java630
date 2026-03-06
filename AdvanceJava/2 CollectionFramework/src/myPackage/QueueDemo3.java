package myPackage;

import java.util.ArrayDeque;
import java.util.Iterator;

public class QueueDemo3 {
	public static void main(String args[]) {
		ArrayDeque<Character> queue = new ArrayDeque<Character>();
		queue.add('A');
		queue.offer('B');
		queue.offerFirst('X');
		queue.add('C');
		queue.offer('D');
		queue.add('E');
		queue.add('F');
		queue.remove('D');
		queue.offerLast('z');
		
		System.out.println("Queue Elements are : ");
//		System.out.println("Queue : "+queue);
		Iterator<Character> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
}
