// example showing the conept of string

class Demo10{
    public static void main(String args[]){
      String str = "Hello User How Are You ?";  
      String words[] = str.split(" ");
      for(String word : words){
        System.out.println(word);
      }

      String str1 = String.join("-","04","02","2026");  
      System.out.println("Date : "+str1);

      String str2 = "Bearer qwertyui1234567qwertyu";
      System.out.println("Token : "+str2.substring(7));  
      System.out.println("Token : "+str2.substring(7,14));  

      String str3 = "             hello             Andrew        ";
      System.out.println("Trim : "+str3.trim()); 

      str1.concat(" Wednesday");
      System.out.println("str1 : "+str1); 
      System.out.println("concat : "+str1.concat(" Wednesday")); 
 
      System.out.println("startsWith : "+str.startsWith("Hello")); 
      System.out.println("startsWith : "+str.startsWith("HELLO")); 
      System.out.println("endsWith : "+str.endsWith("Hello")); 
    
      String str4 = "Andrew";
      System.out.println("equals : "+str4.equals("Andrew")); 
      System.out.println("equals : "+str4.equals("ANDREW")); 
      System.out.println("equalsIgnoreCase : "+str4.equalsIgnoreCase("ANDREW")); 
      
      System.out.println("charAt(2) : "+str.charAt(2)); 
      System.out.println("uppercase : "+str.toUpperCase()); 
      System.out.println("lowercase : "+str.toLowerCase()); 
      System.out.println("contains : "+str.contains("Hello")); 
      
    } 
}