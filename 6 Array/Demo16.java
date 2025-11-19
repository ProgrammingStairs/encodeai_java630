// example showing the concept of 2d array - jagged array

import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        int i,j;
        // two dimensional array - jagged array
        int arr[][] = new int[row][];

        for(i=0;i<row;i++){
            System.out.println("Enter columns for "+(i+1)+" rows : ");
            int col = sc.nextInt();
            arr[i] = new int[col];    
            System.out.println("Enter element for "+(i+1)+" rows : ");
            for(j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }   
}

