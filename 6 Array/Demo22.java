// example showing the concept of multi dimensional array 

import java.util.Scanner;
class Demo22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d array : ");
        int num = sc.nextInt();

        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        
        System.out.println("Enter columns : ");
        int cols = sc.nextInt();
        
        int arr[][][] = new int[num][rows][cols];

        for(int i=0;i<num;i++){
            System.out.println("Enter elements for "+(i+1)+" array : ");
            for(int j=0;j<rows;j++){
                for(int k=0;k<cols;k++){
                    arr[i][j][k] = sc.nextInt();
                }                
            }
        }

        System.out.println("Array elements are : ");
        for(int ar[][] : arr){
            for(int a[] : ar){
                for(int element : a){
                    System.out.print(element+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
   }
}

