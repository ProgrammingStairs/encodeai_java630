package myPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo2 {
		public static void main(String args[]) {
			HashSet<String> hash_set = new HashSet<String>();
			LinkedHashSet<String> linked_set = new LinkedHashSet<String>();
			TreeSet<String> tree_set = new TreeSet<String>();
			
			String str[] = {"Mango","Apple","Banana","Guava"};
			for(String fruits : Arrays.asList(str)) {
				hash_set.add(fruits);
				linked_set.add(fruits);
				tree_set.add(fruits);
			}
			
			System.out.println("HashSet : "+hash_set);
			System.out.println("LinkedHashSet : "+linked_set);
			System.out.println("TreeSet : "+tree_set);
		
		}
}
