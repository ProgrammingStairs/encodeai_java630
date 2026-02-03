// example showing the conept of string

class Demo1{
    public static void main(String args[]){
        // by string literal
        String str = "Hello User";
        System.out.println("str : "+str);

        // by new Keyword 
        String str1 = new String("Welcome User");
        System.out.println("str1 : "+str1);

        char ch[] = {'a','b','c','d','e'};
        String str2 = new String(ch);
        System.out.println("str2 : "+str2);

        byte bt[] = {65,66,67,68,69};
        String str3 = new String(bt);
        System.out.println("str3 : "+str3);

    }
}