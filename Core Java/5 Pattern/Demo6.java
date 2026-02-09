/*
    1
    12
    1 3
    1  4
    12345
*/

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(i==j || j==1 || i==rows)
                    // System.out.print(j);
                    // System.out.print(i);
                    // System.out.print((char)(96+j));
                    System.out.print((char)(64+j));
                else
                    // System.out.print(" ");
                    System.out.print((char)(95+j));
            }
            System.out.println();
        }
    }
}