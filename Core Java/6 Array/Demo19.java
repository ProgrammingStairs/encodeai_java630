// example showing the concept of 2d array
// example to find the sum of two 2d array
import java.util.Scanner;
class Demo19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int i,j;

        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int arr3[][] = new int[row][col];

        System.out.println("Enter first array elements : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array elements : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First array elements are : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Second array elements are : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Resultant array elements after addition : ");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }


       }   
}

