// example showing the concept of constructor

class Demo3{
    String name;
    int age;
    double weight;
    Demo3(){
         name = "Andrew Anderson";
         age = 78;
         weight = 56.67;
        System.out.println("no argument constructor called..!!");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
    }
}