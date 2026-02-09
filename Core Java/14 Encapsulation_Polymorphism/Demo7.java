// example showing the concept of method overriding

class Parent{
    void display(){
        System.out.println("parent display called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("child display called");
    }
}
class Demo7{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}

