// method reference to an instance method

import java.util.Scanner;
interface Showable{
    int calculate(int a,int b);
}
class Demo6{
    int showResult(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
           
        Showable obj;

        obj = new Demo6() :: showResult;
        System.out.println("Add : "+obj.calculate(a,b));
    }
}