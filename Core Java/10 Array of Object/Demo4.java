// example showing the concept of static keyword

class Demo4{
    // static block
    static{
        System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("statement 3");
    }
    static{
        System.out.println("statement 2");
    }
}