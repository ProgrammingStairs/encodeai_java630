// example showing the concept of switch control statement
import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Options : ");
        System.out.println("1 for Add");
        System.out.println("2 for Sub");
        System.out.println("3 for Mul");
        System.out.println("4 for Exit");
        
        System.out.println("Enter code : ");
        int code = sc.nextInt();

        switch(code){ 
            case 1 : System.out.println("Add : "+(a+b));
                        break;
            case 2 : System.out.println("Sub : "+(a-b));
                        break;
            case 3 : System.out.println("Mul : "+(a*b));
                        break;
            case 4 : System.out.println("Thanks for Visit");
                        break;
            default : System.out.println("Invalid Selection"); 
                      break;
        }        
   }
}