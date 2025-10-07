// program showing the concept of operators
// logical operator + Conditional operator

class Demo10{
    public static void main(String args[]){
        int a = 5,b = 50;
        String res1 = (a>10 && b<=100) ? "statement 1" : "statement 2"; 
        String res2 = (a>10 || b<=100) ? "statement 1" : "statement 2"; 
        System.out.println("Result : "+res1);
        System.out.println("Result : "+res2);
        System.out.println("Result : "+!true);
        System.out.println("Result : "+!!true);
    }
}

// condition ? expression 1 : expression 2;