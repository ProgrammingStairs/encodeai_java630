// example showing the concept of array
// finding sum of first and last element 

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        if(size==0)
            System.exit(0);
            
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        System.out.println("Array elements are : ");
        for(int i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
            sum = sum + arr[i];
        }
        if(size==1)
            System.out.println("\nsum of first and last element : "+(arr[0]));
        else
            System.out.println("\nsum of first and last element : "+(arr[0]+arr[size-1]));
        System.out.println("\nsum of all elements : "+sum);
    }   
}

