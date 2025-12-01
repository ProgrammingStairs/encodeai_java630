// example showing the concept of method in java
// with argument with return type

import java.util.Scanner;
class Demo6{
    int addition(int a,int x){
        return a+x;
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : "+obj.addition(a,b));
    }
}