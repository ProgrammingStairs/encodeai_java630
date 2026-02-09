// basic example
import java.util.Scanner;
class Student{
    private String name; // instance variable
    private int age; // instance variable

    // setter method
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    // getter method 
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Demo2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        Student obj = new Student();
        obj.setName(name);
        obj.setAge(age);

        System.out.println("Name : "+obj.getName());
        System.out.println("Age : "+obj.getAge());
        
    }
}
