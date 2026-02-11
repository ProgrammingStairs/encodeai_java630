package mypack;

public class Demo4<DT> {
	void swap(DT a,DT b) {
		DT temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : \na : "+a+"\nb : "+b);
	}
	public static void main(String[] args) {
		Demo4<Integer> obj1 = new Demo4<>();
		int a1 = 5, b1 = 6;
		System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
		obj1.swap(a1,b1);
		
		Demo4<Double> obj2 = new Demo4<>();
		double a2 = 45.56, b2 = 56.67;
		System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
		obj2.swap(a2,b2);
		
		Demo4<Character> obj3 = new Demo4<>();
		char a3 = 'a', b3 = 'c';
		System.out.println("Before Swapping : \na : "+a3+"\nb : "+b3);
		obj3.swap(a3,b3);
		
	}

}
