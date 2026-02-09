// example showing the concept of file handling 

import java.io.*;
class Product implements Serializable{
    int pid;
    String name;
    double price;

    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return "{ "+pid+" , "+name+" , "+price+" }";
    }
} 
class Demo8{
    public static void main(String args[]){
        Product pobj = new Product(101,"Soap",89.32);
        File file = new File("D:\\desktop\\EncodeAI_batches\\encodeai_java630\\21 File Handling in java\\MyFolder\\myfile.txt");
        
        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);){
            oout.writeObject(pobj);
            System.out.println("Data inserted ssuccesfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
        
        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);){
            Product obj = (Product)oin.readObject();
            System.out.println("Data : "+obj);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Exception : "+e);
        }
    }
}