// example to find out area of triangle

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter sides of triangle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
        System.out.println("area : "+area);

    }
}