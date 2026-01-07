
interface Showable{
    int age = 18;
    void getAge();
}
class Demo1{
    public static void main(String args[]){
        Showable obj = ()->System.out.println("Age : "+Showable.age);
        obj.getAge();
    }
}