// example showing the concept of constructor

class Demo1{
    Demo1(){
        System.out.println("no argument constructor called..!!");
    }
    public static void main(String args[]){
        new Demo1();
        new Demo1();
        new Demo1();
        new Demo1();
    }
}