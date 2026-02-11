package mypack;

public class Demo7 { 
	public static void main(String[] args) {
		Integer obj = Integer.valueOf(100);
		System.out.println("object : "+obj);
		
		Integer obj1 = Integer.valueOf("100");
		System.out.println("object : "+obj1);
		
		Integer obj2 = Integer.valueOf("100", 2);
		System.out.println("object : "+obj2);
		
	}
}

