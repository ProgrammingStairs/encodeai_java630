import java.util.Scanner;
interface Showable{
    void calculate();
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Showable obj = ()->{
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum : "+(a+b));
        };
        obj.calculate();
    }
}