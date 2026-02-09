// example showing the concept of constructor

import java.util.Scanner;
class Demo6{
    String name;
    int age;
    double weight;
    Demo6(){
        System.out.println("no argument constructor called");
    }
    Demo6(String name,int age,double weight){
         this.name = name;
         this.age = age;
         this.weight = weight;
        System.out.println("parameterized constructor called..!!");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
       
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
       
        System.out.println("Enter Weight : ");
        double weight = sc.nextDouble();

        Demo6 obj1 = new Demo6();
        Demo6 obj = new Demo6(name,age,weight);

        //   copying values of one object into another
        obj1.name = obj.name; 
        obj1.age = obj.age;
        obj1.weight = obj.weight;

        obj.display();
        System.out.println("After Copying : ");
        obj1.display();
    }
}