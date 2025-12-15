// example showing the concept of singleton class
// Eager initialization
class Singleton{
    static private final Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int num=100;
    static void display(){
        System.out.println("display method called : "+instance);
    }
}
class Demo1{
    public static void main(String args[]){
        Singleton.display();
    }
}