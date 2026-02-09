// example showing the concept of switch control statement
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Options : ");
        System.out.println("+ for Add");
        System.out.println("- for Sub");
        System.out.println("* for Mul");
        System.out.println("e for Exit");
        
        System.out.println("Enter code : ");
        char code = sc.next().charAt(0);

        switch(code){ 
            case '+' : System.out.println("Add : "+(a+b));
                        break;
            case '-' : System.out.println("Sub : "+(a-b));
                        break;
            case '*' : System.out.println("Mul : "+(a*b));
                        break;
            case 'e' : System.out.println("Thanks for Visit");
                        break;
            default : System.out.println("Invalid Selection"); 
                      break;
        }        
   }
}