// example showing the concept of Multithreading

class Demo3 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread());
        System.out.println("Thread name : "+Thread.currentThread().getName());
        System.out.println("Thread priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.start();
    }
} 