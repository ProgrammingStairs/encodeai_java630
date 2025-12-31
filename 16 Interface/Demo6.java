// example showing the concept of interface
/*
interface Showable{
    int age = 10;
}
class Demo6{
    public static void main(String args[]){
        System.out.println("Age : "+Showable.age);
    }
}
*/

/*
interface Showable{
    int age = 10;
}
class Demo6 implements Showable{
    public static void main(String args[]){
        System.out.println("Age : "+age);
    }
}
*/ 

interface Showable{
    int age = 10;
}
interface Movable{
    int age = 32;
}
class Demo6 implements Showable,Movable{
    public static void main(String args[]){
        System.out.println("Age : "+Showable.age);
        System.out.println("Age : "+Movable.age);
    }
}