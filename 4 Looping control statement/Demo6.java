// example to check whether entered number is armstrong or not

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        double sum=0;
        int count=0,rem,temp1 = num,temp2 = num;
        while(num>0){
            num = num / 10;
            count++;
        }       
        while(temp1>0){
            rem = temp1%10;
            sum = sum + Math.pow(rem,count);
            temp1=temp1/10;
        }
        if(sum == temp2)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a armstrong number");
   }
}