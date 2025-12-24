// example showing the concept of interface
@FunctionalInterface
interface Showable{
    void display();
}
class Demo3 implements Showable{
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo3();
        obj.display();
    }
}