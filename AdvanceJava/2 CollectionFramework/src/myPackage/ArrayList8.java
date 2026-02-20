package myPackage;

import java.util.ArrayList;

class Student{
	private int rno;
	private String name;
	private double per;
	
	public Student(int rno,String name,double per) {
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString() {
		return "\n{ "+rno+" , "+name+" , "+per+" }\n";
	}
	
}
public class ArrayList8 {
	public static void main(String[] args) {
		Student s1 = new Student(104,"Andrew Anderson",89.32);
		Student s2 = new Student(132,"Peter Parker",43.45);
		Student s3 = new Student(101,"Jack Jackson",75.36);
		
		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		System.out.println(stud);
	}
}

