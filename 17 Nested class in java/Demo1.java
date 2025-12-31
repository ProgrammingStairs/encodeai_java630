// example showing the concept of Nested class in java
// static nested class 

class EnclosingClass{
    private static int age = 75;
    protected static String name = "Andrew Anderson";
    public static double weight = 89.45;
    static class StaticNestedClass{
        void display(){
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
            System.out.println("Weight : "+weight);
        }
    } 
    public static void main(String args[]){
        StaticNestedClass obj = new StaticNestedClass();
        obj.display(); 
    }
}
