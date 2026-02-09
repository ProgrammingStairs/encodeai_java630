// example showing the concept of custom exception

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class Bank{
    int bal;
    void setBalance(int bal){
        this.bal = bal;
    }
    void withDrawal() throws InsufficientBalanceException{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Withdrawal amount : ");
       int wamt = sc.nextInt();
       if(wamt>bal){
            throw new InsufficientBalanceException("Low Balance");
       }else{
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            this.bal = this.bal-wamt;
            System.out.println("Remaining Balance : "+bal);
       } 
    }
}
class Demo13{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Balance : ");
       int bal = sc.nextInt();

       Bank obj = new Bank();
       obj.setBalance(bal);
        try{
           obj.withDrawal();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e);
        }
    }
}