// example showing the concept of constructor

import java.util.Scanner;
class Demo7{
    String name;
    int age;
    double weight;
    Demo7(Demo7 obj){
        name = obj.name;
        age = obj.age;
        weight = obj.weight;
    }
    Demo7(String name,int age,double weight){
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

        Demo7 obj = new Demo7(name,age,weight);
        Demo7 obj1 = new Demo7(obj);

        obj.display();
        System.out.println("After Copying : ");
        obj1.display();
    }
}