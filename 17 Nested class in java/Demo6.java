// example showing the concept of Nested class in java
// non-static nested class | Local class 

class EnclosingClass{
    void display(){
        // local class
        class InnerNestedClass{
            void display(){
                System.out.println("Display method called");
            }
        } 
        InnerNestedClass obj = new InnerNestedClass();
        obj.display();
    }
}
class Demo6{
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        obj.display(); 
    }
}
