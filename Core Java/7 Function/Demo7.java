// example showing the concept of recursion

import java.util.Scanner;
class Demo7{
    int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Factorial : "+obj.fact(num));
    }
}