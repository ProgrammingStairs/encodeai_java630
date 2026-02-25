package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class NewStudent{
	public int rno;
	private String name;
	private double per;
	
	public NewStudent(int rno,String name,double per) {
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString() {
		return "\n{ "+rno+" , "+name+" , "+per+" }\n";
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
}	

class SortByRno implements Comparator<NewStudent>{
	@Override
	public int compare(NewStudent s1,NewStudent s2) {
		return s1.getRno()-s2.getRno();
	}
}
class SortByName implements Comparator<NewStudent>{
	@Override
	public int compare(NewStudent s1,NewStudent s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
class SortByPercentage implements Comparator<NewStudent>{
	@Override
	public int compare(NewStudent s1,NewStudent s2) {
		if(s1.getPer()>s2.getPer())
			return 1;
		else if(s1.getPer()<s2.getPer())
			return -1;
		else 
			return 0;
	}
}

public class ArrayList10 {
	public static void main(String[] args) {
		NewStudent s1 = new NewStudent(104,"Andrew Anderson",89.32);
		NewStudent s2 = new NewStudent(132,"Peter Parker",43.45);
		NewStudent s3 = new NewStudent(101,"Jack Jackson",75.36);
		
		ArrayList<NewStudent> stud = new ArrayList<NewStudent>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		System.out.println(stud);
		
		System.out.println("Ascending order based on roll number : ");
		Collections.sort(stud,new SortByRno());
		System.out.println(stud);
		
		System.out.println("Ascending order based on name : ");
		Collections.sort(stud,new SortByName());
		System.out.println(stud);
		
		System.out.println("Ascending order based on percentage : ");
		Collections.sort(stud,new SortByPercentage());
		System.out.println(stud);
		
		
	}
}


