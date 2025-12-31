// example showing the concept of interface

interface Showable{
    int age = 10;
    void getAge();
}
class GetAge implements  Showable{
    @Override 
    public void getAge(){
        System.out.println("Age : "+age);
    }
}
class Demo7{
    public static void main(String args[]){
       GetAge obj = new GetAge();
       obj.getAge();
    }
}