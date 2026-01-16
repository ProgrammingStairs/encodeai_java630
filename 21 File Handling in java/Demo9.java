// example showing the concept of file handling 

import java.io.*;
class Demo9{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        
        try(FileWriter fw = new FileWriter(file)){
            fw.write("statemment 1 \n");
            fw.write("statemment 2 \n");
            fw.write("statemment 3 \n");
            System.out.println("Data inserted ssuccesfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        
        try(FileReader fr = new FileReader(file)){
            while(true){
                int x = fr.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}