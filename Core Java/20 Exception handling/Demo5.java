// exaple showing the concept of exception handling

class Demo5{
    static String s;
    public static void main(String args[]){
        try{
            System.out.println("Length : "+s.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}