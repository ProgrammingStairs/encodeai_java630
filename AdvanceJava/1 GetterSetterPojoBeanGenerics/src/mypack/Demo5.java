package mypack;

class MyClass{}
public class Demo5<DT> { // generic class
	<DT>void swap(DT a,DT b) { // generic method
		DT temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : \na : "+a+"\nb : "+b);
	}
	public static void main(String[] args) {
		Demo5<MyClass> obj = new Demo5<>();
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
