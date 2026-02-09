// example
// this keyword can also be passed as a argument in a function call.
class Demo6{
    void show(Demo6 obj){
        System.out.println("show method called : "+obj);
    }
    void display(){
        System.out.println("display method called");
        show(this);
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.display();
    }
}