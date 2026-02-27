package myPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
		public static void main(String args[]) {
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(100);
			set.add(200);
			set.add(700);
			set.add(80);
			System.out.println("set : "+set);

			LinkedHashSet<Double> linked_set = new LinkedHashSet<Double>();
			linked_set.add(10.40);
			linked_set.add(200.54);
			linked_set.add(700.4);
			linked_set.add(80.56);
			System.out.println("\nset : "+linked_set);
			
			TreeSet<Character> tree = new TreeSet<Character>();
			tree.add('a');
			tree.add('D');
			tree.add('A');
			tree.add('z');
			System.out.println("\nset : "+tree);


		}
}
