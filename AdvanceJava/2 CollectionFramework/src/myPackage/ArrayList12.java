package myPackage;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList12{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter elements : ");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\nArray elements are : \n");
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		convert array into list
		for(int i=0;i<num;i++) {
			list.add(arr[i]);
		}
		// printing list
		System.out.println("\nList elements : "+list);
		
	}
}