// example showing the concept of switch control statement
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Options : ");
        System.out.println("r/R for Area of Rectangle");
        System.out.println("c/C for area of circle");
        System.out.println("e/E for Exit");
        
        System.out.println("Enter code : ");
        char code = sc.next().charAt(0);

        switch(code){ 
            case 'R' : 
            case 'r' : 
                System.out.println("Enter l and b : ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area of rectangle : "+(l*b));
                        break;
            case 'C' : 
            case 'c' : 
                System.out.println("Enter radius : ");
                double r = sc.nextDouble();
                System.out.println("Area of circle : "+(3.14*r*r));
                        break;
            case 'e' : System.out.println("Thanks for Visit");
                        break;
            default : System.out.println("Invalid Selection"); 
                      break;
        }        
   }
}