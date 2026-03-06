package myPackage;

import java.util.PriorityQueue;

public class QueueDemo2 {
	public static void main(String args[]) {
		PriorityQueue<Character> queue = new PriorityQueue<Character>();
		
//		queue.add('A');
//		System.out.print(queue);
//		System.out.print("\nelement : "+queue.element());
		// if no element found then exception takes place
		
//		queue.add('A');
//		System.out.print(queue);
		//System.out.print("\npeek : "+queue.peek());
		// if no element found then it prints null
		
//		queue.add('A');queue.pop()
//		System.out.print(queue);
//		System.out.print("\npoll : "+queue.poll());
		// if no element found then it prints null
		
//		queue.add('A');
//		System.out.print(queue);
		System.out.print("\nremove : "+queue.remove());
		// if no element found then exception takes place
	
	}
}
