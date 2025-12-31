// example showing the concept of interface

interface Showable{
    int age = 10;
    void getAge();
}
class Demo8{
    public static void main(String args[]){
        /*
        Showable obj = new Showable(){
            @Override 
            public void getAge(){
                System.out.println("Age : "+age);
            }
        };
        obj.getAge();
        */
        new Showable(){
            @Override 
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();

    }
}