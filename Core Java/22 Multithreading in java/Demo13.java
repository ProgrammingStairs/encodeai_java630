// Example showing the concept of co-operation of thread | Inter thread communication | wait, notify, notifyAll

class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    public synchronized void withDraw(int wamt){
        try{
            if(wamt>bal){
                System.out.println("Low Balance..!!");
                System.out.println("Wait for deposit....");
                wait();
            }
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            this.bal=this.bal-wamt;
            System.out.println("Remaining Balance : "+bal);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
    }
    public synchronized void deposit(int damt){
            System.out.println("Going to deposite..");
            this.bal = this.bal+damt;
            System.out.println("Deposited completed");
            notify();            
    }
    
}
class Demo13{
    public static void main(String args[]){
        Customer cobj = new Customer(5000);
        new Thread(){
            @Override
            public void run(){
                cobj.withDraw(7600);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                cobj.deposit(10000);
            }
        }.start();
    }
}