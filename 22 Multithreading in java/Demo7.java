// example showing the concept of Multithreading
// creating thread by implementing Runnable interface

class Demo7 implements Runnable{
    @Override 
    public void run(){
        System.out.println("run method executes");
    }
    public static void main(String args[]){
        // Demo7 obj = new Demo7();
        // Thread th = new Thread(obj);

        // Thread th = new Thread(new Demo7());
        // th.start();

        new Thread(new Demo7()).start();
    }
} 