// example to print table of all the numbers between two entered numbers

import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter initial and final limit : ");
       int n = sc.nextInt();
       int m = sc.nextInt();

       for(int num = n;num<=m;num++){
            for(int i=1;i<=10;i++){
                System.out.println(num+" x "+i+" = "+(num*i));
            }
            System.out.println();
       } 
    }
}