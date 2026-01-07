// method reference to a constructor 

import java.util.Scanner;
interface Showable{
    void calculate(int a,int b);
}
class Demo7{
    Demo7(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
           
        Showable obj;

        obj = Demo7 :: new;
        obj.calculate(a,b);
    }
}