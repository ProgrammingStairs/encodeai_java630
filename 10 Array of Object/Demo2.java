// Final keyword
/*
    Final Keyword : 
        a. variable -> to make variable constant 
        b. method -> final method cannot be overridden
        c. class -> final class cannot be extended
*/ 

class Demo2{
    int a;
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        System.out.println("value of a : "+obj.a);
    }
}