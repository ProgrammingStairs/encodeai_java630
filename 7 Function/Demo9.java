// example showing the concept of pass by value

import java.util.Scanner;
class Demo9{
    void swap(int a,int b){
        int temp;
            temp=a;
            a=b;
            b=temp;
        System.out.println("After swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping in main : \na : "+a+"\nb : "+b);
        obj.swap(a,b);
        System.out.println("After swapping in main : \na : "+a+"\nb : "+b);
    }
}