// example showing the concept of Multithreading

class Demo2{
    void display(){
        System.out.println(Thread.currentThread());
        System.out.println("Thread name : "+Thread.currentThread().getName());
        System.out.println("Thread priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display();
    }
} 