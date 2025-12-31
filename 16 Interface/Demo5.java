// example showing the concept of interface

interface Showable extends Movable{
    void display();
}
interface Movable{
    void show();
    void display();
}
class Demo5 implements Showable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo5();
        obj.display();
        obj.show();
    }
}