// example showing the conept of string

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String string = sc.nextLine();
       System.out.println("Original String : "+string);

       String str[] = string.split(" ");
       
       for(int j=0;j<str.length;j++){
        char ch[] = str[j].toCharArray();
        for(int i=0;i<ch.length/2;i++){
                char temp = ch[i];
                ch[i] = ch[ch.length-1-i];
                ch[ch.length-1-i] = temp;
        } 
        str[j] = new String(ch);
       } 
       System.out.println("Reverse String : ");
       for(String s : str)
         System.out.print(s+" ");
    }
}