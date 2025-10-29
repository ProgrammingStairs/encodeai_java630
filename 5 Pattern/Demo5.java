/*
    5
    54
    543
    5432
    54321
*/

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}