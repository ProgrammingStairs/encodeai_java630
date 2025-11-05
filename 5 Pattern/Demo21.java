/*
    *******
    **   **
    * * * *
    *  *  *
    * * * *
    **   **
    *******
*/

import java.util.Scanner;
class Demo21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        rows = rows%2==0 ? rows+1 : rows;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i==1 || i==rows || j==1 || j==rows || i+j==rows+1 || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}