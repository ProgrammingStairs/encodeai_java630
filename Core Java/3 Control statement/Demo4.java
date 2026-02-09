// example showing the concept of nested if else statement
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Both are equal");
        }else{
            if(a>b)
                System.out.println(a+" is greater");
            else
                System.out.println(b+" is greater");        
        }
   }
}