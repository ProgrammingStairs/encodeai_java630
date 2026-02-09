// example showing the concept of Nested class in java
// non-static nested class 

class EnclosingClass{
    private int age = 75;
    protected static String name = "Andrew Anderson";
    public double weight = 89.45;
    class InnerNestedClass{
        void display(){
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
            System.out.println("Weight : "+weight);
        }
    } 
}
class Demo4{
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        EnclosingClass.InnerNestedClass obj = eobj.new InnerNestedClass();
        obj.display(); 
    }
}
