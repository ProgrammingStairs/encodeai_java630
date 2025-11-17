// example showing the concept of array
// program to merge two array

import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int size1 = sc.nextInt();
        System.out.println("Enter size of second array : ");
        int size2 = sc.nextInt();
        int i;
        int arr1[] = new int[size1+size2];
        int arr2[] = new int[size2];
        
        System.out.println("\nEnter first array elements : ");
        for(i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter second array elements : ");
        for(i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("\nFirst Array elements are : ");
        for(i=0;i<size1;i++){
            System.out.print("\t"+arr1[i]);
        }
        System.out.println("\nSecond Array elements are : ");
        for(i=0;i<size2;i++){
            System.out.print("\t"+arr2[i]);
        }

        for(i=0;i<size2;i++){
            arr1[size1] = arr2[i];
            size1++;
        }

        System.out.println("\nArray elements after merging : ");
        for(i=0;i<size1;i++){
            System.out.print("\t"+arr1[i]);
        }
        
    }   
}

