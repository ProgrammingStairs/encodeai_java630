// example showing the concept of Multithreading

class Demo6 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                System.out.println("i : "+i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo6 obj1 = new Demo6();
        Demo6 obj2 = new Demo6();
        obj1.start();
            try{
                // obj1.join();
                obj1.join(5000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        obj2.start();
    }
} 