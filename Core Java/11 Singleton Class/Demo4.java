// example showing the concept of singleton class
// Lazy initialization
class Singleton{
    static private Singleton instance=null;
    private Singleton(){}
    static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;
    }
    int num=100; // instance variable
    static void display(){
        System.out.println("display method called : "+instance);
    }
}
class Demo4{
    public static void main(String args[]){
        Singleton.display();

        Singleton instance = Singleton.getInstance();
        System.out.println("num : "+instance.num);

        instance.num += 100;
        System.out.println("num : "+instance.num);

        Singleton instance1 = Singleton.getInstance();
        System.out.println("num : "+instance1.num);

    }
}