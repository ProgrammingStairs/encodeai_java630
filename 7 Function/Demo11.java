// example

class Student{
    // here String name is data member
    String name; // object variable | instance variable <--- multiple copies allocate
    
    // here printName is member method
    void printName(){ // <---------- instance method | object method
        System.out.println("Name : "+name);
        System.out.println(this); // default string representation of that specific object
        System.out.println(this.name); // default string representation of that specific object
    }
    public static void main(String args[]){
        Student stud1 = new Student();
        stud1.name = "Andrew Anderson";
        stud1.printName();    
    }
}