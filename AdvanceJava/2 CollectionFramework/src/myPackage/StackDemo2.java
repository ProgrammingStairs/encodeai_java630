package myPackage;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo2 {
	static void display(Stack<Integer> stack) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Empty : "+stack.empty());
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		System.out.println(stack);
		for(int i=1;i<=size;i++) {
			System.out.println("Enter Element : ");
			stack.push(sc.nextInt());
			System.out.println(stack);			
		}
		System.out.println("Empty : "+stack.isEmpty());
		System.out.println("Search : "+stack.search(100));

		System.out.println("Top element : "+stack.peek());
		for(int i=1;i<=size;i++) {
			System.out.println("Element going to remove : "+stack.pop());
			System.out.println(stack);			
		}	
	}
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		display(stack);
	}
}
