/*
    
*/

import java.util.Scanner;
class Demo10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==j || j==1 || i==rows)
                    System.out.print((char)(64+j));
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}