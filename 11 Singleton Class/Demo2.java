// example showing the concept of singleton class
// Eager initialization
class Singleton{
    static private final Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int num=100; // instance variable
}
class Demo2{
    public static void main(String args[]){
        Singleton instance = Singleton.getInstance();
        System.out.println("num : "+instance.num);

        instance.num += 100;
        System.out.println("num : "+instance.num);

        Singleton instance1 = Singleton.getInstance();
        System.out.println("num : "+instance1.num);

    }
}