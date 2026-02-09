// example showing the concept of method in java
// no argument with return type

import java.util.Scanner;
class Demo4{
    int addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();

        int res = obj.addition();
        System.out.println("Addition : "+res);
        // or
        System.out.println("Addition : "+obj.addition());

    }
}