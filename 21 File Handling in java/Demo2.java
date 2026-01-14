// example showing the concept of file handling 

import java.io.File; 
import java.io.IOException; 
class Demo2{
    public static void main(String args[]){
        try{
            File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
                if(!file.exists()){
                    file.createNewFile();
                    System.out.println("File created successfully");
                }else{
                    System.out.println("File Already exist");
                }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}