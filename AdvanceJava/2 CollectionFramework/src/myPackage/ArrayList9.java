package myPackage;

import java.util.ArrayList;
import java.util.Collections;

class StudentNew implements Comparable<StudentNew>{
	private int rno;
	private String name;
	private double per;
	
	public StudentNew(int rno,String name,double per) {
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString() {
		return "\n{ "+rno+" , "+name+" , "+per+" }\n";
	}
	
//	@Override
//	public int compareTo(StudentNew s) {
//		return s.rno-rno;
//	}
	
//	@Override
//	public int compareTo(StudentNew s) {
//		return name.compareTo(s.name);
//	}

	@Override
	public int compareTo(StudentNew s) {
		if(per>s.per)
				return 1;
		else if(per<s.per)
				return -1;
		else 
				return 0;
	}
}
public class ArrayList9 {
	public static void main(String[] args) {
		StudentNew s1 = new StudentNew(104,"Andrew Anderson",89.32);
		StudentNew s2 = new StudentNew(132,"Peter Parker",43.45);
		StudentNew s3 = new StudentNew(101,"Jack Jackson",75.36);
		
		ArrayList<StudentNew> stud = new ArrayList<StudentNew>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		System.out.println(stud);
		
		Collections.sort(stud);
//		System.out.println("Ascending order based on roll number : ");
//		System.out.println("Ascending order based on name : ");
		System.out.println("Ascending order based on percentage : ");
		System.out.println(stud);
		
	}
}


