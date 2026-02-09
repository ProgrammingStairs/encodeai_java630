// example showing the concept of object class

class Product{
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
    @Override
    public int hashCode(){
        return pid;
    }
}
class Demo2{
    public static void main(String args[]){
        Product p1 = new Product(101,"Soap",67.78);
        Product p2 = new Product(102,"Fairness Cream",543.56);
        System.out.println("Product : "+p1);
        System.out.println("Product hashCode: "+p1.hashCode());

        System.out.println("Product : "+p2);
        System.out.println("Product hashCode: "+p2.hashCode());

    }
}
