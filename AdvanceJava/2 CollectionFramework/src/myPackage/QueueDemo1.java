package myPackage;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {
	public static void main(String args[]) {
		PriorityQueue<Character> queue = new PriorityQueue<Character>();
		queue.add('A');
		queue.offer('B');
		queue.add('C');
		queue.offer('D');
		queue.add('E');
		queue.add('F');
		queue.remove('D');
		queue.remove(new Character('C'));
		
		System.out.println("Queue Elements are : ");
//		System.out.println("Queue : "+queue);
		Iterator<Character> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
}
