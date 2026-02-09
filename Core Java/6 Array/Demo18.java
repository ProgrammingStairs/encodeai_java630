// example showing the concept of 2d array
// example to find out sum of diagonal elements

import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int i,j,sum=0;
        if(row==col){
        // two dimensional array
        int arr[][] = new int[row][col];
        System.out.println("Enter array elements : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
            System.out.println("Array elements are : ");
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    System.out.print(arr[i][j]+"\t");
                    if(i==j)
                        sum = sum + arr[i][j];
                }
                System.out.println();
            }       
        }else{
            System.out.println("Sum not possible");
        }
        System.out.println("\nSum : "+sum);
       }   
}

