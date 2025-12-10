// example showing the concept of array of object

import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;

    void getDetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter product Id : ");
       pid = sc.nextInt();
       System.out.println("Enter product name : ");
       sc.nextLine();
       name = sc.nextLine();
       System.out.println("Enter product price : ");
       price = sc.nextDouble();
    }

}
class Demo1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no. of products : ");
       int num = sc.nextInt();
       Product pobj[] = new Product[num];
    //    System.out.println("pobj[0] : "+pobj[0]);
       for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getDetails();
       } 
        //   System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("\nProduct Details : \n");
        for(Product obj : pobj){
            System.out.println("Product Name : "+obj.name);
            System.out.println("Product Pid : "+obj.pid);
            System.out.println("Product Price : "+obj.price);
        }         
    }
}