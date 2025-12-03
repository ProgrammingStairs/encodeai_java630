// example

class Student{
    String name; // object variable | instance variable <--- multiple copies allocate
    public static void main(String args[]){
        Student stud1 = new Student();
        stud1.name = "Andrew Anderson";
        System.out.println("Name : "+stud1.name);    
        
        Student stud2 = new Student();
        System.out.println("Name : "+stud2.name);
        
        Student stud3 = new Student();
        System.out.println("Name : "+stud3.name);
        
        Student stud4 = new Student();
        System.out.println("Name : "+stud4.name);
    }
}