package myPackage;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList11{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter elements : ");
		for(int i=1;i<=num;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Elements : "+list);
//		convert list into array
		int arr[] = new int[list.size()];
		for(int i=0;i<num;i++) {
			arr[i] = list.get(i);
		}
		
		System.out.println("\nArray elements are : \n");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
}