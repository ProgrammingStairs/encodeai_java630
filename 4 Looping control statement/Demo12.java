// example to print factors of all the numbers between two entered numbers

import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter initial and final limit : ");
       int n = sc.nextInt();
       int m = sc.nextInt();

       for(int num = n;num<=m;num++){
        System.out.print("Factors of "+num+" : ");
            for(int i=1;i<=num;i++){
                if(num%i==0)
                    System.out.print(i+"\t");
            }
            System.out.println();
       } 
    }
}