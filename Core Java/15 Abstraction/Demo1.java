// example showing the concept of Abstract class 

abstract class AbstractClass{
    abstract void display();
}
class Demo1 extends AbstractClass{
    @Override
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        AbstractClass obj = new Demo1();
        obj.display();
    }
}