package mypack;

public class Demo3 {
	void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : \na : "+a+"\nb : "+b);
	}
	void swap(double a,double b) {
		double temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : \na : "+a+"\nb : "+b);
	}
	void swap(char a,char b) {
		char temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : \na : "+a+"\nb : "+b);
	}

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		int a1 = 5, b1 = 6;
		System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
		obj.swap(a1,b1);
		
		double a2 = 45.56, b2 = 56.67;
		System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
		obj.swap(a2,b2);
		
		char a3 = 'a', b3 = 'c';
		System.out.println("Before Swapping : \na : "+a3+"\nb : "+b3);
		obj.swap(a3,b3);
		
	}

}
