// example showing the concept of method overloading

class Demo4{
    void greater(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.greater(45,6.7);
        obj.greater(4.5,2);
    }
}

