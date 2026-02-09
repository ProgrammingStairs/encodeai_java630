// example showing the concept of pass by reference

import java.util.Scanner;
class Demo12{
    int a,b; // instance variable
    void swap(Demo12 obj){
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("After swapping in swap : \na : "+obj.a+"\nb : "+obj.b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Demo12 obj = new Demo12();
        obj.a = a;
        obj.b = b;

        System.out.println("Before swapping : \na : "+obj.a+"\nb : "+obj.b);
        obj.swap(obj); // pass by reference
        System.out.println("After swapping in main : \na : "+obj.a+"\nb : "+obj.b);
    }
}