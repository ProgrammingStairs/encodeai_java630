// example showing the concept of achieving run timme polymorphism

class Parent{
    void display(){
        System.out.println("display method called of parent");
    }
}
class Child extends Parent
{
    void display(){
        System.out.println("display method called of child");
    }
}
class Demo10{
    public static void main(String args[]){
        Parent pobj = new Child(); // upcasting
        pobj.display();
    }
}

