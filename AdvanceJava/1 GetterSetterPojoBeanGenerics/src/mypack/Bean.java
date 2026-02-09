package mypack;

import java.io.Serializable;

class StudentNew implements Serializable{
	private int sid;
	private String name;
	private double per;
	private int pincode;
	
	public StudentNew() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
public class Bean {

	public static void main(String[] args) {
		StudentNew s = new StudentNew();
		s.setSid(101);
		s.setName("Mathew Math");
		s.setPer(34.45);
		s.setPincode(452010);
		
		System.out.println("Sid : "+s.getSid());
		System.out.println("Name : "+s.getName());
		System.out.println("Percentage : "+s.getPer());
		System.out.println("Pincode : "+s.getPincode());

	}

}
