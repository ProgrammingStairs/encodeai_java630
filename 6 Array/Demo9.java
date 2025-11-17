// example showing the concept of array
// program for linear search

import java.util.Scanner;
class Demo9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("\nEnter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nEnter element to be search : ");
        int search = sc.nextInt();
        boolean status=false;
        for(int i=0;i<size;i++){
            if(search==arr[i]){
                System.out.println("Element Found at position : "+(i+1));
                status=true;
            }
        }
        if(!status)            
            System.out.println("\nElement not found");
        
    }   
}

