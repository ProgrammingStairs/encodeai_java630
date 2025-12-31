// example showing the concept of object class

class Complex{
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo3{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        if(c1.equals(c2))
            System.out.println("Points to same memory location");    
        else 
            System.out.println("Do not points to same memory location");    
    }
}
