// example to find out area of triangle

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter b and h : ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        double area = 0.5*b*h;
        System.out.println("area : "+area);

    }
}