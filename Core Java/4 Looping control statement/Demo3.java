// example to check whether entered number is prime or not

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int i;
        System.out.println("Enter number : ");
        int num = sc.nextInt();
       
        for(i=2;i<=num/2;i++){
            if(num%i==0)
                break;
        }
        if(i>num/2 && num>1)
            System.out.println("No. is prime");
        else
            System.out.println("No. is not prime");
    }
}