// example showing the concept of instance initiallizer block
/*
            initializer block
                |-- instance initializer block
                |-- static initializer block 

*/
class Demo9{
    int a;
    // instance initializer block
    {
        a=500;
        System.out.println("instance initializer block executes");
    }

    Demo9(){
        System.out.println("no argument constructor called");
    }
    Demo9(int a,int b,int c){
        System.out.println("parameterized constructor called");
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        new Demo9(1,2,3);
        System.out.println("value of a : "+obj.a);
    }
}

