// example showing the concept of method in java

class Demo2{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display(); 
        obj.display(); 
        obj.display(); 
        obj.display();  
    }
}