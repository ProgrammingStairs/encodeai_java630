// example showing the conept of string

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String string = sc.nextLine();
       System.out.println("Original String : "+string);

       String str[] = string.split(" ");

       for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
       } 
       System.out.println("Reverse String : ");
       for(String s : str)
         System.out.print(s+" ");
    }
}