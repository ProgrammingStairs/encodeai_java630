// example showing the concept of method in java
// with argument no return type

import java.util.Scanner;
class Demo5{
    void addition(int a,int x){
        System.out.println("Addition : "+(a+x));        
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.addition(a,b);
    }
}