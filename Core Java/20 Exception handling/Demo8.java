// exaple showing the concept of exception handling

@SuppressWarnings("removal")
class Demo8{
    public static void main(String args[]){
        try{
            Object obj = new Integer(100);
            String s = (String)obj;
        }
        catch(ClassCastException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}