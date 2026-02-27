package myPackage;

import java.util.Stack;

public class StackDemo1 {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack);
		stack.add(null);
		System.out.println(stack);
		stack.add(10);
		System.out.println(stack);
		stack.add(30);
		System.out.println(stack);
		stack.add(70);
		System.out.println(stack);
		stack.add(101);
		System.out.println(stack);
	}
}
