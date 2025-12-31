// example showing the concept of Nested class in java
// non-static nested class | Member class 

class EnclosingClass{
    void display(){
        InnerNestedClass obj = new InnerNestedClass();
        obj.display();
    }
    class InnerNestedClass{
        void display(){
            System.out.println("Display method called");
        }
    } 
}
class Demo5{
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        obj.display(); 
    }
}
