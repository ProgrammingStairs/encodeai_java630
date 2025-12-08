// example

import java.util.Scanner; 
class Demo1{
    void operation(int a,int b){
        System.out.println("Add : "+(a+b));
        System.out.println("Sub : "+(a-b));
        System.out.println("Mul : "+(a*b));
        System.out.println("Div : "+(a/b));
        System.out.println("Mod : "+(a%b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Demo1 obj = new Demo1();
        obj.operation(a,b);
    }
}