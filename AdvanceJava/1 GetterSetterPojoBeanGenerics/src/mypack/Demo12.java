package mypack;
import java.util.Scanner;
public class Demo12 { 
	static void validateNumber(String number) {
		boolean status=true;
		if(number.length()!=10)
			status = false;
		else {
			if(number.charAt(0)>=54) {
				for(int i=0;i<10;i++) {
					char ch = number.charAt(i);
					if(!Character.isDigit(ch)) {
						status = false;
					}
				}
			}else {
				status = false;
			}
		}
		String res = status ? "Valid Mobile Number" : "Invalid mobile number";
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 digit mobile number : ");
		String number = sc.next();
		validateNumber(number);
	}
}
