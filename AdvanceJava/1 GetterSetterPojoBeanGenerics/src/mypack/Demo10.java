package mypack;

public class Demo10 { 
	public static void main(String[] args) {
		// Autoboxing
		int num = 1000;
		Integer obj = num;
		System.out.println("obj : "+obj);
		
		// unboxing
		int number = obj;
		System.out.println("number : "+number);
		
	}
}
