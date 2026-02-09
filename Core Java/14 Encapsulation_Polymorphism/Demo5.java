// example showing the concept of Constructor overloading

class Demo5{
    Demo5(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    Demo5(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        new Demo5(45,6.7);
        new Demo5(4.5,2);
    }
}

