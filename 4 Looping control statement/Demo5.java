// example to check whether entered number is palindrome or not

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int rev=0,rem,temp = num;
        while(num>0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }       
        if(rev == temp)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
   }
}