// example showing the concept of Multithreading

class Demo4 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread name : "+Thread.currentThread().getName()+"\tThread priority : "+Thread.currentThread().getPriority()+" \tThread Id : "+Thread.currentThread().getId());
    }
    public static void main(String args[]){
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();
        Demo4 obj3 = new Demo4();
        obj1.setName("Andrew");
        obj2.setName("Peter");
        obj3.setName("Parker");
        
        obj1.setPriority(Thread.NORM_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        
        obj1.start();
        obj2.start();
        obj3.start();
    }
} 