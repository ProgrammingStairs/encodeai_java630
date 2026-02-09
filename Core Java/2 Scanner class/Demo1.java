// example to find out average of two numbers

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        double avg = (double)(a+b)/2;
        System.out.println("Average : "+avg);
        System.out.printf("Average : %.2f",avg);

    }
}