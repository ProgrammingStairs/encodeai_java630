// example showing the concept of method overloading

class Demo6{
    public static void main(int num){
        System.out.println("Number : "+num);
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.main(1000);
    }
}

