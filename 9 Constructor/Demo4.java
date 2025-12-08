// example showing the concept of constructor

import java.util.Scanner;
class Demo4{
    String name;
    int age;
    double weight;
    Demo4(String name,int age,double weight){
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

        Demo4 obj = new Demo4(name,age,weight);
        obj.display();
    }
}