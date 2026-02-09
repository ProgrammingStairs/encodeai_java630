// example showing the concept of file handling 

import java.io.*; 
class Demo7{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        
        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dout = new DataOutputStream(fout);){
            dout.writeInt(3456);
            dout.writeDouble(34.56);
            dout.writeBoolean(true);
            dout.writeUTF("This is an example of java");
            System.out.println("Data inserted ssuccesfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        
        try(FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);){
            System.out.println("integer value : "+din.readInt());
            System.out.println("double value : "+din.readDouble());
            System.out.println("boolean value : "+din.readBoolean());
            System.out.println("string : "+din.readUTF());
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}