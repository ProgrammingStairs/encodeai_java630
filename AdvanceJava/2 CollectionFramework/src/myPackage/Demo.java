package myPackage;

public class Demo {
	private String name="andrew";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		System.out.println("name : "+obj.getName());
	}
}
