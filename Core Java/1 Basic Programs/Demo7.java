// program showing the concept of operators
// Relational operator

class Demo7{
    public static void main(String args[]){
        int a = 5,b = 2;
        boolean c;
        c = a < b;
        System.out.println(a+" < "+b+" = "+c);
        System.out.println(a+" < "+b+" = "+(a<b));

        c = a > b;
        System.out.println(a+" > "+b+" = "+c);

        c = a <= b;
        System.out.println(a+" <= "+b+" = "+c);

        c = a >= b;
        System.out.println(a+" >= "+b+" = "+c);

        c = a == b;
        System.out.println(a+" == "+b+" = "+c);

        c = a != b;
        System.out.println(a+" != "+b+" = "+c);

    }
}
