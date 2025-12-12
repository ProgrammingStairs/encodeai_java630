// example showing the concept of static keyword

// class Demo7{
//     static int count = 100;
//     public static void main(String args[]){
//         System.out.println("count : "+Demo7.count);
//         System.out.println("count : "+count);
//     }
// }


// class Demo{
//     static int count = 100;
// }
// class Demo7{
//     public static void main(String args[]){
//         System.out.println("count : "+Demo.count);
//     }
// }


// class Demo7{
//     static void display(){
//         System.out.println("static method called");
//     }
//     public static void main(String args[]){
//         Demo7.display();
//         display();
//     }
// }

class Demo{
    static void display(){
        System.out.println("static method called");
    }
}
class Demo7{
    public static void main(String args[]){
        Demo.display();
    }
}