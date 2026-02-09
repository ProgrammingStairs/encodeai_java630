// example showing the concept of predicate

import java.util.function.Predicate;
class Demo8{
    public static void main(String args[]){
        Predicate<Integer> lessThan = i -> i<=100;
        System.out.println("Result : "+lessThan.test(45));
        System.out.println("Result : "+lessThan.test(145));
        System.out.println("Result : "+lessThan.negate().test(45));

       Predicate<Integer> greaterThan = i -> i>100;
        System.out.println("Result : "+greaterThan.and(lessThan).test(45));
        System.out.println("Result : "+greaterThan.or(lessThan).test(45));
 
        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("Result : "+str.test("Andrew"));
        System.out.println("Result : "+str.test("ANDREW"));
        
    }
}