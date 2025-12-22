// example showing the concept of inheritance

import java.util.Scanner;
class Area{
    int l,b;
    Area(int l,int b){
        this.l=l;
        this.b=b;
    }
    int getArea(){
        return l*b;
    }
}
class Volume extends Area{
    int h;
    Volume(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    int getVolume(){
        return getArea()*h;
    }
}
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b and h : ");
        int l= sc.nextInt();
        int b= sc.nextInt();
        int h= sc.nextInt();
        
        Volume vobj = new Volume(l,b,h);
        System.out.println("Area : "+vobj.getArea());
        System.out.println("Volume : "+vobj.getVolume());
    }
}