// example showing the concept of Abstract class 

abstract class RBI{
    abstract double rate();
}
class SBI extends RBI{
    @Override
    double rate(){
        return 1.78;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 2.32;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 3.21;
    }
}

class Demo2{
    public static void main(String args[]){
        RBI obj;
        obj = new PNB();
        System.out.println("Rate provided by PNB : "+obj.rate());
        
        obj = new BOI();
        System.out.println("Rate provided by BOI : "+obj.rate());
        
        obj = new SBI();
        System.out.println("Rate provided by SBI : "+obj.rate());
    }
}

