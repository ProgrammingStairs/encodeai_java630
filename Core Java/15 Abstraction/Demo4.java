// example showing the concept of Abstract class 

import java.util.Scanner;
abstract class AbstractSeries{
    abstract void series(int n,int m);
}
class EvenSeries extends AbstractSeries{
    @Override
    void series(int n,int m){
        System.out.println("Even Series");
        for(int i=n;i<=m;i++){
            if(i%2==0)
                System.out.print(i+"\t");
        }
    }
}
class OddSeries extends AbstractSeries{
    @Override
    void series(int n,int m){
        System.out.println("\nOdd Series");
        for(int i=n;i<=m;i++){
            if(i%2!=0)
                System.out.print(i+"\t");
        }
    }
}

class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final limit : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        EvenSeries eobj = new EvenSeries();
        eobj.series(n,m);

        OddSeries oobj = new OddSeries();
        oobj.series(n,m);

    }
}

