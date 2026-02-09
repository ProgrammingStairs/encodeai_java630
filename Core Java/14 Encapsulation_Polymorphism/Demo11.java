// example showing the concept of achieving run timme polymorphism

class Parent{
    void display(){
        System.out.println("display method called of parent");
    }
    void draw(){
        System.out.println("draw method called of parent");
    }
}
class Child extends Parent
{
    void display(){
        System.out.println("display method called of child");
    }
    void show(){
        System.out.println("show method called of child");
    }
}
class Demo11{
    public static void main(String args[]){
        Parent pobj = new Child(); // upcasting
        pobj.display();
        pobj.draw();
        Child cobj = (Child)pobj; // downcasting
        cobj.show();
    }
}

