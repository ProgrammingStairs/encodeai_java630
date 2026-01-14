// example showing the concept of cloning | deep cloning

class Course implements Cloneable{
    String courseName;   
    Course(String courseName){
        this.courseName = courseName;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student implements Cloneable{
    String studName,address;
    Course course;
    Student(String studName,String address,Course course){
        this.studName = studName;
        this.address = address;
        this.course = course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student stud =  (Student)super.clone();
        stud.course = (Course)course.clone();
        return stud;
    }
}
class Demo15{
    public static void main(String args[]){
        try{
            Course course = new Course("Java Programming");
            Student s1 = new Student("Andrew Anderson","Indore",course);
            Student s2 = (Student)s1.clone();

            s2.course.courseName = "Mern Stack";

            System.out.println("s1 student details : ");
            System.out.println("StudentName : "+s1.studName);
            System.out.println("Address : "+s1.address);
            System.out.println("Course : "+s1.course.courseName);

            System.out.println("\ns2 student details : ");
            System.out.println("StudentName : "+s2.studName);
            System.out.println("Address : "+s2.address);
            System.out.println("Course : "+s2.course.courseName);

        }catch(CloneNotSupportedException e){
            System.out.println("Exception : "+e);
        }
    }
}