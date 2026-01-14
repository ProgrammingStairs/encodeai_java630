// example showing the concept of file handling 

import java.util.Scanner;
import java.io.*; 
class Demo3{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
   
        try(FileOutputStream fout = new FileOutputStream(file,true)){
            byte bt[] = str.getBytes();
            fout.write(bt);
            System.out.println("Data inserted ssuccesfully");

        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}