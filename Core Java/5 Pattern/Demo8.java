/*
    1    *
    2    **
    4    ****
    7    *******
    11   ***********
    16   ****************
*/

import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        int sum=1;
        for(int i=0;i<rows;i++){
            sum = sum + i;
            System.out.print("\t"+sum+"\t");
            for(int j=1;j<=sum;j++){
                System.out.print("*");
             }
            System.out.println();
        }
    }
}

