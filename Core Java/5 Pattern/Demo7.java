/*
    *
    ***
    *****
    *******
    *********
*/

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            System.out.print("\t"+(2*i-1)+"\t");
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
             }
            System.out.println("\n");
        }
    }
}

/*
        2   4   6   8   10 .... 2 x i where i = 1,2,3,4,....
       1   3   5   7   9  ..... 2 x i -1 where i = 1,2,3,4,.... 
*/