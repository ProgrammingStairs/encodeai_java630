// example showing the conept of string

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String string = sc.nextLine();
       System.out.println("Original String : "+string);

       char str[] = string.toCharArray();

       for(int i=0;i<str.length/2;i++){
            char temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
       } 
       String str2 = new String(str);
       System.out.println("Reverse String : "+str2);
    }
}