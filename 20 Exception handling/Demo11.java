// example showing the concept of custom exception

class MyException extends RuntimeException{
    MyException(String message){
        super(message);
    }
    void displayMessage(){
        throw new MyException("Custom Exception created by Unchecked Exception");
    }
}
class Demo11{
    public static void main(String args[]){
        MyException obj = new MyException("");
        try{
            obj.displayMessage();
        }catch(MyException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}