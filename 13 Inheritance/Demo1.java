// example showing the concept of inheritance

class Parent{
    void show(){
        System.out.println("show method called");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("display method called");
    }
}
class Demo1{
    public static void main(String args[]){
        Child cobj  = new Child();
        cobj.display();
        cobj.show();
    }
}