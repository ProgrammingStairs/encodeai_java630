package mypack;

public class Demo8 { 
	public static void main(String[] args) {
//		Integer obj = new Integer(1000);
		Integer obj = Integer.valueOf(100);
		System.out.println("object : "+obj);
		System.out.println("Name : "+obj.getClass().getName());
		System.out.println(obj instanceof Integer);
	}
}
