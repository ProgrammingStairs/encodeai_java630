// example showing the concept of file handling 

import java.io.*;
class Demo10{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        
        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("statemment 1");
            bw.newLine();
            bw.write("statemment 2");
            bw.newLine();
            bw.write("statemment 3");
            System.out.println("Data inserted ssuccesfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);){
            while(true){
                int x = br.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}