// example showing the concept of 2d array
// example to multiply two 2d array

import java.util.Scanner;
class Demo20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array rows and columns : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter second array rows and columns : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int i,j,k;
        
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int arr3[][] = new int[r1][c2];

        if(c1==r2){
            System.out.println("Enter first array elements : ");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    arr1[i][j] = sc.nextInt();
                }    
            }
            System.out.println("Enter second array elements : ");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    arr2[i][j] = sc.nextInt();
                }    
            }
            System.out.println("First array elements are : ");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(arr1[i][j]+"\t");
                }    
                System.out.println();
            }
            System.out.println("Second array elements are : ");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    System.out.print(arr2[i][j]+"\t");
                }    
                System.out.println();
            }
            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    arr3[i][j] = 0;
                    for(k=0;k<c1;k++){
                        arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                    }
                }    
            }
            System.out.println("Resultant array elements are : ");
            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    System.out.print(arr3[i][j]+"\t");
                }    
                System.out.println();
            }

        }else
            System.out.println("Multiplication not possible");
    }
}