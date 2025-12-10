// example showing the concept of shallow copy

class Address{
    String state,city;
    Address(String state,String city){
        this.state=state;
        this.city=city;
    }
}
class Student{
    int sid;
    String name;
    Address address;
    Student(int sid,String name,Address address){
        this.sid=sid;
        this.name=name;
        this.address=address;
    }
    Student(Student s1){
        sid = s1.sid;
        name = s1.name;
        address = s1.address;
    }
}
class Demo8{
    public static void main(String args[]){
        Address address = new Address("MP","Indore");
        Student s1 = new Student(101,"Andrew Anderson",address);
        Student s2 = new Student(s1);

        s2.address.state = "Gujarat";
        s2.address.city = "Surat";

        System.out.println("\ns1 : \n");
        System.out.println("Name : "+s1.name);
        System.out.println("Sid : "+s1.sid);
        System.out.println("Address : "+s1.address.city+", "+s1.address.state);

        System.out.println("\nAfter Copying \n s2 : \n");
        System.out.println("Name : "+s2.name);
        System.out.println("Sid : "+s2.sid);
        System.out.println("Address : "+s2.address.city+", "+s2.address.state);
    }
}