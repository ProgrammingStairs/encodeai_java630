// example showing the concept of switch control statement
// error : duplicate case label in case of case 'a' and case 97
class Demo12{
    public static void main(String args[]){
        char ch='a';
        switch(97){
            case 'a' : System.out.println("statement 1");
                        break;
            // case 97 : System.out.println("statement 2");
            //             break;
            default : System.out.println("Invalid selection");
                        break;
        }        
   }
}