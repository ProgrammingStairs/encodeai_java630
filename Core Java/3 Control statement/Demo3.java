// example showing the concept of if else statement

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter experience : ");
        int exp = sc.nextInt();
        System.out.println("Enter salary : ");
        int sal = sc.nextInt();

        if(exp>=5 && sal>=20000)
            System.out.println("Gets Hike");
        else
            System.out.println("Not eligible to get Hike");        
   }
}