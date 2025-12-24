// example showing the concept of Abstract class 

import java.util.Scanner;
abstract class RBI{
    abstract double rate();
    RBI(){
        System.out.println("\n####### Welcome to Bank #######\n");
    }
    double finalSum(int bal,double rate){
        return bal + bal*rate/100;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 1.78;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 2.32;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 3.21;
    }
}

class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int bal = sc.nextInt();

        RBI obj;
        obj = new PNB();
        System.out.println("Amount provided by PNB : "+obj.finalSum(bal,obj.rate()));
        
        obj = new BOI();
        System.out.println("Amount provided by BOI : "+obj.finalSum(bal,obj.rate()));
        
        obj = new SBI();
        System.out.println("Amount provided by SBI : "+obj.finalSum(bal,obj.rate()));
    }
}

