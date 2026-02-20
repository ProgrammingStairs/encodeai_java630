package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Enter Elements : ");
			list.add(sc.nextInt());
		}
		System.out.println("Array list elements are : ");
		for(int element : list) {
			System.out.print(element+"\t");
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

