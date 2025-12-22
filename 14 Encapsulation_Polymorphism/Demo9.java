// example showing the concept of method overriding

class RBI{
    double rate(){
        return 1.0;
    }
}
class SBI extends RBI{
    double rate(){
        return 1.78;
    }
}
class BOI extends RBI{
    double rate(){
        return 2.32;
    }
}
class PNB extends RBI{}

class Demo9{
    public static void main(String args[]){
        PNB pobj = new PNB();
        BOI bobj = new BOI();
        SBI sobj = new SBI();
        
        System.out.println("Rate provided by PNB : "+pobj.rate());
        System.out.println("Rate provided by BOI : "+bobj.rate());
        System.out.println("Rate provided by SBI : "+sobj.rate());
    }
}

