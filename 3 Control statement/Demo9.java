// example showing the concept of else if ladder
/*
    ASCII value : American Standard Code for Infromation Interchange
    A = 65   a = 97     0 = 48
    B = 66   b = 98     1 = 49
    |   |    |   |      |    |
    Z = 90   z = 122    9 = 57
*/
import java.util.Scanner;
class Demo9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char ch = sc.next().charAt(0);
        
        if(ch>=65 && ch<=90)
            System.out.println("Character is in Uppercase");
        
        else if(ch>='a' && ch<='z')
            System.out.println("Character is in lowercase");
        
        else if(ch>=48 && ch<='9')
            System.out.println("Character is a digit");
        
        else 
            System.out.println("Invalid character");
   }
}