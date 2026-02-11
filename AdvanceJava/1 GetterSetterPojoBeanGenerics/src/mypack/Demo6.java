package mypack;

public class Demo6<DT1,DT2> { // generic class
	DT1 id;
	DT2 name;
	Demo6(DT1 id,DT2 name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("Id : "+id+" name : "+name);
	}
	public static void main(String[] args) {
		Demo6<Integer,String> obj1 = new Demo6<>(101,"Andrew Anderson");
		obj1.display();
	}
}
