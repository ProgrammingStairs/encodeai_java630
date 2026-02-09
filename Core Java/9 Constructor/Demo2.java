// example showing the concept of constructor

class Demo2{
    Demo2(){
        String name = "Andrew Anderson";
        int age = 78;
        double weight = 56.67;
        System.out.println("no argument constructor called..!!");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
    }
}