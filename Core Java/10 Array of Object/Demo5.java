// example showing the concept of static keyword

class Demo{
    // static block
    static{
        System.out.println("statement 1");
    }
}
class Demo5{
    public static void main(String args[]){
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
    }
}