// basic example
package mypack;

import java.util.Scanner;
public class Demo1 {

    private String name; // instance variable
    private int age; // instance variable

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        Demo1 obj = new Demo1();
        obj.name = name;
        obj.age = age;

        System.out.println("Name : "+obj.name);
        System.out.println("Age : "+obj.age);
        
    }
}
