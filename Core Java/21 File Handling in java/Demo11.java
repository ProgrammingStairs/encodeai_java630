// example showing the concept of file handling 

import java.io.*;
class Demo11{
    public static void main(String args[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter name : ");
            String name = br.readLine();

            System.out.println("Enter age : ");
            // String age = br.readLine();
            int age = Integer.parseInt(br.readLine());

            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        }catch(Exception e){
            System.out.println("Exception : "+e); 
        }        
    }
}