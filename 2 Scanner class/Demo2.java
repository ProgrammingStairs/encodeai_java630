// example to convert temp from f to c

import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temp in f : ");
        double f = sc.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("Temp. in c : "+c);

    }
}