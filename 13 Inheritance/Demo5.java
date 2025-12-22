// example showing the concept of inheritance

import java.util.Scanner;
class Person{
    int age;
    String name;

    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Name : ");
        name  = sc.nextLine();
        System.out.println("Enter Age : ");
        age  = sc.nextInt();
    }
    void showDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String course;

    void getStudDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Course Name : ");
        course  = sc.nextLine();
        System.out.println("Enter Fees : ");
        fees  = sc.nextInt();
    }
    void showStudDetails(){
        showDetails();
        System.out.println("\nCourse Name : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String design;

    void getEmpDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Designation : ");
        design  = sc.nextLine();
        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmpDetails(){
        showDetails();
        System.out.println("\nDesignation : "+design);
        System.out.println("Salary : "+salary);
    }
}

class Demo5{
    public static void main(String args[]){
        Student sobj = new Student();
        Employee eobj = new Employee();
            sobj.getStudDetails();
            eobj.getEmpDetails();

            sobj.showStudDetails();
            eobj.showEmpDetails();
    }
}