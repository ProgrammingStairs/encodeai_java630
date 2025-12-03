// example

import java.util.Scanner;
class Demo8{
    int[] getArrayElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        int arr[] = obj.getArrayElements();
        System.out.println("Array elements are : ");
        for(int element : arr)
            System.out.print(element+"\t");
    }
}