// Example showing the concept of Deadlock

class Pen{}
class Paper{}
class Demo14{
    public static void main(String args[]){
        Pen pn = new Pen();
        Paper pr = new Paper();
        new Thread(){
            @Override
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 1 uses Pen and Needs Paper");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pr){
                        System.out.println("Thread 1 uses Paper and Needs Pen");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 2 uses Paper and Needs Pen");                
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Exception : "+e);
                    }
                    synchronized(pn){
                        System.out.println("Thread 2 uses Pen and Needs Paper");
                    }
                }
            }
        }.start();

    }
}