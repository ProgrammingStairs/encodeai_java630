// example showing the concept of 2d array

import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int i,j;
        // two dimensional array
        int arr[][] = new int[row][col];
        System.out.println("Enter array elements : ");
        for(i=0;i<row;i++){
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
        if(row>=2 && col>=2)
            System.out.println("\nSum : "+(arr[0][0]+arr[0][col-1]+arr[row-1][0]+arr[row-1][col-1]));
    }   
}

