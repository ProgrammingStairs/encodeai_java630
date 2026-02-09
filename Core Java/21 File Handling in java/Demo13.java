// example showing the concept of file handling 

import java.io.*;
class Demo13{
    public static void main(String args[]){
        String newName = System.currentTimeMillis()+"_MyFile.txt";
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\"+newName);

        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }
        }catch(IOException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}