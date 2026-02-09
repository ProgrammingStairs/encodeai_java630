// exaple showing the concept of exception handling

class Demo6{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        String str = "Jelllo User";
        try{
            System.out.println("arr[2] : "+arr[2]);
            System.out.println("str.charAt(20) : "+str.charAt(20));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e.getMessage());
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e.getMessage());
        }
        finally{
            System.out.println("Finally block executes..");
        }
    }
}