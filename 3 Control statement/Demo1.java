// example showing the concept of if statement

class Demo1{
    public static void main(String args[]){

        if(false){
            System.out.println("statement 1");
        }

        if(true)
            System.out.println("statement 2");
        
        if(5>2)
            System.out.println("statement 3");
        
        if(!true)
            System.out.println("statement 4");

        if(!!true)
            System.out.println("statement 5");

        int a = 5,b = 2;
        if(a>b)
            System.out.println(a+" is greater");

        if(b>a)
            System.out.println(b+" is greater");

        if(a==b)
            System.out.println("Both are equal");

    }
}