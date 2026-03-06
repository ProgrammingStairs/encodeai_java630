package myPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
		public static void main(String args[]) {
			Set<Integer> set;
			long startTime,endTime;
			
			set = new HashSet<Integer>();
			startTime = System.nanoTime();
			for(int i=1;i<=100;i++) {
				set.add(i);
			}
			endTime = System.nanoTime();
			System.out.println("Time Taken by HashSet : "+(endTime-startTime));
			
			set = new LinkedHashSet<Integer>();
			startTime = System.nanoTime();
			for(int i=1;i<=100;i++) {
				set.add(i);
			}
			endTime = System.nanoTime();
			System.out.println("Time Taken by LinkedHashSet : "+(endTime-startTime));
			
			set = new TreeSet<Integer>();
			startTime = System.nanoTime();
			for(int i=1;i<=100;i++) {
				set.add(i);
			}
			endTime = System.nanoTime();
			System.out.println("Time Taken by TreeSet : "+(endTime-startTime));
			
		}
}
