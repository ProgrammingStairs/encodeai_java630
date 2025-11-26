// example showing the concept of method in java

class Demo1{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        new Demo1().display(); // anonymous object
        new Demo1().display(); // anonymous object
        new Demo1().display(); // anonymous object
        new Demo1().display(); // anonymous object
        new Demo1().display(); // anonymous object 
    }
}