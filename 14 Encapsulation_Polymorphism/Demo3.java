// example showing the concept of method overloading

class Demo3{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(int a,int b,int c){
        int res = a>b ? (a>c?a:c) : (b>c?b:c);
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.greater(45,67);
        obj.greater(45,6,7);
    }
}


