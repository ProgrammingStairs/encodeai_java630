// example showing the concept of file handling 

import java.util.Scanner;
import java.io.*; 
class Demo5{
    public static void main(String args[]){
        File file1 = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile1.txt");
        File file2 = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile2.txt");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
   
        try(FileOutputStream fout1 = new FileOutputStream(file1);
        FileOutputStream fout2 = new FileOutputStream(file2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){
            byte bt[] = str.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            System.out.println("Data inserted ssuccesfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}