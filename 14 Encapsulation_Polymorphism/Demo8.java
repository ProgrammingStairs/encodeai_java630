// example showing the concept of method overriding

class Parent{
    void shape(){
        System.out.println("Its shape");
    }
}
class Circle extends Parent{
    void shape(){
        System.out.println("Its Circle shape");
    }
}
class Square extends Parent{
    void shape(){
        System.out.println("Its Square shape");
    }
}
class Rectangle extends Parent{}

class Demo8{
    public static void main(String args[]){
        Circle cobj = new Circle();
        Square sobj = new Square();
        Rectangle robj = new Rectangle();
        
        cobj.shape();
        sobj.shape();
        robj.shape();
    }
}

