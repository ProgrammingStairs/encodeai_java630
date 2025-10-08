// example showing the concept of if else statement

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");        
   }
}