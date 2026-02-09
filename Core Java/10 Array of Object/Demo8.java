// example showing the concept of static keyword
import java.util.Scanner;
class Student{
    int sid;
    String name;
    static String cname;

    Student(int sid,String name){
        this.sid=sid;
        this.name=name;
    }

    static void getCName(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter college name : ");
         cname = sc.nextLine();
    }

    void display(){
        System.out.println("sid : "+sid);
        System.out.println("name : "+name);
        System.out.println("college name : "+cname);
    }
}
class Demo8{
    public static void main(String args[]){
        Student.getCName();
        Student s1 = new Student(1010,"Andrew Anderson");
        Student s2 = new Student(1020,"Peter Parker");
        
        s1.display();
        s2.display();
    }
}