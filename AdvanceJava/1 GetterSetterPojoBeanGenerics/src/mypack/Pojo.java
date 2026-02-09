package mypack;

class Student{
	int rno;
	private String name;
	protected double per;
	public int pincode;
	
	public Student(int rno, String name, double per, int pincode) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println("Roll Number : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Percentage : "+per);
		System.out.println("Pincode : "+pincode);
	}
}
public class Pojo {

	public static void main(String[] args) {

		Student s = new Student(101,"Peter Parker",56.67,452010);
		s.display();
	}

}
