// example showing the concept of array
// minimum & maximum element 

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
            
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("\nMinimum element : "+min);
        System.out.println("Maximum element : "+max);
    }   
}

