// example showing the concept of super keyword

/*
    super keyword : 
        a. variable
        b. method 
        c. constructor
*/
class Parent{
    String name = "Andrew Anderson";
    void show(){
        System.out.println("show method called of parent");
    }
    Parent(){
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent{
    String name = "Peter Parker";
    void show(){
        System.out.println("show method called if child");
    }
    Child(){
        super();
        System.out.println("Child constructor called");
    }
    void display(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
        super.show();
        show();
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj  = new Child();
        cobj.display();
    }
}