package mypack;
public class Demo13 { 
	public static void main(String[] args) {
		String str1 = Integer.toString(100);
		String str2 = Integer.toString(200);
		
		Integer obj1 = 200;
		Integer obj2 = 300;
		
		System.out.println("Sum : "+(obj1+obj2));
		
		String str3 = obj1.toString();
		String str4 = obj2.toString();
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);

	}
}
