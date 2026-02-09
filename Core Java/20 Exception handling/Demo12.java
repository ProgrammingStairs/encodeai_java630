// example showing the concept of custom exception

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
    void displayMessage() throws MyException{
        throw new MyException("Custom Exception created by Checked Exception");
    }
}
class Demo12{
    public static void main(String args[]){
        MyException obj = new MyException("");
        try{
            obj.displayMessage();
        }catch(MyException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}