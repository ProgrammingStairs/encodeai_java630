// program showing the concept of operators
// increment | decrement operator

class Demo9{
    public static void main(String args[]){
        int a = 5,b = 6,c;
        //   5 + 7 + 6        
//        c = a++ + ++b + a--;
//        System.out.println("Result : "+c);
    //      5   + 5 + 4 + 2 - 4 + 4
        // c = a-- + --b + a-- + --a - --b + b++;
        // System.out.println("Result : "+c);

//          5  -  4 + 6 - 7 - 7 + 5 + 8
        c = --b - --b + ++a - ++a - a++ + ++b + a--;
        System.out.println("Result : "+c);

    }
}
