package myPackage;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Enter Elements : ");
			list.add(sc.nextInt());
		}
		System.out.println("Array list elements are : ");
		for(int element : list) {
			System.out.print(element+"\t");
		}
	}
}

