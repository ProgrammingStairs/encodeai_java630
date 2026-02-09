// exaple showing the concept of exception handling

class Demo9{
    public static void main(String args[]){
       // class Not found exception is a checked exception
        try{
           Class.forName("Demo8");
            System.out.println("class Found");
        }
        catch(ClassNotFoundException e){
            System.out.println("class Not Found");
            System.out.println("Exception : "+e.getMessage());
        }
    }
}