// example showing the concept of singleton class
// Eager initialization with static block
class Singleton{
    static private  Singleton instance=null;
    static{
        instance = new Singleton();
    }
    private Singleton(){}
    static Singleton getInstance(){
        return instance;
    }
    int num=100; // instance variable
}
class Demo3{
    public static void main(String args[]){
        Singleton instance = Singleton.getInstance();
        System.out.println("num : "+instance.num);

        instance.num += 100;
        System.out.println("num : "+instance.num);

        Singleton instance1 = Singleton.getInstance();
        System.out.println("num : "+instance1.num);

    }
}