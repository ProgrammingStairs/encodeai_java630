// example showing the concept of interface

interface Showable{
    default void show(){
        System.out.println("show method called");
        printData();
    }
    static void display(){
        System.out.println("display method called");
        printData();
    }
    private static void printData(){
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo10 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo10();
        obj.show();
        Showable.display();
    }
}