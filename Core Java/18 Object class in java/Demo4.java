// example showing the concept of object class

class Demo4{
    public static void main(String args[]){
//        Object obj = new String();
        Demo4 obj = new Demo4();
        Class c = obj.getClass();
        System.out.println("signature : "+c);
        System.out.println("class name : "+c.getName());
    }
}
