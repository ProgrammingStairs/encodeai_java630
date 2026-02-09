// example showing the concept of Multithreading
// creating thread by implementing Runnable interface

class Demo8{
    public static void main(String args[]){
    
    //    Runnable obj = new Runnable(){
    //         @Override 
    //         public void run(){
    //             System.out.println("run method executes");
    //         }
    //    };
    //    Thread th = new Thread(obj);
    //    th.start();


    //    Thread th = new Thread(new Runnable(){
    //         @Override 
    //         public void run(){
    //             System.out.println("run method executes");
    //         }
    //    });
    //    th.start();


    //    new Thread(new Runnable(){
    //         @Override 
    //         public void run(){
    //             System.out.println("run method executes");
    //         }
    //    }).start();


    // Thread obj = new Thread(){
    //        @Override 
    //         public void run(){
    //             System.out.println("run method executes");
    //         }
    // };
    // obj.start();


    // new Thread(){
    //        @Override 
    //         public void run(){
    //             System.out.println("run method executes");
    //         }
    // }.start();

    //    Runnable obj = ()->System.out.println("run method executes");
    //    Thread th = new Thread(obj);
    //    th.start();

    //    Runnable obj = ()->System.out.println("run method executes");
    //    new Thread(obj).start();


       new Thread(()->System.out.println("run method executes")).start();

    }
} 