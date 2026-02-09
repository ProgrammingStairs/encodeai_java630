// example showing the concept of Multithreading

class Demo1{
    public static void main(String args[]){
        System.out.println(Thread.currentThread());
        System.out.println("Thread name : "+Thread.currentThread().getName());
        System.out.println("Thread priority : "+Thread.currentThread().getPriority());
    }
} 