import java.util.Scanner;
interface Showable{
    void calculate(int a,int b);
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Showable obj = (int a1,int b1)->System.out.println("Sum : "+(a1+b1));
        obj.calculate(a,b);
    }
}