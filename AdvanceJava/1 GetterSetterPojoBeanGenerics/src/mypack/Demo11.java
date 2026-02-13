package mypack;

public class Demo11 { 
	public static void main(String[] args) {
		Integer obj = 130;
		System.out.println("result : "+obj.intValue());
		System.out.println("result : "+obj.byteValue());
		System.out.println("result : "+obj.longValue());
		System.out.println("result : "+obj.shortValue());
		System.out.println("result : "+obj.doubleValue());
		System.out.println("result : "+obj.floatValue());
		
		char x = 'a';
		System.out.println("Result : "+Character.isUpperCase(x));
		System.out.println("Result : "+Character.isLowerCase(x));
		System.out.println("Result : "+Character.isAlphabetic(x));
		System.out.println("Result : "+Character.isDigit(x));
		System.out.println("Result : "+Character.isSpace(x));
		System.out.println("Result : "+Character.isWhitespace(x));

	}
}
