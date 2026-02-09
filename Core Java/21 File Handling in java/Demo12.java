// example showing the concept of file handling 

import java.io.*;
class Demo12{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java");

        File frr[] = file.listFiles();
        // for(File fileObj : frr)
        //     System.out.println(fileObj.getName()+" \t"+fileObj.getPath());

        for(File fileObj : frr){
            if(fileObj.getName().endsWith(".java"))
                System.out.println(fileObj.getName()+" \t"+fileObj.getPath());
        }

    }
}