// example showing the concept of file handling 

import java.io.*; 
class Demo4{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        try(FileInputStream fin = new FileInputStream(file)){   
            while(true){
                int x = fin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}